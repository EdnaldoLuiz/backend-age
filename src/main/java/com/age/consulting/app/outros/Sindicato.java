package com.age.consulting.app.outros;

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
@Table(name = "TBSINDICATO")
@NoArgsConstructor
@AllArgsConstructor
public class Sindicato {

    @Id
    @Column(name = "CODIGOSINDICATO", nullable = false)
    private Integer codigoSindicato;

    @Column(name = "DESCRICAOSINDICATO", length = 80)
    private String descricaoSindicato;

    @Column(name = "TIPOSINDICATO", length = 1)
    private String tipoSindicato;

    @Column(name = "DATADISSIDIO")
    private Integer dataDissidio;

    @Column(name = "IDUA")
    private Integer idUa;

    @Column(name = "DUA")
    private LocalDate dua;

}