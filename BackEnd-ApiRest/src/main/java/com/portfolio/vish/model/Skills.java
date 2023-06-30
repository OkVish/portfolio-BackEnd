
package com.portfolio.vish.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
public class Skills {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     @NotNull
     @Size(min = 1, max = 100, message ="no cumple con la longitud")
     private String nombreskill;
     @NotNull
     @Min(1)
     @Max(100)
     private int porcentajeskill;
     @NotNull
     private String imgurl;


}
