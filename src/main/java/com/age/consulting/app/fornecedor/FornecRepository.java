package com.age.consulting.app.fornecedor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecRepository extends JpaRepository<Fornec,Integer> {
}
