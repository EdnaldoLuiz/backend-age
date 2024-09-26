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
@Table(name = "TBTEMP")
@NoArgsConstructor
@AllArgsConstructor
public class Temp {

    @Id
    @Column(name = "COD", nullable = false)
    private Integer cod;

    @Column(name = "RAZAOSOCIAL", length = 123)
    private String razaoSocial;

    @Column(name = "Inicio")
    private java.sql.Timestamp inicio;

    @Column(name = "certdig")
    private java.sql.Timestamp certdig;

    @Column(name = "fimcertdiig")
    private java.sql.Timestamp fimcertdiig;

    @Column(name = "fimprocuracao")
    private java.sql.Timestamp fimprocuracao;
    
}