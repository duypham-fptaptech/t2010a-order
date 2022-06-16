package com.example.t2010aorder.entity;

import com.example.t2010aorder.entity.enums.ProductSimpleStatus;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class User {
    @Id
    private String id;
    private String fullName;
    private String phone;
    private String email;
    private ProductSimpleStatus status;
}
