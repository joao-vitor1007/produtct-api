package com.senai.produtct_api.model;

import com.senai.produtct_api.dto.CategoryDTO;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public static Category convert(CategoryDTO categoryDTO) {
        Category category = new Category();

        if (categoryDTO.getId() != null) {
            category.setId(categoryDTO.getId());
        }

        category.setNome(categoryDTO.getNome());
        return category;
    }
}