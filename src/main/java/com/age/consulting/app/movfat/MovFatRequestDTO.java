package com.age.consulting.app.movfat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovFatRequestDTO {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dataInicio;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dataFim;

    private List<String> razaoSocial;
    private List<String> cliente;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate vencimentoInicio;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate vencimentoFim;

    private List<String> numNF;
    private List<String> numTit;
  
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dtpgInicio;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dtpgFim;

    private List<String> status;
    private List<BigDecimal> comissao;

    private String search;
    
}
