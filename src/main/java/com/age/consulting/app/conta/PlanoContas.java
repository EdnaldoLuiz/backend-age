package com.age.consulting.app.conta;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBPLANOCONTAS")
@IdClass(PlanoContasId.class)
@NoArgsConstructor
@AllArgsConstructor
public class PlanoContas {

    @Id
    @Column(name = "CODIGOEMPRESA", nullable = false)
    private Integer codigoEmpresa;

    @Id
    @Column(name = "CODIGOPLANO", length = 10, nullable = false)
    private String codigoPlano;

    @Column(name = "DESCRICAOPLANO", length = 50)
    private String descricaoPlano;

    @Column(name = "TIPOPLANO", length = 1)
    private String tipoPlano;

    @Column(name = "PLANOPAI", length = 10)
    private String planoPai;

}