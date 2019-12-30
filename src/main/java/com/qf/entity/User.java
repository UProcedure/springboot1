package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author qq166
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    @NotNull
    private String username;
    @NotBlank
    private String password;
    @Email
    private String email;

    private Integer isAdmin;


}