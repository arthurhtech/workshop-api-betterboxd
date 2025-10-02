package io.github.arthurhpro.betterboxd.services;

import io.github.arthurhpro.betterboxd.controllers.dto.categoria.CategoriaRequest;
import io.github.arthurhpro.betterboxd.controllers.dto.categoria.CategoriaResponse;
import io.github.arthurhpro.betterboxd.entities.Categoria;
import io.github.arthurhpro.betterboxd.repositories.CategoriaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    @Transactional
    public CategoriaResponse criar(CategoriaRequest request){
        var categoria = new Categoria(request.nome());
        var response = categoriaRepository.save(categoria);

        return new CategoriaResponse(response.getId(), response.getNome());
    }

    @Transactional(readOnly = true)
    public List<CategoriaResponse> buscarTodos(){
        List<Categoria> categorias = categoriaRepository.findAll();

        List<CategoriaResponse> response = categorias.stream().map(categoria ->
                new CategoriaResponse(categoria.getId(), categoria.getNome()))
                        .toList();

        return response;
    }

    protected Categoria buscarEntidadePorId(Long id) {
        return categoriaRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Categoria não encontrada")
        );
    }

}
