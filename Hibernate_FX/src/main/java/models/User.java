/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Modelo Usuario
 * @author Doctor32
 */

@Entity
@Table(name="users")
public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy=IDENTITY)
    private Long id_user;
    
    private String username;
    
    private String password;
    
    private String email;

    public User() {
    }

    public User(Long id, String username, String password, String email) {
        this.id_user = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Long getId() {
        return id_user;
    }

    public void setId(Long id) {
        this.id_user = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User: " + " || " + id_user + " || " + username + " || " +
                password + " || " + email;
    }
    
    
}
