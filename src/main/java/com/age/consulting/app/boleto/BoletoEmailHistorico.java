package com.age.consulting.app.boleto;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "TBBOLETOEMAILXHISTORICO")
@NoArgsConstructor
@AllArgsConstructor
public class BoletoEmailHistorico {
    @Id
    @Column(name = "CODTBBOLETOEMAILXHISTORICO", nullable = false)
    private Integer id;

    @Column(name = "CODEMPRESA")
    private Integer codEmpresa;

    @Column(name = "DATAREGISTRO")
    private LocalDate dataRegistro;

    @Column(name = "COMPETENCIA", length = 45)
    private String competencia;

    @Column(name = "DE", length = 4000)
    private String de;

    @Column(name = "CODUSUARIO")
    private Integer codUsuario;

    @Column(name = "PARA", length = 4000)
    private String para;

    @Column(name = "CC", length = 4000)
    private String cc;
}