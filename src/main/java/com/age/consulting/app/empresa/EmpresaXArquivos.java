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
@Table(name = "TBEMPRESAXARQUIVOS")
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaXArquivos {

    @Id
    @Column(name = "COD_EMPRESAXARQUIVOS", nullable = false)
    private Integer codEmpresaXArquivos;

    @Column(name = "COD_EMPRESA")
    private Integer codEmpresa;

    @Column(name = "ANO")
    private Integer ano;

    @Column(name = "MES")
    private Integer mes;

    @Column(name = "NOMEARQUIVO", length = 400)
    private String nomeArquivo;

    @Column(name = "EXTENSAO", length = 3)
    private String extensao;

    @Column(name = "TAMANHO")
    private Integer tamanho;

    @Column(name = "URL")
    private String url;

    @Column(name = "DATAREGISTRO")
    private LocalDate dataRegistro;
    
}
