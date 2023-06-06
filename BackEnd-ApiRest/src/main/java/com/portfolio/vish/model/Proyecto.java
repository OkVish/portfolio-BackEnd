
package com.portfolio.vish.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Proyecto {
       @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
       private int id;
       @NotNull
       @Size(min = 1, max = 1000, message ="no cumple con la longitud")
    private String nombrepr;
       @NotNull
    private String urlgit;
       @NotNull
    private String urlpr;
       @NotNull
    private String imgurl;

    public Proyecto() {
    }

    public Proyecto(int id, String nombrepr, String urlgit, String urlpr, String imgurl) {
        this.id = id;
        this.nombrepr = nombrepr;
        this.urlgit = urlgit;
        this.urlpr = urlpr;
        this.imgurl = imgurl;
    }

    
}