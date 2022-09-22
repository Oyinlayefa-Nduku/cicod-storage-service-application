package com.project.cicodstorageservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

//It represents the Todo in the database
public class Todo {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String imagePath;
    private String imageFileName;


}
