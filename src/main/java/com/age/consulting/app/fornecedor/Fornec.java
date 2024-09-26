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
@Table(name = "TBFORNEC")
@NoArgsConstructor
@AllArgsConstructor
public class Fornec {

    @Id
    @Column(name = "empresa", nullable = false)
    private Integer empresa;

    @Column(name = "CodigoFornecedor", nullable = false)
    private Integer codigoFornecedor;

    @Column(name = "RazaoSocial", length = 50)
    private String razaoSocial;

    @Column(name = "FisicaouJuridica", length = 1)
    private String fisicaOuJuridica;

    @Column(name = "CNPJouCPF", length = 30)
    private String cnpjOuCpf;

    @Column(name = "endereco")
    private Integer endereco;

    @Column(name = "bairro")
    private Integer bairro;

    @Column(name = "cidade")
    private Integer cidade;

    @Column(name = "uf")
    private Integer uf;

    @Column(name = "cep")
    private Integer cep;

    @Column(name = "codigobanco")
    private Integer codigoBanco;

    @Column(name = "agencia")
    private Integer agencia;

    @Column(name = "digitoag")
    private Integer digitoAg;

    @Column(name = "contacorrente")
    private Integer contaCorrente;

    @Column(name = "digitoconta")
    private Integer digitoConta;

    @Column(name = "CodigoCCusto", length = 5)
    private String codigoCCusto;

    @Column(name = "CodigoConta")
    private Integer codigoConta;

}
