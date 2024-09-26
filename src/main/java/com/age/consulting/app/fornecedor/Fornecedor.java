package com.age.consulting.app.fornecedor;

import java.math.BigDecimal;

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
@Table(name = "TBFORNECEDOR")
@NoArgsConstructor
@AllArgsConstructor
public class Fornecedor {

    @Id
    @Column(name = "CODIGOEMPRESA", nullable = false)
    private Integer codigoEmpresa;

    @Column(name = "CODIGOFORNECEDOR", nullable = false)
    private BigDecimal codigoFornecedor;

    @Column(name = "NOMEFORNECEDOR", length = 50, nullable = false)
    private String nomeFornecedor;

    @Column(name = "TIPO", length = 1, nullable = false)
    private String tipo;

    @Column(name = "CNPJCPF", length = 14)
    private String cnpjCpf;

    @Column(name = "ENDERECO", length = 160)
    private String endereco;

    @Column(name = "BAIRRO", length = 80)
    private String bairro;

    @Column(name = "CIDADE", length = 50)
    private String cidade;

    @Column(name = "UF", length = 2)
    private String uf;

    @Column(name = "CEP")
    private BigDecimal cep;

    @Column(name = "CODIGOBANCO")
    private BigDecimal codigoBanco;

    @Column(name = "AGENCIA", length = 10)
    private String agencia;

    @Column(name = "DIGITOAG", length = 2)
    private String digitoAg;

    @Column(name = "CONTACORRENTE", length = 10)
    private String contaCorrente;

    @Column(name = "DIGITOCONTA", length = 2)
    private String digitoConta;

    @Column(name = "CODIGOCCUSTO", length = 8)
    private String codigoCCusto;

    @Column(name = "CODIGOPLANO", length = 10)
    private String codigoPlano;
    
}
