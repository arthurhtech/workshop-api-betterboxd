package io.github.arthurhpro.betterboxd.controllers.dto.categoria;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CategoriaRequest(

       @NotBlank @Size(min = 2, max = 50) String nome

) {


}
