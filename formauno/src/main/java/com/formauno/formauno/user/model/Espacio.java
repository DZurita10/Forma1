package com.formauno.formauno.user.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "GDC_ESPACIO")
public class Espacio {
    @EmbeddedId
    private EspacioPK pk;
    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;
    @Column(name = "descripcion", nullable = false, length = 500)
    private String descripcion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;
    @Column(name = "VISIBILIDAD", nullable = false, length = 3)
    private String visibilidad;

    public Espacio(EspacioPK pk) {
        this.pk = pk;
    }
}
