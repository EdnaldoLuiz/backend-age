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

@Getter
@Setter
@Entity
@Table(name = "TBBOLETO")
@NoArgsConstructor
@AllArgsConstructor
public class Boleto {
    
    @Id
    @Column(name = "COD_BOLETO", nullable = false)
    private Integer id;

    @Column(name = "COD_EMPRESA")
    private Integer codEmpresa;

    @Column(name = "STATUS", nullable = false)
    private Integer status = 1;

    @Column(name = "DATAREGISTRO")
    private LocalDate dataRegistro;

    @Column(name = "COD_USUARIO", length = 45)
    private String codUsuario;

    @Column(name = "DATACANCELAMENTO")
    private LocalDate dataCancelamento;

    @Column(name = "COD_USUARIOCANCELAMENTO")
    private Integer codUsuarioCancelamento;
}
