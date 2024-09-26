package com.age.consulting.app.enums;

import lombok.Getter;

@Getter
public enum Status {

    GERADO(1),
    ENVIADO(2),
    CONFIRMADO(3),
    FINALIZADO(4);

    private final int status;

    Status(int status) {
        this.status = status;
    }
}
