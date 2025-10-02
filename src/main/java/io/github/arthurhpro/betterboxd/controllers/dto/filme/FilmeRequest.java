package io.github.arthurhpro.betterboxd.controllers.dto.filme;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FilmeRequest(
        @NotBlank String nome,
        @NotBlank String descricao,
        @NotBlank String urlTrailer,
        @NotNull Long categoriaId
) {
}
