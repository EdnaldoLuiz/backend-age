package com.age.consulting.app.outros;


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
@Table(name = "TBCOMPXOBRIG")
@NoArgsConstructor
@AllArgsConstructor
public class Compxobrig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODCOMPXOBRIG", nullable = false)
    private Integer codComp;

    @Column(name = "CODOBRIGACAO", nullable = false)
    private Integer codObrigacao;

    @Column(name = "CODCOMPETENCIA", nullable = false)
    private Integer codCompetencia;
    
}
