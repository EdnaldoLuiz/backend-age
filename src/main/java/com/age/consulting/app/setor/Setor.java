package com.age.consulting.app.setor;

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
@Table(name = "TBSETOR")
@NoArgsConstructor
@AllArgsConstructor
public class Setor {

    @Id
    @Column(name = "CODIGOSETOR", nullable = false)
    private Integer codigoSetor;

    @Column(name = "NOMESETOR", length = 50)
    private String nomeSetor;
    
}