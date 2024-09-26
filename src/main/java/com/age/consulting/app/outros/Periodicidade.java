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
@Table(name = "TBPERIODICIDADE")
@NoArgsConstructor
@AllArgsConstructor
public class Periodicidade {

    @Id
    @Column(name = "CODIGOPERIODICIDADE", nullable = false)
    private Integer codigoPeriodicidade;

    @Column(name = "DESCRICAOPERIODICIDADE", length = 30)
    private String descricaoPeriodicidade;
    
}