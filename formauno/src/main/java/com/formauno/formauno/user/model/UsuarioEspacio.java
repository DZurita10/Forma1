package com.formauno.formauno.user.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "SEG_USUARIO_ESPACIO")
public class UsuarioEspacio {
    @EmbeddedId
    private UsuarioEspaciopk pk;
    @Column(name = "ROL", nullable = false, length = 3)
    private String rol;
    @Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", insertable = false, updatable = false),
        @JoinColumn(name = "COD_ESPACIO", referencedColumnName = "COD_ESPACIO", insertable = false, updatable = false)
    })

    private Espacio espacio;
    private User user;

    public UsuarioEspacio(UsuarioEspaciopk pk) {
        this.pk = pk;
    }
    
}
