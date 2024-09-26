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
@Table(name = "TBTIPOFATURAMENTO")
@NoArgsConstructor
@AllArgsConstructor
public class TipoFaturamento {

    @Id
    @Column(name = "CODIGOTPFATURAMENTO", nullable = false)
    private Integer codigoTpFaturamento;

    @Column(name = "DESCRICAOTPFATURAMENTO", length = 50)
    private String descricaoTpFaturamento;
    
}