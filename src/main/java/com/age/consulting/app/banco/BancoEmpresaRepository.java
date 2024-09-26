package com.age.consulting.app.banco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoEmpresaRepository extends JpaRepository<BancoEmpresa,Integer> {
}
