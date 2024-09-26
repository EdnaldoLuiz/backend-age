package com.age.consulting.app.movfat;

import org.springframework.data.jpa.domain.Specification;

import jakarta.persistence.criteria.Predicate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MovFatSpecs {

    public static Specification<MovFat> withBetweenDates(String fieldName, LocalDate startDate, LocalDate endDate) {
        return (root, query, cb) -> {
            if (startDate == null && endDate == null)
                return null;
            if (startDate == null)
                return cb.lessThanOrEqualTo(root.get(fieldName), endDate);
            if (endDate == null)
                return cb.greaterThanOrEqualTo(root.get(fieldName), startDate);
            return cb.between(root.get(fieldName), startDate, endDate);
        };
    }

    public static Specification<MovFat> withIn(String fieldName, List<String> values) {
        return (root, query, cb) -> values == null || values.isEmpty() ? null : root.get(fieldName).in(values);
    }

    public static Specification<MovFat> withInBigDecimal(String fieldName, List<BigDecimal> values) {
        return (root, query, cb) -> values == null || values.isEmpty() ? null : root.get(fieldName).in(values);
    }

    public static Specification<MovFat> withTextSearch(String searchTerm, List<String> fields) {
        return (root, query, cb) -> {
            if (searchTerm == null || searchTerm.isEmpty())
                return null;
    
            List<Predicate> predicates = new ArrayList<>();
    
            for (String field : fields) {
                Class<?> fieldType = root.get(field).getJavaType();
                if (Number.class.isAssignableFrom(fieldType)) {
                    try {
                        predicates.add(cb.equal(root.get(field), Integer.parseInt(searchTerm)));
                    } catch (NumberFormatException e) {
                        continue;
                    }
                } else {
                    predicates.add(cb.like(cb.lower(root.get(field)), "%" + searchTerm.toLowerCase() + "%"));
                }
            }
    
            return cb.or(predicates.toArray(new Predicate[0])); 
        };
    }
    
}
