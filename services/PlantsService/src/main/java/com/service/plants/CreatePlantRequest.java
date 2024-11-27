package com.service.plants;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatePlantRequest {
    @JsonProperty("name")
    public String name;
}
