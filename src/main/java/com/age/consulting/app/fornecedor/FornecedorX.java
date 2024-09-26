package com.age.consulting.app.fornecedor;

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
@Table(name = "TBFORNECEDORX")
@NoArgsConstructor
@AllArgsConstructor
public class FornecedorX {

    @Id
    @Column(name = "Codigo Fornecedor", nullable = false)
    private Integer codigoFornecedor;

    @Column(name = "Razao Social", length = 50)
    private String razaoSocial;

    @Column(name = "Fisica ou Juridica", length = 1)
    private String fisicaOuJuridica;

    @Column(name = "CNPJ ou CPF", length = 30)
    private String cnpjOuCpf;

    @Column(name = "Codigo Conta Pl de Conta")
    private Integer codigoContaPlDeConta;

    @Column(name = "CodigoCCusto", length = 5)
    private String codigoCCusto;

}
