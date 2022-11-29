package com.formauno.formauno.user.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formauno.formauno.user.model.UsuarioEspacio;
import com.formauno.formauno.user.model.UsuarioEspacioPK;


@Repository
public interface UsuarioEspacioRepository extends JpaRepository<UsuarioEspacio, UsuarioEspacioPK>{
    List<UsuarioEspacio> findByPkCodEspacio(Integer codEspacio);
    List<UsuarioEspacio> findByPkCodUser(Integer codUser);
}
