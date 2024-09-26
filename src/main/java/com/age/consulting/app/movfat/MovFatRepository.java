package com.age.consulting.app.movfat;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MovFatRepository extends JpaRepository<MovFat, Long>, JpaSpecificationExecutor<MovFat> {

    @Query(value = """
            SELECT new com.age.consulting.app.movfat.MovFatProjection(
                mv.mesAno AS data,
                mv.razaoSocial AS razaoSocial,
                mv.cliente AS cliente,
                mv.vencimento AS vencimento,
                mv.nf AS nf,
                mv.numNF AS numNF,
                mv.numTit AS numTit,
                mv.dtpg AS dtPg,
                mv.status AS status,
                mv.comissao AS comissao
                )
            FROM
                MovFat mv
            """)
    Page<MovFatProjection> findTest(Pageable pageable);

    @Query("""
            SELECT MIN(mv.id) id, mv.razaoSocial AS recurso
            FROM MovFat mv
            GROUP BY mv.razaoSocial
            """)
    List<SelectFilterProjection> findDistinctRazaoSocial();

    @Query("""
            SELECT MIN(mv.id) AS id, mv.cliente AS recurso
            FROM MovFat mv
            GROUP BY mv.cliente
            """)
    List<SelectFilterProjection> findDistinctClientes();

    @Query("""
            SELECT MIN(mv.id) AS id, mv.numNF AS recurso
            FROM MovFat mv
            GROUP BY mv.numNF
            """)
    List<SelectFilterProjection> findDistinctNumNF();

    @Query("""
            SELECT MIN(mv.id) AS id, mv.numTit AS recurso
            FROM MovFat mv
            GROUP BY mv.numTit
            """)
    List<SelectFilterProjection> findDistinctNumTit();

    @Query("""
            SELECT MIN(mv.id) AS id, mv.status AS recurso
            FROM MovFat mv
            GROUP BY mv.status
            """)
    List<SelectFilterProjection> findDistinctStatus();

    @Query("""
            SELECT MIN(mv.id) AS id, mv.comissao AS recurso
            FROM MovFat mv
            GROUP BY mv.comissao
            """)
    List<SelectFilterProjection> findDistinctComissao();


    @Query("""
    SELECT new com.age.consulting.app.movfat.MovFatProjection(
        mv.mesAno AS data,
        mv.razaoSocial AS razaoSocial,
        mv.cliente AS cliente,
        mv.vencimento AS vencimento,
        mv.nf AS nf,
        mv.numNF AS numNF,
        mv.numTit AS numTit,
        mv.dtpg AS dtPg,
        mv.status AS status,
        mv.comissao AS comissao
        )
    FROM
        MovFat mv
    """)
List<MovFatProjection> findAllSearch();

}
