
package com.portfolio.vish.Security.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min = 1, max = 200, message ="no cumple con la longitud")
    private String nombre;
     @NotNull
     @Column(unique =true)
     @Size(min = 1, max = 200, message ="no cumple con la longitud")
    private String nombreUsuario;
      @NotNull
      @Size(min = 1, max = 200, message ="no cumple con la longitud")
    private String email;
       @NotNull
    private String password;
       @ManyToMany(fetch = FetchType.EAGER)
       @JoinTable(name = "usuario_rol", joinColumns= @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name ="rol_id"))
       private Set<Rol> roles = new HashSet<>();
       
   

    public Usuario() {
    }

    public Usuario(String nombre, String nombreUsuario, String email, String password) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }

    
}
