package com.formauno.formauno.user.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formauno.formauno.user.model.EspacioHistorial;
import com.formauno.formauno.user.model.EspacioHistorialPK;

@Repository
public interface EspacioHistorialRepository extends JpaRepository<EspacioHistorial, EspacioHistorialPK>{
    List<EspacioHistorial> findByPkCodEspacio(Integer codEspacio);
}