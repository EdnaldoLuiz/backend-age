package com.age.consulting.app.movfat;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBMOVFAT")
@NoArgsConstructor
@AllArgsConstructor
public class MovFat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "mes_ano", length = 6, nullable = false)
    private String mesAno;

    @Column(name = "contrato", length = 50)
    private String contrato;

    @Column(name = "razao_social", length = 255)
    private String razaoSocial;

    @Column(name = "cliente", length = 255)
    private String cliente;

    @Column(name = "tipo", length = 50)
    private String tipo;

    @Column(name = "empresa", length = 255)
    private String empresa;

    @Column(name = "banco", length = 50)
    private String banco;

    @Column(name = "vencimento")
    private LocalDate vencimento;

    @Column(name = "mensalidade", precision = 10, scale = 2)
    private BigDecimal mensalidade;

    @Column(name = "decimo_terceiro", precision = 10, scale = 2)
    private BigDecimal decimoTerceiro;

    @Column(name = "extra", precision = 10, scale = 2)
    private BigDecimal extra;

    @Column(name = "retencao", precision = 10, scale = 2)
    private BigDecimal retencao;

    @Column(name = "total", precision = 10, scale = 2)
    private BigDecimal total;

    @Column(name = "nf", length = 20)
    private String nf;

    @Column(name = "num_nf", length = 20)
    private String numNF;

    @Column(name = "num_tit", length = 20)
    private String numTit;

    @Column(name = "dtpg")
    private LocalDate dtpg;

    @Column(name = "vlpg", precision = 10, scale = 2)
    private BigDecimal vlpg;

    @Column(name = "status", length = 50)
    private String status;

    @Column(name = "observacao", columnDefinition = "TEXT")
    private String observacao;

    @Column(name = "comissao", precision = 10, scale = 2)
    private BigDecimal comissao;

    @Column(name = "valor_comissao", precision = 10, scale = 2)
    private BigDecimal valorComissao;

    @Column(name = "dia_pg")
    private Integer diaPg;

    @Column(name = "ano_mes_pag", length = 6)
    private String anoMesPag;

    @Column(name = "comp_imposto", length = 50)
    private String compImposto;

    public MovFat(@Valid MovFatImportDTO importDTO) {
        this.mesAno = importDTO.mesAno();
        this.contrato = importDTO.contrato();
        this.razaoSocial = importDTO.razaoSocial();
        this.cliente = importDTO.cliente();
        this.tipo = importDTO.tipo();
        this.empresa = importDTO.empresa();
        this.banco = importDTO.banco();
        this.vencimento = importDTO.vencimento();
        this.mensalidade = importDTO.mensalidade();
        this.decimoTerceiro = importDTO.decimoTerceiro();
        this.extra = importDTO.extra();
        this.retencao = importDTO.retencao();
        this.total = importDTO.total();
        this.nf = importDTO.nf();
        this.numNF = importDTO.numNF();
        this.numTit = importDTO.numTit();
        this.dtpg = importDTO.dtpg();
        this.vlpg = importDTO.vlpg();
        this.status = importDTO.status();
        this.observacao = importDTO.observacao();
        this.comissao = importDTO.comissao();
        this.valorComissao = importDTO.valorComissao();
        this.diaPg = importDTO.diaPg();
        this.anoMesPag = importDTO.anoMesPag();
        this.compImposto = importDTO.compImposto();
    }
}
