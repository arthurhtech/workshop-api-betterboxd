package io.github.arthurhpro.betterboxd.controllers;

import io.github.arthurhpro.betterboxd.controllers.dto.filme.FilmeRequest;
import io.github.arthurhpro.betterboxd.controllers.dto.filme.FilmeResponse;
import io.github.arthurhpro.betterboxd.services.FilmeService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private final FilmeService filmeService;

    @PostMapping
    public ResponseEntity<FilmeResponse> criar(@RequestBody @Valid FilmeRequest request) {

        FilmeResponse response = filmeService.criar(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
