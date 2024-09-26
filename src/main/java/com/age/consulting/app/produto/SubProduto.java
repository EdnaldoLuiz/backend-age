package com.age.consulting.app.produto;

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
@Table(name = "TBSUBPRODUTO")
@NoArgsConstructor
@AllArgsConstructor
public class SubProduto {

    @Id
    @Column(name = "CODIGOSUBPRODUTO", nullable = false)
    private Integer codigoSubProduto;

    @Column(name = "DESCRICAOSUBPRODUTO", length = 50)
    private String descricaoSubProduto;

}