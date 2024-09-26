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
@Table(name = "TBEMPRESA_OBRIGACOES")
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaObrigacoes {

    @Id
    @Column(name = "CODIGOEMPRESA", nullable = false)
    private Integer codigoEmpresa;

    @Column(name = "CODIGOOBRIGACAO", nullable = false)
    private Integer codigoObrigacao;

    @Column(name = "DIALIMITEENVIO")
    private Integer diaLimiteEnvio;

    @Column(name = "MESESPARAENTREGA")
    private Integer mesesParaEntrega;

    @Column(name = "DVG")
    private LocalDate dvg;

    @Column(name = "DVL")
    private LocalDate dvl;

    @Column(name = "IDDUA")
    private Integer idDua;

    @Column(name = "DUA")
    private LocalDate dua;

}
