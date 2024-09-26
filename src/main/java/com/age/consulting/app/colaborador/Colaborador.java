package com.age.consulting.app.colaborador;

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
@Table(name = "TBCOLABORADOR")
@NoArgsConstructor
@AllArgsConstructor
public class Colaborador {
    @Id
    @Column(name = "CODIGOCOLABORADOR", nullable = false)
    private Integer codigoColaborador;

    @Column(name = "NOMECOLABORADOR", length = 50)
    private String nomeColaborador;

    @Column(name = "EMAILCOLABORADOR", length = 50)
    private String emailColaborador;

    @Column(name = "LOGINCOLABORADOR", length = 20)
    private String loginColaborador;

    @Column(name = "SENHACOLABORADOR", length = 20)
    private String senhaColaborador;

    @Column(name = "CCUSTOCOLABORADOR", length = 50)
    private String ccustoColaborador;

    @Column(name = "DVGCOLABORADOR")
    private LocalDate dvgColaborador;

    @Column(name = "DVLCOLABORADOR")
    private LocalDate dvlColaborador;
}