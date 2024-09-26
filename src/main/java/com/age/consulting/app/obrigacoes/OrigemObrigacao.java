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
@Table(name = "TBORIGEMOBRIGACAO")
@NoArgsConstructor
@AllArgsConstructor
public class OrigemObrigacao {

    @Id
    @Column(name = "CODIGOORIGEM", nullable = false)
    private Integer codigoOrigem;

    @Column(name = "DESCRICAOORIGEM", length = 30)
    private String descricaoOrigem;
    
}