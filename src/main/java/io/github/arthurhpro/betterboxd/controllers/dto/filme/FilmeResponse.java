package io.github.arthurhpro.betterboxd.controllers.dto.filme;

import io.github.arthurhpro.betterboxd.controllers.dto.categoria.CategoriaResponse;

public record FilmeResponse(
        Long id,
        String nome,
        String descricao,
        String urlTrailer,
        CategoriaResponse categoria
) {
}
