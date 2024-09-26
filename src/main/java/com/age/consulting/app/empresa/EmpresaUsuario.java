package com.age.consulting.app.empresa;

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
@Table(name = "TBEMPRESAUSUARIO")
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaUsuario {

    @Id
    @Column(name = "CODIGO_USUARIO", nullable = false)
    private Integer codigoUsuario;

    @Column(name = "CODIGOPRODUTO", nullable = false)
    private Integer codigoProduto;

    @Column(name = "CODIGOEMPRESA", nullable = false)
    private Integer codigoEmpresa;

    @Column(name = "CODIGOSUBPRODUTO", nullable = false)
    private Integer codigoSubProduto;

    @Column(name = "SITUACAO", length = 1)
    private String situacao;

    @Column(name = "DVG")
    private LocalDate dvg;

    @Column(name = "DVL")
    private LocalDate dvl;

}
