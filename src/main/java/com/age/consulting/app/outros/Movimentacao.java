package com.age.consulting.app.outros;

import java.math.BigDecimal;
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
@Table(name = "TBMOVIMENTACAO")
@NoArgsConstructor
@AllArgsConstructor
public class Movimentacao {

    @Id
    @Column(name = "NUMLANCTO", nullable = false)
    private Integer numLancto;

    @Column(name = "IDUSUARIOLANCTO")
    private Integer idUsuarioLancto;

    @Column(name = "CODIGOEMPRESA")
    private Integer codigoEmpresa;

    @Column(name = "CODIGOSITUACAO")
    private Integer codigoSituacao;

    @Column(name = "DATALANCTO")
    private LocalDate dataLancto;

    @Column(name = "CODIGOCCUSTO", length = 8)
    private String codigoCCusto;

    @Column(name = "CODIGOPLANO", length = 10)
    private String codigoPlano;

    @Column(name = "CODIGOFORNECEDOR")
    private Integer codigoFornecedor;

    @Column(name = "OBSERVACAO", length = 200)
    private String observacao;

    @Column(name = "DOCUMENTO", length = 20)
    private String documento;

    @Column(name = "DATAMOVIMENTO")
    private LocalDate dataMovimento;

    @Column(name = "VALOR")
    private BigDecimal valor;

    @Column(name = "IDUA")
    private Integer idua;

    @Column(name = "DUA")
    private LocalDate dua;

    @Column(name = "CODIGOBANCO")
    private Integer codigoBanco;

}
