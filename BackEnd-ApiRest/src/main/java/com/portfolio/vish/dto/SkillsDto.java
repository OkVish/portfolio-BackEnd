
package com.portfolio.vish.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


/**
 *
 * @author Vish
 */

@AllArgsConstructor
@NoArgsConstructor
public class SkillsDto {
    @NotBlank
     private String nombreskill;
    @NotBlank
     private String porcentajeskill;
    @NotBlank
     private String imgurl;

    public String getNombreskill() {
        return nombreskill;
    }

    public void setNombreskill(String nombreskill) {
        this.nombreskill = nombreskill;
    }

    public String getPorcentajeskill() {
        return porcentajeskill;
    }

    public void setPorcentajeskill(String porcentajeskill) {
        this.porcentajeskill = porcentajeskill;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
     
     
}
