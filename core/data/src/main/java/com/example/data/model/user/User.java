package com.example.data.model.user;

import com.example.data.model.base.BaseModel;
import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "users")
public class User extends BaseModel {
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
}
