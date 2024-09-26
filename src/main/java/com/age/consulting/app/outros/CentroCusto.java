package com.age.consulting.app.outros;

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
@Table(name = "TBCENTROCUSTO")
@NoArgsConstructor
@AllArgsConstructor
public class CentroCusto {
    @Id
    @Column(name = "CODIGOEMPRESA", nullable = false)
    private Integer codigoEmpresa;

    @Column(name = "CODIGOCCUSTO", length = 8, nullable = false)
    private String codigoCCusto;

    @Column(name = "DESCRICAOCCUSTO", length = 50)
    private String descricaoCCusto;

    @Column(name = "TPLANCAMENTO", length = 1)
    private String tpLancamento;

    @Column(name = "TIPO", length = 1)
    private String tipo;

    @Column(name = "CCSUPERIOR", length = 8)
    private String ccSuperior;

    @Column(name = "SITUACAO", length = 1)
    private String situacao;
}
