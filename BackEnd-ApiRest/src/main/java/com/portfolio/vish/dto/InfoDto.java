
package com.portfolio.vish.dto;

import jakarta.persistence.Basic;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

/**
 *
 * @author Vish
 */

@AllArgsConstructor
@NoArgsConstructor
public class InfoDto {
  @NotBlank
  private String nombreuser;
  @NotBlank
  private String titulouser;
  @NotBlank
  private String acercauser;
  @NotBlank
  private String imguser;

}