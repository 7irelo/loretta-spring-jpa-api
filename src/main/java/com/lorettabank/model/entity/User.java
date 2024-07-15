package com.lorettabank.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(unique = true, nullable = false)
    @NotBlank(message = "Username is mandatory")
    private String username;

    @Column(nullable = false)
    @NotBlank
    private String password;

    @JsonProperty("name")
    @Column(nullable = false)
    @NotBlank(message = "First Name is mandatory")
    private String firstName;

    @JsonProperty("surname")
    @Column(nullable = false)
    @NotBlank(message = "Last Name is mandatory")
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
    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "role")
    private Set<String> roles = new HashSet<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
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
