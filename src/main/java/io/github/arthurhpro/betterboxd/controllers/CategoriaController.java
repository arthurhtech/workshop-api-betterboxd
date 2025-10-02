package io.github.arthurhpro.betterboxd.controllers;

import io.github.arthurhpro.betterboxd.controllers.dto.categoria.CategoriaRequest;
import io.github.arthurhpro.betterboxd.controllers.dto.categoria.CategoriaResponse;
import io.github.arthurhpro.betterboxd.services.CategoriaService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<CategoriaResponse> criar(@RequestBody @Valid CategoriaRequest request){
        var response = categoriaService.criar(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<CategoriaResponse>> buscarTodos(){
        List<CategoriaResponse> response = categoriaService.buscarTodos();
        return ResponseEntity.ok(response);
    }


}
