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
@Table(name = "TBTRIBUTACAO")
@NoArgsConstructor
@AllArgsConstructor
public class Tributacao {

    @Id
    @Column(name = "CODIGOTRIBUTACAO", nullable = false)
    private Integer codigoTributacao;

    @Column(name = "DESCRICAOTRIBUTACAO", length = 50)
    private String descricaoTributacao;
    
}