package com.portfolio.vish.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Vish
 */
@Getter @Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min = 1, max = 200, message ="no cumple con la longitud")
    private String nombreuser;
    @NotNull
    @Size(min = 1, max = 100, message ="no cumple con la longitud")
    private String titulouser;
    @Lob
    @NotNull
    @Size(min = 1, max = 1000, message ="no cumple con la longitud")
    private String acercauser;
    @NotNull
    @Size(min = 1, max = 500, message ="no cumple con la longitud")
    private String emailuser;
    @NotNull
    private String imguser;

    public User() {
    }

    public User(int id, String nombreuser, String titulouser, String acercauser, String emailuser, String imguser) {
        this.id = id;
        this.nombreuser = nombreuser;
        this.titulouser = titulouser;
        this.acercauser = acercauser;
        this.emailuser = emailuser;
        this.imguser = imguser;
    }

}