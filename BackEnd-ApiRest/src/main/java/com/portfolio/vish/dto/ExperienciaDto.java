
package com.portfolio.vish.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
;

/**
 *
 * @author Vish
 */

@AllArgsConstructor
@NoArgsConstructor
public class ExperienciaDto {
     @NotBlank
   private String nombreexp;
     @NotBlank
   private String descripcionexp;
     @NotBlank
   private String badges;
     @NotBlank
   private String inicioexp;
     @NotBlank
   private String finexp;

    public String getNombreexp() {
        return nombreexp;
    }

    public void setNombreexp(String nombreexp) {
        this.nombreexp = nombreexp;
    }

    public String getDescripcionexp() {
        return descripcionexp;
    }

    public void setDescripcionexp(String descripcionexp) {
        this.descripcionexp = descripcionexp;
    }

    public String getBadges() {
        return badges;
    }

    public void setBadges(String badges) {
        this.badges = badges;
    }

    public String getInicioexp() {
        return inicioexp;
    }

    public void setInicioexp(String inicioexp) {
        this.inicioexp = inicioexp;
    }

    public String getFinexp() {
        return finexp;
    }

    public void setFinexp(String finexp) {
        this.finexp = finexp;
    }
   
   
}
