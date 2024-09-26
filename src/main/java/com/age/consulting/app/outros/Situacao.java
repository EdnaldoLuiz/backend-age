package com.age.consulting.app.outros;

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
@Table(name = "TBSITUACAO")
@NoArgsConstructor
@AllArgsConstructor
public class Situacao {

    @Id
    @Column(name = "CODIGOSITUACAO", nullable = false)
    private Integer codigoSituacao;

    @Column(name = "DESCRICAOSITUACAO", length = 50)
    private String descricaoSituacao;
    
}