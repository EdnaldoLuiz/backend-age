package com.age.consulting.app.colaborador;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBCOLABORADOR_FUNCAO")
@NoArgsConstructor
@AllArgsConstructor
public class ColaboradorFuncao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGOCOLABORADOR")
    private Integer codigoColaborador;

    @Column(name = "CODIGOFUNCAO")
    private Integer codigoFuncao;
}
