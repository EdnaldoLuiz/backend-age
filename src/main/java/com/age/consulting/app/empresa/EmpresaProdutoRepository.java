package com.age.consulting.app.empresa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaProdutoRepository extends JpaRepository<EmpresaProduto,Integer> {
}
