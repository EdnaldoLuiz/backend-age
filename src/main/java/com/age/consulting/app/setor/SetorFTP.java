package com.age.consulting.app.setor;

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
@Table(name = "TBSETORFTP")
@NoArgsConstructor
@AllArgsConstructor
public class SetorFTP {

    @Id
    @Column(name = "CODIGOSETOR", nullable = false)
    private Integer codigoSetor;

    @Column(name = "NOMEPASTA", length = 50, nullable = false)
    private String nomePasta;

    @Column(name = "DVL")
    private LocalDate dvl;
    
}