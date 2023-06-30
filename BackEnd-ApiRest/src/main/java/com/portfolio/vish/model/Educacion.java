
package com.portfolio.vish.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Educacion {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min = 1, max = 200, message ="no cumple con la longitud")
    private String nombreedu;
    @NotNull
    @Size(min = 1, max = 200, message ="no cumple con la longitud")
    private String lugaredu;
    @NotNull
     @Size(min = 1, max = 200, message ="no cumple con la longitud")
    private String cursoedu;
    @NotNull
    private String urledu;


}
