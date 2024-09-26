package com.age.consulting.app.obrigacoes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBOBRIGACOESMENSAL")
@IdClass(ObrigacoesMensalId.class)
@NoArgsConstructor
@AllArgsConstructor
public class ObrigacoesMensal {

    @Id
    @Column(name = "COMPETENCIA", nullable = false)
    private Integer competencia;

    @Id
    @Column(name = "CODIGOEMPRESA", nullable = false)
    private Integer codigoEmpresa;

    @Id
    @Column(name = "CODIGOOBRIGACAO", nullable = false)
    private Integer codigoObrigacao;

    @Column(name = "STATUS", length = 1)
    private String status;

    @Column(name = "IDUATICAR")
    private Integer iduaticar;

    @Column(name = "DTTICAR", nullable = false, columnDefinition = "timestamp default current_timestamp on update current_timestamp")
    private java.sql.Timestamp dtticar;

    @Column(name = "ANO", nullable = false)
    private Integer ano;

    @Column(name = "MOTIVO", columnDefinition = "text")
    private String motivo;
    
}
