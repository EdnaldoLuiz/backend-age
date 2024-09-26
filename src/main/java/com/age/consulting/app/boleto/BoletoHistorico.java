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
@Table(name = "TBBOLETOXHISTORICOS")
@NoArgsConstructor
@AllArgsConstructor
public class BoletoHistorico {
    @Id
    @Column(name = "COD_BOLETOXHISTORICOS", nullable = false)
    private Integer id;

    @Column(name = "COD_EMPRESA")
    private Integer codEmpresa;

    @Column(name = "COD_STATUS")
    private Integer codStatus;

    @Column(name = "OBS", columnDefinition = "TEXT")
    private String obs;

    @Column(name = "DATAREGISTRO")
    private LocalDate dataRegistro;

    @Column(name = "COD_USUARIO")
    private Integer codUsuario;

    @Column(name = "FLAG")
    private Integer flag;

    @Column(name = "COD_BOLETO")
    private Integer codBoleto;

}