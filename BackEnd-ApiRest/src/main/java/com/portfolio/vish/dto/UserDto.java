
package com.portfolio.vish.dto;

import com.portfolio.vish.model.User;
import com.portfolio.vish.repository.UserRepository;
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
@Setter @Getter
public class UserDto {
    @NotBlank(message = "El email no puede estar vacío")
    @Email(message = "El email no es válido")
    private String emailuser;

    @NotBlank(message = "La contraseña no puede estar vacía")
    private String passworduser;

}