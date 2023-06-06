
package com.portfolio.vish.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Vish
 */
@Getter @Setter
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

    public Experiencia() {
    }

    public Experiencia(int id, String nombreexp, String descripcionexp, String badges, Date inicioexp, Date finexp) {
        this.id = id;
        this.nombreexp = nombreexp;
        this.descripcionexp = descripcionexp;
        this.badges = badges;
        this.inicioexp = inicioexp;
        this.finexp = finexp;
    }


   
   
}
