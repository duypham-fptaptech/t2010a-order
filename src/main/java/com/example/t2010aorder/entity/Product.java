package com.example.t2010aorder.entity;

import com.example.t2010aorder.entity.base.BaseEntity;
import com.example.t2010aorder.entity.enums.ProductSimpleStatus;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    @Id
    private String id;
    private String name;
    private String slug;
    private String description;
    private String detail; // text
    private String thumbnails; // nhiều ảnh cách nhau bởi dấu ,
    private BigDecimal price;
    @Enumerated(EnumType.ORDINAL)
    private ProductSimpleStatus status;

    public Product(){
        this.setCreatedAt(LocalDateTime.now());
        this.setUpdatedAt(LocalDateTime.now());
    }
}
