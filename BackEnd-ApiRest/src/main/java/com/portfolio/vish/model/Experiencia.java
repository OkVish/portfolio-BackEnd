
package com.portfolio.vish.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 *
 * @author Vish
 */
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Experiencia {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   @NotNull
   @Size(min = 1, max = 100, message ="no cumple con la longitud")
   private String nombreexp;
   @NotNull
   @Lob
   @Size(min = 1, max = 1000, message ="no cumple con la longitud")
   private String descripcionexp;
   @NotNull
   @Size(min = 1, max = 100, message ="no cumple con la longitud")
   private String badges;
   @NotNull
   @Temporal(jakarta.persistence.TemporalType.DATE)
   private Date inicioexp;
   @NotNull
   @Temporal(jakarta.persistence.TemporalType.DATE)
   private Date finexp;


}
