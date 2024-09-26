package com.age.consulting.app.produto;

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
@Table(name = "TBPRODUTO")
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @Column(name = "CODIGOPRODUTO", nullable = false)
    private Integer codigoProduto;

    @Column(name = "DESCRICAOPRODUTO", length = 50)
    private String descricaoProduto;

    @Column(name = "DVL")
    private LocalDate dvl;

}