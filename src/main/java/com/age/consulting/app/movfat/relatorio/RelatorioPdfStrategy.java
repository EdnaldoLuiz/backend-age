package com.age.consulting.app.movfat.relatorio;

import java.io.ByteArrayOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.age.consulting.app.movfat.MovFatRequestDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RelatorioPdfStrategy implements RelatorioStrategy {

    private final TemplateEngine templateEngine;

    public RelatorioPdfStrategy(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    @Override
    public ResponseEntity<?> gerarRelatorio(MovFatRequestDTO requestDTO, Page<MovFatRelatorioDTO> processos) {
        log.info("Gerando relatório PDF...");
        Map<String, Object> contextVariables = prepararVariaveisDeContexto(processos);

        String htmlContent = gerarConteudoHtml(contextVariables);

        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            ITextRenderer renderer = new ITextRenderer();
            renderer.setDocumentFromString(htmlContent);
            renderer.layout();
            renderer.createPDF(outputStream, false);
            renderer.finishPDF();

            String dataAtual = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            String nomeArquivo = String.format("relatorio_movfat_%s.pdf", dataAtual);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDispositionFormData("attachment", nomeArquivo);

            return ResponseEntity.ok().headers(headers).body(outputStream.toByteArray());
        } catch (Exception e) {
            log.error("Erro ao gerar PDF", e);
            return ResponseEntity.status(500).body("Erro ao gerar PDF");
        }
    }

    private Map<String, Object> prepararVariaveisDeContexto(Page<MovFatRelatorioDTO> processos) {
        Map<String, Object> contextVariables = new HashMap<>();
        String usuarioEmail = "luiz@gmail.com"; 
        String usuarioNome = "Ednaldo Luiz";
        String dataHoraEmissao = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        RelatorioDTO relatorioDTO = new RelatorioDTO();
        relatorioDTO.setNomeEmpresa("AGE Consulting");
        relatorioDTO.setCnpjEmpresa("00.000.000/0000-00");
        relatorioDTO.setEnderecoEmpresa("Rua dos Bobos, 0");
        relatorioDTO.setCidadeEmpresa("São Paulo");
        relatorioDTO.setCepEmpresa("00000-000");
        relatorioDTO.setEmailEmpresa("");
        relatorioDTO.setDataHoraEmissao(dataHoraEmissao);
        relatorioDTO.setUsuarioNome(usuarioNome);
        relatorioDTO.setUsuarioEmail(usuarioEmail);

        contextVariables.put("processos", processos);
        contextVariables.put("relatorio", relatorioDTO);

        return contextVariables;
    }

    private String gerarConteudoHtml(Map<String, Object> contextVariables) {
        Context context = new Context();
        context.setVariables(contextVariables);
        return templateEngine.process("relatorio-pdf", context);
    }
}
