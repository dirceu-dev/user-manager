package com.dev.dirceu.user_manager.users.domain.entities;

import com.dev.dirceu.user_manager.users.domain.enums.Profile;
import com.dev.dirceu.user_manager.users.domain.enums.Provider;
import com.dev.dirceu.user_manager.users.domain.enums.UserType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name="USERS")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.UUID)
    private UUID id;

    @NotBlank
    @Column(length = 50)
    private String firstName;
    @NotBlank
    @Column(length = 100)
    private String lastName;
    @NotBlank
    @Email
    @Column(unique = true, length = 100)
    private String email;
    @NotBlank
    @Column(length = 30)
    private String password;
    private UserType userType;
    private Provider provider;
    @NotBlank
    @Email
    @Column(unique = true, length = 20)
    private String document;
    private Profile profile;
    private String photo;
    private String description;
    private Boolean active;
    private Boolean deleted;
 }
