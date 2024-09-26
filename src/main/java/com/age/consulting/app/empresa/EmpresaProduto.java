package com.age.consulting.app.empresa;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBEMPRESAPRODUTO")
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaProduto {

    @Id
    @Column(name = "CODIGOEMPRESA", nullable = false)
    private Integer codigoEmpresa;

    @Column(name = "CODIGOPRODUTO", nullable = false)
    private Integer codigoProduto;

    @Column(name = "DUA")
    private LocalDate dua;

    @Column(name = "SITUACAO", length = 1)
    private String situacao;

    @Column(name = "DVL")
    private LocalDate dvl;

    @Column(name = "DVG", nullable = false)
    private LocalDate dvg;

    @Column(name = "IDUA")
    private Integer idua;

    @Column(name = "VALORFATURAMENTO")
    private Float valorFaturamento;

    @Column(name = "CODIGOEMPRESAPROVEDORA")
    private Integer codigoEmpresaProvedora;

    @Column(name = "CODIGOTPFATURAMENTO")
    private Integer codigoTpFaturamento;

    @Column(name = "CODIGOINDICEREAJUSTE")
    private Integer codigoIndiceReajuste;

    @Column(name = "MESREAJUSTE")
    private Integer mesReajuste;

    @Column(name = "DIAVENCIMENTO")
    private Integer diaVencimento;

    @Column(name = "MESATUALOUSEGUINTE", length = 1)
    private String mesAtualOuSeguinte;

    @Column(name = "CODIGOEMPRESAFATURADORA")
    private Integer codigoEmpresaFaturadora;

    @Column(name = "AGRUPAPRODUTOS", length = 1)
    private String agrupaProdutos;

    @Column(name = "FATURAPORUNIDADE", length = 1)
    private String faturaPorUnidade;

    @Column(name = "EMITENF", length = 1)
    private String emiteNf;
}
