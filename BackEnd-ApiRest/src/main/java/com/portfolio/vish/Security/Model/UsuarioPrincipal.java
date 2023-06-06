package com.portfolio.vish.Security.Model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Getter @Setter
public class UsuarioPrincipal implements UserDetails{
    @NotNull
    @Size(min = 1, max = 200, message ="no cumple con la longitud")
    private String nombre;
    @NotNull
    @Size(min = 1, max = 200, message ="no cumple con la longitud")
    private String nombreUsuario;
    @NotNull
    @Size(min = 1, max = 200, message ="no cumple con la longitud")
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;
    
   

    public UsuarioPrincipal(String nombre, String nombreUsuario, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }
    public static UsuarioPrincipal build(Usuario usuario){
    List<GrantedAuthority> authorities = usuario.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol.getRolNombre().name())).collect(Collectors.toList());
            
    return new UsuarioPrincipal(usuario.getNombre(), usuario.getNombreUsuario(), usuario.getEmail(), usuario.getPassword(), authorities);
}
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

      
    public String getNombre() {
      return nombre;
    }
     
    public String getEmail() {
      return email;
    }
    
    @Override
    public String getUsername() {
      return nombreUsuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
         return true;
    }

    @Override
    public boolean isEnabled() {
         return true;
    }

}
