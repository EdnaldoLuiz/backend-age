package com.age.consulting.app.obrigacoes;

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
@Table(name = "TBOBRIGACOES")
@NoArgsConstructor
@AllArgsConstructor
public class Obrigacoes {

    @Id
    @Column(name = "CODIGOOBRIGACAO", nullable = false)
    private Integer codigoObrigacao;

    @Column(name = "DESCRICAOOBRIGACAO", length = 50)
    private String descricaoObrigacao;

    @Column(name = "TIPOOBRIGACAO")
    private Integer tipoObrigacao;

    @Column(name = "ESFERAOBRIGACAO")
    private Integer esferaObrigacao;

    @Column(name = "ORIGEMOBRIGACAO")
    private Integer origemObrigacao;

    @Column(name = "PERIODICIDADE")
    private Integer periodicidade;

    @Column(name = "IDUA")
    private Integer idua;

    @Column(name = "DUA")
    private java.sql.Date dua;

    @Column(name = "DIASLIMITE", columnDefinition = "int default 20")
    private Integer diasLimite;
    
}