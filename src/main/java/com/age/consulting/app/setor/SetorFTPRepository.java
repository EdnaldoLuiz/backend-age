package com.age.consulting.app.setor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetorFTPRepository extends JpaRepository<SetorFTP,Integer> {
}
