package com.age.consulting.app.empresa;

import java.time.LocalDate;

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
@Table(name = "TBEMPRESA_SINDICATO")
@IdClass(EmpresaSindicatoId.class)
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaSindicato {

    @Id
    @Column(name = "CODIGOEMPRESA", nullable = false)
    private Integer codigoEmpresa;

    @Id
    @Column(name = "CODIGOSINDICATO", nullable = false)
    private Integer codigoSindicato;

    @Column(name = "DVL")
    private LocalDate dvl;

    @Column(name = "IDUA")
    private Integer idua;

    @Column(name = "DUA")
    private LocalDate dua;

}
