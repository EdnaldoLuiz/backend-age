package com.age.consulting.app.movfat.relatorio;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.age.consulting.app.movfat.MovFatRequestDTO;

public interface RelatorioStrategy {

    ResponseEntity<?> gerarRelatorio(MovFatRequestDTO requestDTO, Page<MovFatRelatorioDTO> processos);
    
}
