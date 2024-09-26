package com.age.consulting.app.banco;

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
@Table(name = "TBBANCO")
@NoArgsConstructor
@AllArgsConstructor
public class Banco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGOBANCO", nullable = false)
    private Long id;

    @Column(name = "NOMBEBANCO", length = 50)
    private String nome;
    
}
