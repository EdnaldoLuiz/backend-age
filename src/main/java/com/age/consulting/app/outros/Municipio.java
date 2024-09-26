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
@Table(name = "TBMUNICIPIO")
@NoArgsConstructor
@AllArgsConstructor
public class Municipio {

    @Id
    @Column(name = "CODIGOMUNICIPIO", nullable = false)
    private Integer codigoMunicipio;

    @Column(name = "DESCRICAOMUNICIPIO", length = 100)
    private String descricaoMunicipio;

    @Column(name = "UF", length = 2)
    private String uf;

}
