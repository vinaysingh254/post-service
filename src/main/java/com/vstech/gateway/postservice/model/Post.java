package com.vstech.gateway.postservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: vinay
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Post {

    private Long id;
    private String title;
    private String description;

}
