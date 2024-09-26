package com.age.consulting.app.movfat.relatorio;

import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.age.consulting.app.movfat.MovFatRequestDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RelatorioXlsxStrategy implements RelatorioStrategy {

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public ResponseEntity<?> gerarRelatorio(MovFatRequestDTO requestDTO, Page<MovFatRelatorioDTO> processos) {
        log.info("Gerando relatório XLSX...");

        try (Workbook workbook = new XSSFWorkbook();
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {

            // Criação da planilha
            Sheet sheet = workbook.createSheet("Relatório MovFat");

            // Cabeçalhos das colunas
            String[] colunas = {
                "Mês/Ano", "Contrato", "Razão Social", "Cliente", "Tipo", "Empresa", "Banco", 
                "Vencimento", "Mensalidade", "13º", "Extra", "Retenção", "Total", "NF", "Num NF", 
                "Num TIT", "Dt Pagamento", "Valor Pagamento", "Status", "Observação", 
                "Comissão", "Valor Comissão", "Dia Pg", "Ano/Mês Pg", "Comp Imposto"
            };

            // Adicionando os cabeçalhos
            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < colunas.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(colunas[i]);
            }

            // Preenchendo a planilha com os dados de cada `MovFatRelatorioDTO`
            int rowNum = 1;
            for (MovFatRelatorioDTO processo : processos.getContent()) {
                Row row = sheet.createRow(rowNum++);
                preencherLinha(row, processo);
            }

            // Ajuste automático de todas as colunas
            for (int i = 0; i < colunas.length; i++) {
                sheet.autoSizeColumn(i);
            }

            // Escrevendo o conteúdo no OutputStream
            workbook.write(outputStream);

            String nomeArquivo = "relatorio_movfat.xlsx";

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.setContentDispositionFormData("attachment", nomeArquivo);

            return ResponseEntity.ok().headers(headers).body(outputStream.toByteArray());

        } catch (Exception e) {
            log.error("Erro ao gerar XLSX", e);
            return ResponseEntity.status(500).body("Erro ao gerar XLSX");
        }
    }

    // Função auxiliar para preencher cada linha com os dados de `MovFatRelatorioDTO`
    private void preencherLinha(Row row, MovFatRelatorioDTO dto) {
        row.createCell(0).setCellValue(dto.getMesAno());
        row.createCell(1).setCellValue(dto.getContrato());
        row.createCell(2).setCellValue(dto.getRazaoSocial());
        row.createCell(3).setCellValue(dto.getCliente());
        row.createCell(4).setCellValue(dto.getTipo());
        row.createCell(5).setCellValue(dto.getEmpresa());
        row.createCell(6).setCellValue(dto.getBanco());
        
        // Formatando as datas e valores
        row.createCell(7).setCellValue(dto.getVencimento() != null ? dto.getVencimento().format(dateFormatter) : "");
        row.createCell(8).setCellValue(formatarValor(dto.getMensalidade()));
        row.createCell(9).setCellValue(formatarValor(dto.getDecimoTerceiro()));
        row.createCell(10).setCellValue(formatarValor(dto.getExtra()));
        row.createCell(11).setCellValue(formatarValor(dto.getRetencao()));
        row.createCell(12).setCellValue(formatarValor(dto.getTotal()));
        row.createCell(13).setCellValue(dto.getNf());
        row.createCell(14).setCellValue(dto.getNumNF());
        row.createCell(15).setCellValue(dto.getNumTit());
        row.createCell(16).setCellValue(dto.getDtPg() != null ? dto.getDtPg().format(dateFormatter) : "");
        row.createCell(17).setCellValue(formatarValor(dto.getVlPg()));
        row.createCell(18).setCellValue(dto.getStatus());
        row.createCell(19).setCellValue(dto.getObservacao());
        row.createCell(20).setCellValue(formatarValor(dto.getComissao()));
        row.createCell(21).setCellValue(formatarValor(dto.getValorComissao()));
        row.createCell(22).setCellValue(dto.getDiaPg() != null ? dto.getDiaPg().toString() : "");
        row.createCell(23).setCellValue(dto.getAnoMesPag());
        row.createCell(24).setCellValue(dto.getCompImposto());
    }

    private String formatarValor(BigDecimal valor) {
        return valor != null ? valor.toString() : "";
    }
}
