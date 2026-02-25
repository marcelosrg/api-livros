package io.github.marcelosrg.api_biblioteca.controller;

import io.github.marcelosrg.api_biblioteca.dto.AutorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/autores")
public class AutorController {

    @PostMapping(name = "/criar")
    public Object salvar(@RequestBody AutorDto autor){

        return new ResponseEntity("Autor salvo com sucesso!" + autor, HttpStatus.CREATED)

    }
}
