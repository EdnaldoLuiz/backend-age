package com.age.consulting.app.movfat;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.age.consulting.app.movfat.relatorio.MovFatRelatorioDTO;

import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class MovFatService {

    MovFatRepository movFatRepository;

    public Page<MovFatRelatorioDTO> getAllTable(MovFatRequestDTO filterDTO, boolean isRelatorio, int page, int size) {
    
        Specification<MovFat> spec = Specification.where(
                MovFatSpecs.withBetweenDates("vencimento", filterDTO.getVencimentoInicio(),
                        filterDTO.getVencimentoFim()))
                .and(MovFatSpecs.withIn("razaoSocial", filterDTO.getRazaoSocial()))
                .and(MovFatSpecs.withIn("cliente", filterDTO.getCliente()))
                .and(MovFatSpecs.withBetweenDates("dtpg", filterDTO.getDtpgInicio(), filterDTO.getDtpgFim()))
                .and(MovFatSpecs.withIn("numNF", filterDTO.getNumNF()))
                .and(MovFatSpecs.withIn("numTit", filterDTO.getNumTit()))
                .and(MovFatSpecs.withIn("status", filterDTO.getStatus()))
                .and(MovFatSpecs.withInBigDecimal("comissao", filterDTO.getComissao()));
        
        if (filterDTO.getSearch() != null && !filterDTO.getSearch().isEmpty()) {
            List<String> textSearchFields = List.of("razaoSocial", "cliente", "status"); // Ajuste conforme necessário
            spec = spec.and(MovFatSpecs.withTextSearch(filterDTO.getSearch(), textSearchFields));
        }
    
        PageRequest pageRequest = PageRequest.of(page, size);
        return movFatRepository.findAll(spec, pageRequest).map(MovFatRelatorioDTO::new);
    }
    
    public List<SelectFilterProjection> getRazaoSocial() {
        return movFatRepository.findDistinctRazaoSocial();
    }

    public List<SelectFilterProjection> getClientes() {
        return movFatRepository.findDistinctClientes();
    }

    public List<SelectFilterProjection> getNumf() {
        return movFatRepository.findDistinctNumNF();
    }

    public List<SelectFilterProjection> getNumtit() {
        return movFatRepository.findDistinctNumTit();
    }

    public List<SelectFilterProjection> getStatus() {
        return movFatRepository.findDistinctStatus();
    }

    public void importar(@Valid MovFatImportDTO importDTO) {
        movFatRepository.save(new MovFat(importDTO));
    }

    public List<SelectFilterProjection> getComissao() {
        List<SelectFilterProjection> comissoes = movFatRepository.findDistinctComissao();
        log.info("Comissões: {}", comissoes.stream().collect(Collectors.toMap(SelectFilterProjection::getId, SelectFilterProjection::getRecurso)));
        return comissoes;
    }
}
