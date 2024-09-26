package com.age.consulting.app.responsavel;

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
@Table(name = "TBRESPONSAVEL_EMPRESA")
@IdClass(ResponsavelEmpresaId.class)
@NoArgsConstructor
@AllArgsConstructor
public class ResponsavelEmpresa {

    @Id
    @Column(name = "CODIGOEMPRESA", nullable = false)
    private Integer codigoEmpresa;

    @Id
    @Column(name = "CODIGOCOLABORADOR", nullable = false)
    private Integer codigoColaborador;

    @Column(name = "CODIGOFUNCAO")
    private Integer codigoFuncao;

    @Column(name = "DVGRESPONSAVEL")
    private java.sql.Timestamp dvgResponsavel;

    @Column(name = "DVLRESPONSAVEL")
    private java.sql.Timestamp dvlResponsavel;
    
}