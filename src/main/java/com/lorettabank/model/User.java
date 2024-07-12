package com.lorettabank.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.*;

import java.util.*;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User implements UserDetails {

    @Id
    @Column(unique = true, nullable = false)
    @NotBlank(message = "ID Number is mandatory")
    private String id;

    @Column(unique = true, nullable = false)
    @NotBlank(message = "Username is mandatory")
    private String username;

    @Column(nullable = false)
    @NotBlank
    private String password;

    @Column(nullable = false)
    @NotBlank(message = "First Name is mandatory")
    private String firstName;

    @Column(nullable = false)
    @NotBlank(message = "First Name is mandatory")
    private String lastName;

    @Column(unique = true, nullable = false)
    @Email
    @NotBlank(message = "Email is mandatory")
    private String email;

    @Column(unique = true, nullable = false)
    @NotBlank(message = "Phone Number is mandatory")
    private String phone;

    @Column(nullable = false)
    @NotBlank(message = "Address is mandatory")
    private String address;

    private String occupation;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date created = new Date();

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> roles = new HashSet<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // ToString method for debugging and logging

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", roles=" + roles +
                '}';
    }

}
