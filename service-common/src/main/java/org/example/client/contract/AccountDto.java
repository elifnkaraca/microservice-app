package org.example.client.contract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {

    private String id;

    private String username;

    private String name;

    private String surname;

    private Date birthDate;

    private String email;

    public String getNameSurname(){
        return this.name + " " + this.surname;
    }
}

