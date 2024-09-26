package com.age.consulting.app.movfat.relatorio;

import java.util.EnumMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.age.consulting.app.enums.RelatorioType;

@Component
public class RelatorioFactory {

    private final Map<RelatorioType, RelatorioStrategy> strategies;

    public RelatorioFactory(RelatorioPdfStrategy pdfStrategy, RelatorioXlsxStrategy excelStrategy) {
        strategies = new EnumMap<>(RelatorioType.class);
        strategies.put(RelatorioType.PDF, pdfStrategy);
        strategies.put(RelatorioType.XLSX, excelStrategy);
    }

    public RelatorioStrategy getStrategy(RelatorioType tipo) {
        return strategies.get(tipo);
    }
}
