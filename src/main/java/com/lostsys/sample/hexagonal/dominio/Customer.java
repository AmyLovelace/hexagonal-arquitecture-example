package com.lostsys.sample.hexagonal.dominio;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Customer {
    private String id;
    private String name;
    private String country;
}
