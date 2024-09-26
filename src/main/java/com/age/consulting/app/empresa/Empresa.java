package com.age.consulting.app.empresa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "TBEMPRESA")
@NoArgsConstructor
@AllArgsConstructor
public class Empresa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGOEMPRESA", nullable = false)
    private Integer codigoEmpresa;

    @Column(name = "RAZAOSOCIAL", length = 100)
    private String razaoSocial;

    @Column(name = "NOMEFANTASIA", length = 50)
    private String nomeFantasia;

    @Column(name = "RESUMIDO", length = 30)
    private String resumido;

    @Column(name = "CNPJ", length = 18)
    private String cnpj;

    @Column(name = "INSCESTADUAL", length = 18)
    private String inscEstadual;

    @Column(name = "INSCMUNICIPAL", length = 18)
    private String inscMunicipal;

    @Column(name = "CODIGOMUNICIPIO")
    private Integer codigoMunicipio;

    @Column(name = "ENDERECOCNPJ", length = 200)
    private String enderecoCnpj;

    @Column(name = "BAIRROCNPJ", length = 60)
    private String bairroCnpj;

    @Column(name = "CIDADECNPJ", length = 50)
    private String cidadeCnpj;

    @Column(name = "CEPCNPJ", length = 8)
    private String cepCnpj;

    @Column(name = "UFCNPJ", length = 2)
    private String ufCnpj;

    @Column(name = "CODIGOSTATUS", precision = 4, scale = 0)
    private BigDecimal codigoStatus;

    @Column(name = "DATACNPJ")
    private LocalDate dataCnpj;

    @Column(name = "CODIGOCNAE", length = 10)
    private String codigoCnae;

    @Column(name = "ENDERECO", length = 200)
    private String endereco;

    @Column(name = "BAIRRO", length = 60)
    private String bairro;

    @Column(name = "CIDADE", length = 50)
    private String cidade;

    @Column(name = "CEP", length = 8)
    private String cep;

    @Column(name = "UF", length = 2)
    private String uf;

    @Column(name = "OBSERVACAO", length = 100)
    private String observacao;

    @Column(name = "SITE", length = 100)
    private String site;

    @Column(name = "DUA")
    private LocalDate dua;

    @Column(name = "IDUA", precision = 8, scale = 0)
    private BigDecimal idua;

    @Column(name = "SITUACAO", length = 1)
    private String situacao;

    @Column(name = "DVG")
    private LocalDate dvg;

    @Column(name = "DVL")
    private LocalDate dvl;

    @Column(name = "CAPITALSOCIAL", precision = 10, scale = 0)
    private BigDecimal capitalSocial;

    @Column(name = "CODIGOMATRIZ", precision = 6, scale = 0)
    private BigDecimal codigoMatriz;

    @Column(name = "IR", length = 1)
    private String ir;

    @Column(name = "CODIGOTRIBUTACAO")
    private Integer codigoTributacao;

    @Column(name = "PISCOFINSCUMULATIVO", length = 2)
    private String pisCofinsCumulativo;

    @Column(name = "CODIGOPATRONAL", precision = 4, scale = 0)
    private BigDecimal codigoPatronal;

    @Column(name = "CODIGOOBREIRO", precision = 4, scale = 0)
    private BigDecimal codigoObreiro;

    @Column(name = "RESPONSAVELRECEITAFEDERAL", length = 50)
    private String responsavelReceitaFederal;

    @Column(name = "CPFRESPONSAVELRECEITA", length = 14)
    private String cpfResponsavelReceita;

    @Column(name = "DTVIGENCIACERTDIGITAL")
    private LocalDate dtVigenciaCertDigital;

    @Column(name = "DTVALIDADECERTDIGITAL")
    private LocalDate dtValidadeCertDigital;

    @Column(name = "DTVALIDADEPROCURACAOAGE")
    private LocalDate dtValidadeProcuracaoAge;

    @Column(name = "SenhaFicus", length = 15)
    private String senhaFicus;

    @Column(name = "SenhaExtratoInss", length = 15)
    private String senhaExtratoInss;

    @Column(name = "email", length = 200)
    private String email;

    @Column(name = "deemail", length = 200)
    private String deEmail;

    @Column(name = "MOVPROTOCOLO", length = 200)
    private String movProtocolo;
}