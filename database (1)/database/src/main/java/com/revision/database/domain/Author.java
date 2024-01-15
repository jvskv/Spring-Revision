package com.revision.database.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   // Equals, getters, setters etc
@AllArgsConstructor
@NoArgsConstructor
@Builder // Builder pattern
public class Author {

    private Long id;
    private String name;
    private Integer age;

}
