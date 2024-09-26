package com.age.consulting.app.outros;

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
@Table(name = "TBLOG")
@NoArgsConstructor
@AllArgsConstructor
public class Log {

    @Id
    @Column(name = "CODIGOLOG", nullable = false)
    private Integer codigoLog;

    @Column(name = "DATALOG")
    private LocalDate dataLog;

    @Column(name = "USUARIOUPLOAD")
    private Integer usuarioUpload;

    @Column(name = "ARQUIVO", length = 200)
    private String arquivo;

    @Column(name = "DESCRICAOARQUIVO", length = 300)
    private String descricaoArquivo;

    @Column(name = "CODIGOEMPRESA")
    private Integer codigoEmpresa;

    @Column(name = "CODIGOPRODUTO")
    private Integer codigoProduto;

    @Column(name = "CODIGOSUBPRODUTO")
    private Integer codigoSubProduto;

    @Column(name = "USUARIODOWN")
    private Integer usuarioDown;
}
