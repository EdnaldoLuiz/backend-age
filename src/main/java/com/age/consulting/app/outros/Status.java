package com.age.consulting.app.outros;

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
@Table(name = "TBSTATUS")
@NoArgsConstructor
@AllArgsConstructor
public class Status {

    @Id
    @Column(name = "COD_STATUS", nullable = false)
    private Integer codStatus;

    @Column(name = "NOME", length = 400)
    private String nome;
    
}