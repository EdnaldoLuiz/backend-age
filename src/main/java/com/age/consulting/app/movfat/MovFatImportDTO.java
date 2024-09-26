package com.age.consulting.app.movfat;

import java.math.BigDecimal;
import java.time.LocalDate;

public record MovFatImportDTO(

    String mesAno,
    String contrato,
    String razaoSocial,
    String cliente,
    String tipo,
    String empresa,
    String banco,
    LocalDate vencimento,
    BigDecimal mensalidade,
    BigDecimal decimoTerceiro,
    BigDecimal extra,
    BigDecimal retencao,
    BigDecimal total,
    String nf,
    String numNF,
    String numTit,
    LocalDate dtpg,
    BigDecimal vlpg,
    String status,
    String observacao,
    BigDecimal comissao,
    BigDecimal valorComissao,
    Integer diaPg,
    String anoMesPag,
    String compImposto
        
) {}
