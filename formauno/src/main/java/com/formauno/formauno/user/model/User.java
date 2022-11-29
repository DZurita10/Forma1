package com.formauno.formauno.user.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "SEG_USER")
public class User {
    @Embedded
    private UserPk pk;
    @Column(name = "USERNAME", nullable = false, length = 32)
    private String userName;
    @Column(name = "NAME", nullable = false, length = 128)
    private String name;
    @Column(name = "EMAIL", nullable = false, length = 128)
    private String email;
    @Column(name = "status", nullable = false, length = 3)
    private String status;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;

    public User(UserPk pk) {
        this.pk = pk;
    }
    
}
