package com.ms.oauthsecurity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class UserAccount {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private boolean active;

    public UserAccount(String username, String password, boolean active) {
        this.username = username;
        this.password = password;
        this.active = active;
    }

}
