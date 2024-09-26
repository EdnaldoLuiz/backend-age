package com.age.consulting.app.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.age.consulting.app.enums.RelatorioType;
import com.age.consulting.app.movfat.MovFatImportDTO;
import com.age.consulting.app.movfat.MovFatRequestDTO;
import com.age.consulting.app.movfat.MovFatService;
import com.age.consulting.app.movfat.SelectFilterProjection;
import com.age.consulting.app.movfat.relatorio.MovFatRelatorioDTO;
import com.age.consulting.app.movfat.relatorio.MovFatRelatorioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value = "/movfat")
@RestController
@RequiredArgsConstructor
public class MovFatController {

    private final MovFatService movFatService;
    private final MovFatRelatorioService movFatRelatorioService;

    @GetMapping
public ResponseEntity<Page<?>> getAllTable(
        @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataInicio,
        @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataFim,
        @RequestParam(required = false) List<String> razaoSocial,
        @RequestParam(required = false) List<String> cliente,
        @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate vencimentoInicio,
        @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate vencimentoFim,
        @RequestParam(required = false) List<String> numNF,
        @RequestParam(required = false) List<String> numTit,
        @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dtpgInicio,
        @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dtpgFim,
        @RequestParam(required = false) List<String> status,
        @RequestParam(required = false) List<BigDecimal> comissao,
        @RequestParam(required = false) String search,
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "15") int size) {

    MovFatRequestDTO requestDTO = new MovFatRequestDTO(
            dataInicio,
            dataFim,
            razaoSocial,
            cliente,
            vencimentoInicio,
            vencimentoFim,
            numNF,
            numTit,
            dtpgInicio,
            dtpgFim,
            status,
            comissao,
            search);

    return ResponseEntity.ok(movFatService.getAllTable(requestDTO, false, page, size));
}

    @GetMapping("/relatorio")
@Operation(summary = "Gerar Relatório PDF MovFat", description = "Gera um relatório PDF com base nos filtros fornecidos")
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Relatório gerado com sucesso"),
        @ApiResponse(responseCode = "404", description = "Dados não encontrados"),
})
public ResponseEntity<?> gerarRelatorio(
    @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataInicio,
    @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataFim,
    @RequestParam(required = false) List<String> razaoSocial,
    @RequestParam(required = false) List<String> cliente,
    @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate vencimentoInicio,
    @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate vencimentoFim,
    @RequestParam(required = false) List<String> numNF,
    @RequestParam(required = false) List<String> numTit,
    @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dtpgInicio,
    @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dtpgFim,
    @RequestParam(required = false) List<String> status,
    @RequestParam(required = false) List<BigDecimal> comissao,
    @RequestParam(required = false) RelatorioType tipoRelatorio,
    @RequestParam(defaultValue = "false") boolean isRelatorio,
    @RequestParam(defaultValue = "0") int page,
    @RequestParam(defaultValue = "15") int size,
    @RequestParam(required = false) String search) { 

    MovFatRequestDTO requestDTO = new MovFatRequestDTO(
            dataInicio,
            dataFim,
            razaoSocial,
            cliente,
            vencimentoInicio,
            vencimentoFim,
            numNF,
            numTit,
            dtpgInicio,
            dtpgFim,
            status,
            comissao,
            search); 

    Page<MovFatRelatorioDTO> movFat = movFatService.getAllTable(requestDTO, isRelatorio, page, size);

    if (movFat.isEmpty()) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Dados não encontrados");
    }

    return movFatRelatorioService.gerarRelatorio(requestDTO, movFat, tipoRelatorio);
}

    @PostMapping("/importar")
    @Operation(summary = "Importar Tabela MovFat", description = "Importar Tabela MovFat")
    public ResponseEntity<?> importar(
            @RequestBody @Valid MovFatImportDTO importDTO) {
        movFatService.importar(importDTO);
        return ResponseEntity.ok(Collections.singletonMap("message", "Importação realizada com sucesso"));
    }

    /*
     * ----------------- Campos de Filtros -----------------
     */

    @GetMapping("/razao-social")
    @Operation(summary = "Get all MovFat table", description = "Get all MovFat table")
    public ResponseEntity<List<SelectFilterProjection>> getRazaoSocial() {
        return ResponseEntity.ok(movFatService.getRazaoSocial());
    }

    @GetMapping("/clientes")
    @Operation(summary = "Get all MovFat table", description = "Get all MovFat table")
    public ResponseEntity<List<SelectFilterProjection>> getClientes() {
        return ResponseEntity.ok(movFatService.getClientes());
    }

    @GetMapping("/numf")
    @Operation(summary = "Get all MovFat table", description = "Get all MovFat table")
    public ResponseEntity<List<SelectFilterProjection>> getNumf() {
        return ResponseEntity.ok(movFatService.getNumf());
    }

    @GetMapping("/numtit")
    @Operation(summary = "Get all MovFat table", description = "Get all MovFat table")
    public ResponseEntity<List<SelectFilterProjection>> getNumtit() {
        return ResponseEntity.ok(movFatService.getNumtit());
    }

    @GetMapping("/status")
    @Operation(summary = "Get all MovFat table", description = "Get all MovFat table")
    public ResponseEntity<List<SelectFilterProjection>> getStatus() {
        return ResponseEntity.ok(movFatService.getStatus());
    }

    @GetMapping("/comissao")
    @Operation(summary = "Get all MovFat table", description = "Get all MovFat table")
    public ResponseEntity<List<SelectFilterProjection>> getComissao() {
        return ResponseEntity.ok(movFatService.getComissao());
    }
}
