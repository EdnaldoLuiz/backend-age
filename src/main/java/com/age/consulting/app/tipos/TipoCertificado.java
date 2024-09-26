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
@Table(name = "TBTIPOCERTIFICADO")
@NoArgsConstructor
@AllArgsConstructor
public class TipoCertificado {

    @Id
    @Column(name = "IDTIPOCERT", nullable = false)
    private Integer idTipoCert;

    @Column(name = "DESCRICAOTIPOCERT", length = 45, nullable = false)
    private String descricaoTipoCert;
    
}