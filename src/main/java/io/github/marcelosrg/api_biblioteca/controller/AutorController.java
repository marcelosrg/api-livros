package io.github.marcelosrg.api_biblioteca.controller;

import io.github.marcelosrg.api_biblioteca.dto.AutorDto;
import io.github.marcelosrg.api_biblioteca.model.Autor;
import io.github.marcelosrg.api_biblioteca.service.AutorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("api/v1/autores")
public class AutorController {

    private AutorService autorService;
    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping()
    public Object salvar(@RequestBody AutorDto autor){
        Autor autorEntidade = autor.mapperToAutor();
         autorService.salvar(autorEntidade);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(autorEntidade.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
