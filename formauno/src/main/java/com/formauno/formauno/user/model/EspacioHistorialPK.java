package com.formauno.formauno.user.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class EspacioHistorialPK implements Serializable{
    @Column(name = "COD_ESPACIO_HISTORIAL", nullable = false)
    private Integer codEspacioHistorial;
}
