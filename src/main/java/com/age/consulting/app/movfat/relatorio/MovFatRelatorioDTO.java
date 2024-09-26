package com.age.consulting.app.movfat.relatorio;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.age.consulting.app.movfat.MovFat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovFatRelatorioDTO  {

    private String mesAno;
    private String contrato;
    private String razaoSocial;
    private String cliente;
    private String tipo;
    private String empresa;
    private String banco;

    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
    private LocalDate vencimento;
    private BigDecimal mensalidade;
    private BigDecimal decimoTerceiro;
    private BigDecimal extra;
    private BigDecimal retencao;
    private BigDecimal total;
    private String nf;
    private String numNF;
    private String numTit;

    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
    private LocalDate dtPg;
    private BigDecimal vlPg;
    private String status;
    private String observacao;
    private BigDecimal comissao;
    private BigDecimal valorComissao;
    private Integer diaPg;
    private String anoMesPag;
    private String compImposto;

    public MovFatRelatorioDTO(MovFat movFat) {
        this.mesAno = movFat.getMesAno();
        this.contrato = movFat.getContrato();
        this.razaoSocial = movFat.getRazaoSocial();
        this.cliente = movFat.getCliente();
        this.tipo = movFat.getTipo();
        this.empresa = movFat.getEmpresa();
        this.banco = movFat.getBanco();
        this.vencimento = movFat.getVencimento();
        this.mensalidade = movFat.getMensalidade();
        this.decimoTerceiro = movFat.getDecimoTerceiro();
        this.extra = movFat.getExtra();
        this.retencao = movFat.getRetencao();
        this.total = movFat.getTotal();
        this.nf = movFat.getNf();
        this.numNF = movFat.getNumNF();
        this.numTit = movFat.getNumTit();
        this.dtPg = movFat.getDtpg();
        this.vlPg = movFat.getVlpg();
        this.status = movFat.getStatus();
        this.observacao = movFat.getObservacao();
        this.comissao = movFat.getComissao();
        this.valorComissao = movFat.getValorComissao();
        this.diaPg = movFat.getDiaPg();
        this.anoMesPag = movFat.getAnoMesPag();
        this.compImposto = movFat.getCompImposto();
    }
}
