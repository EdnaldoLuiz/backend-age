package com.age.consulting.app.usuario;

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
@Table(name = "TBUSUARIO")
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @Column(name = "CODIGO_USUARIO", nullable = false)
    private Integer codigoUsuario;

    @Column(name = "NOME", length = 200)
    private String nome;

    @Column(name = "LOGIN", length = 100)
    private String login;

    @Column(name = "SENHA", length = 10)
    private String senha;

    @Column(name = "TIPO_USUARIO", length = 1)
    private String tipoUsuario;

    @Column(name = "DVG")
    private LocalDate dvg;

    @Column(name = "DVL")
    private LocalDate dvl;

    @Column(name = "EMAIL1", length = 100)
    private String email1;

    @Column(name = "EMAIL2", length = 100)
    private String email2;

    @Column(name = "FONECOM", length = 16)
    private String foneCom;

    @Column(name = "FONERES", length = 16)
    private String foneRes;

    @Column(name = "FONECEL", length = 16)
    private String foneCel;

    @Column(name = "FONEFAX", length = 16)
    private String foneFax;

    @Column(name = "OBSERVACAO", length = 200)
    private String observacao;

    @Column(name = "NASCIMENTO")
    private LocalDate nascimento;

}