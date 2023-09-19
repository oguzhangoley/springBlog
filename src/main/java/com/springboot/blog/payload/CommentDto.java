package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    private long id;
    @NotEmpty(message = "name should not be null or empty")
    private String name;
    @NotEmpty(message = "email should not be null or empty")
    @Email
    private String email;
    @NotEmpty(message = "body should not be null or empty")
    @Size(min = 10, message = "body should have at least 10 chars")
    private String body;
}
