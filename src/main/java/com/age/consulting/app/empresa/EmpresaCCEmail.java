package com.age.consulting.app.empresa;

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
@Table(name = "TBEMPRESAXCCEMAIL")
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaCCEmail {

    @Id
    @Column(name = "COD_CCEMAIL", nullable = false)
    private Integer codCCEmail;

    @Column(name = "EMAIL_CC", length = 200)
    private String emailCC;

    @Column(name = "COD_EMPRESA")
    private Integer codEmpresa;

}