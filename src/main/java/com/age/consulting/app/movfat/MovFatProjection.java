package com.age.consulting.app.movfat;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovFatProjection extends MovFatBase {

    public MovFatProjection(MovFat movFat) {
        super(movFat);
    }

    public MovFatProjection(String data, String razaoSocial, String cliente, LocalDate vencimento,
            String nf, String numNf, String numTit, LocalDate dtPg,
            String status, BigDecimal comissao) {
        super(data, razaoSocial, cliente, vencimento, nf, numNf, numTit, dtPg, status, comissao);
    }
}
