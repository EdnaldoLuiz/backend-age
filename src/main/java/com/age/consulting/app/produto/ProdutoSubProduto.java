package com.age.consulting.app.produto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBPRODUTOSUBPRODUTO")
@IdClass(ProdutoSubProdutoId.class)
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoSubProduto {

    @Id
    @Column(name = "CODIGOPRODUTO", nullable = false)
    private Integer codigoProduto;

    @Id
    @Column(name = "CODIGOSUBPRODUTO", nullable = false)
    private Integer codigoSubProduto;
    
}
