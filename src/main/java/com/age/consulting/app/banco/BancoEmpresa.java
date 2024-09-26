package com.age.consulting.app.banco;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBBANCOEMPRESA")
@NoArgsConstructor
@AllArgsConstructor
public class BancoEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGOEMPRESA", nullable = false)
    private Integer idEmpresa;

    @Column(name = "CODIGOBANCO", nullable = false)
    private Integer idBanco;

    @Column(name = "DESCRICAOBANCO", length = 50)
    private String descricaoBanco;

    @Column(name = "AGENCIA", nullable = false)
    private Long agencia;

    @Column(name = "CONTA", length = 10, nullable = true)
    private String conta;

    @Column(name = "DIGITO", length = 2, nullable = true)
    private String digito;
    
}
