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
@Table(name = "TBESFERAOBRIGACAO")
@NoArgsConstructor
@AllArgsConstructor
public class EsferaObrigacao {

    @Id
    @Column(name = "CODIGOESFERAOBRIGACAO", nullable = false)
    private Integer codigoEsferaObrigacao;

    @Column(name = "DESCRICAOESFERAOBRIGACAO", length = 30)
    private String descricaoEsferaObrigacao;
}
