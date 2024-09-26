package com.age.consulting.app.empresa;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmpresaSindicatoId implements Serializable {

    private Integer codigoEmpresa;
    private Integer codigoSindicato;
    
}
