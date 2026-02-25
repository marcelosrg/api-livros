package io.github.marcelosrg.api_biblioteca.repository;

import io.github.marcelosrg.api_biblioteca.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<Autor, UUID> {
}
