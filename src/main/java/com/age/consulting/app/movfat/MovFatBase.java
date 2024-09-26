package com.age.consulting.app.movfat;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class MovFatBase {
    
    protected String data;
    protected String razaoSocial;
    protected String cliente;

    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate vencimento;

    protected String nf;
    protected String numNf;
    protected String numTit;

    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate dtPg;

    protected String status;
    protected BigDecimal comissao;

    public MovFatBase(MovFat movFat) {
        this.data = movFat.getMesAno();
        this.razaoSocial = movFat.getRazaoSocial();
        this.cliente = movFat.getCliente();
        this.vencimento = movFat.getVencimento();
        this.nf = movFat.getNf();
        this.numNf = movFat.getNumNF();
        this.numTit = movFat.getNumTit();
        this.dtPg = movFat.getDtpg();
        this.status = movFat.getStatus();
        this.comissao = movFat.getComissao();
    }

    public MovFatBase(String data, String razaoSocial, String cliente, LocalDate vencimento,
                      String nf, String numNf, String numTit, LocalDate dtPg,
                      String status, BigDecimal comissao) {
        this.data = data;
        this.razaoSocial = razaoSocial;
        this.cliente = cliente;
        this.vencimento = vencimento;
        this.nf = nf;
        this.numNf = numNf;
        this.numTit = numTit;
        this.dtPg = dtPg;
        this.status = status;
        this.comissao = comissao;
    }
}
