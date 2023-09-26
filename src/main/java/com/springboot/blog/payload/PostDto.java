package com.springboot.blog.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "PostDto model class Description")
public class PostDto {
    private Long id;
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 chars")
    @Schema(description = "Post Title Description")
    private String title;
    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 chars")
    private String description;
    @NotEmpty
    private String content;
    private long categoryId;
    private Set<CommentDto> comments;
}
