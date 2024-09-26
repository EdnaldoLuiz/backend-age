package com.age.consulting.app.movfat.relatorio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RelatorioDTO {
    
    private String nomeEmpresa;
    private String cnpjEmpresa;
    private String enderecoEmpresa;
    private String cidadeEmpresa;
    private String cepEmpresa;
    private String emailEmpresa;
    private String dataHoraEmissao;
    private String usuarioNome;
    private String usuarioEmail;

}
