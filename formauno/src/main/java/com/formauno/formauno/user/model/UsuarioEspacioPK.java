package com.formauno.formauno.user.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class UsuarioEspacioPK implements Serializable{
    @Column(name = "COD_ESPACIO", nullable = false)
    private Integer codEspacio;
    @Column(name = "COD_USER", nullable = false)
    private Integer codUser;
}