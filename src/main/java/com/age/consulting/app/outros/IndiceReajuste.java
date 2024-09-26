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
@Table(name = "TBINDICEREAJUSTE")
@NoArgsConstructor
@AllArgsConstructor
public class IndiceReajuste {

    @Id
    @Column(name = "CODIGOINDICEREAJUSTE", nullable = false)
    private Integer codigoIndiceReajuste;

    @Column(name = "DESCRICAOINDICEREAJUSTE", length = 50)
    private String descricaoIndiceReajuste;

}
