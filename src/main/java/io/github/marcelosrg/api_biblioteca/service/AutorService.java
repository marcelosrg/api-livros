package io.github.marcelosrg.api_biblioteca.service;

import io.github.marcelosrg.api_biblioteca.dto.AutorDto;
import io.github.marcelosrg.api_biblioteca.model.Autor;
import io.github.marcelosrg.api_biblioteca.repository.AutorRepository;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public Autor salvar(Autor autor) {
        return autorRepository.save(autor);
    }
}
