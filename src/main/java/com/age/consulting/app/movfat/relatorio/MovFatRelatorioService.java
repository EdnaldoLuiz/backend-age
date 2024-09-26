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

import com.age.consulting.app.enums.RelatorioType;
import com.age.consulting.app.movfat.MovFatBase;
import com.age.consulting.app.movfat.MovFatProjection;
import com.age.consulting.app.movfat.MovFatRequestDTO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class MovFatRelatorioService {

    private final RelatorioFactory relatorioFactory;

    public ResponseEntity<?> gerarRelatorio(MovFatRequestDTO requestDTO, Page<MovFatRelatorioDTO> processos, RelatorioType tipoRelatorio) {
        RelatorioStrategy strategy = relatorioFactory.getStrategy(tipoRelatorio);
        return strategy.gerarRelatorio(requestDTO, processos);
    }
}
