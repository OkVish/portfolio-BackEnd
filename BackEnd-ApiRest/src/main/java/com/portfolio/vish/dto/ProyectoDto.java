
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
public class ProyectoDto {
    @NotBlank
    private String nombrepr;
    @NotBlank
    private String urlgit;
    @NotBlank
    private String urlpr;
    @NotBlank
    private String imgurl;

    public String getNombrepr() {
        return nombrepr;
    }

    public void setNombrepr(String nombrepr) {
        this.nombrepr = nombrepr;
    }

    public String getUrlgit() {
        return urlgit;
    }

    public void setUrlgit(String urlgit) {
        this.urlgit = urlgit;
    }

    public String getUrlpr() {
        return urlpr;
    }

    public void setUrlpr(String urlpr) {
        this.urlpr = urlpr;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
    
    
}
