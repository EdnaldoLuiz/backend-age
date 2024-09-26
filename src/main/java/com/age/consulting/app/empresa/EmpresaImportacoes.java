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
@Table(name = "TBEMPRESA_IMPORTACOES")
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaImportacoes {

    @Id
    @Column(name = "CODIGOEMPRESA", nullable = false)
    private Integer codigoEmpresa;

    @Column(name = "PERIODO")
    private LocalDate periodo;

    @Column(name = "STATUS", length = 45)
    private String status;

    @Column(name = "IDDUA")
    private Integer idDua;

    @Column(name = "DUA")
    private LocalDate dua;

}
