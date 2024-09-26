package com.age.consulting.app.tipos;

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
@Table(name = "TBTIPOOBRIGACAO")
@NoArgsConstructor
@AllArgsConstructor
public class TipoObrigacao {

    @Id
    @Column(name = "CODIGOTIPOOBRIGACAO", nullable = false)
    private Integer codigoTipoObrigacao;

    @Column(name = "DESCRICAOTIPOOBRIGACAO", length = 30)
    private String descricaoTipoObrigacao;
    
}