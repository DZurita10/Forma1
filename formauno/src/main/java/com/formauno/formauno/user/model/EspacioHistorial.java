package com.formauno.formauno.user.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "GDC_ESPACIO_HISTORIAL")
public class EspacioHistorial {
    @EmbeddedId
    private EspacioHistorialPK pk;
    @Column(name = "FECHA", nullable = false)
    private Date fecha;
    @Column(name = "ACCION", nullable = false, length = 8)
    private String accion;
    @Column(name = "USERNAME", nullable = false, length = 32)
    private String userName;
    @Column(name = "DESCRIPCION", nullable = false, length = 128)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "COD_ESPACIO", referencedColumnName = "COD_ESPACIO", insertable = false, updatable = false)

    private Espacio espacio;

    public EspacioHistorial(EspacioHistorialPK pk) {
        this.pk = pk;
    }
    
}
