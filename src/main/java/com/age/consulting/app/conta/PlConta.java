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
@Table(name = "TBPLCONTA")
@IdClass(PlContaId.class)
@NoArgsConstructor
@AllArgsConstructor
public class PlConta {

    @Id
    @Column(name = "CODIGOEMPRESA", nullable = false)
    private Integer codigoEmpresa;

    @Id
    @Column(name = "CodigoConta", nullable = false)
    private Integer codigoConta;

    @Column(name = "Descricao", length = 50)
    private String descricao;

    @Column(name = "TIPO", length = 1)
    private String tipo;

    @Column(name = "SUP")
    private Integer sup;
    
}