package com.portfolio.vish.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Vish
 */
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
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
    @NotBlank
    private String passworduser;
    @NotNull
    private String imguser;

}