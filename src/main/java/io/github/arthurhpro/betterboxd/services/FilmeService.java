package io.github.arthurhpro.betterboxd.services;

import io.github.arthurhpro.betterboxd.controllers.dto.categoria.CategoriaResponse;
import io.github.arthurhpro.betterboxd.controllers.dto.filme.FilmeRequest;
import io.github.arthurhpro.betterboxd.controllers.dto.filme.FilmeResponse;
import io.github.arthurhpro.betterboxd.entities.Categoria;
import io.github.arthurhpro.betterboxd.entities.Filme;
import io.github.arthurhpro.betterboxd.repositories.FilmeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FilmeService {

    private final FilmeRepository filmeRepository;
    private final CategoriaService categoriaService;

    @Transactional
    public FilmeResponse criar(FilmeRequest request) {

        Filme filme = new Filme(request.nome(), request.descricao(), request.urlTrailer());

        // buscar categoria
        Categoria categoria = categoriaService.buscarEntidadePorId(request.categoriaId());

        filme.setCategoria(categoria);
        filme = filmeRepository.save(filme);

        CategoriaResponse categoriaResponse = new CategoriaResponse(categoria.getId(), categoria.getNome());
        FilmeResponse response = new FilmeResponse(
                filme.getId(),
                filme.getNome(),
                filme.getDescricao(),
                filme.getUrlTrailer(),
                categoriaResponse);

        return response;
    }

}
