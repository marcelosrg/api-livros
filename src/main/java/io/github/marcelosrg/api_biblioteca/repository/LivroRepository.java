package io.github.marcelosrg.api_biblioteca.repository;

import io.github.marcelosrg.api_biblioteca.model.Autor;
import io.github.marcelosrg.api_biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {
    List<Livro> findByAutor(Autor autor);
    List<Livro> findByTitulo(String titulo);
    List<Livro> findByIsbn(String isbn);
    List<Livro> findByTituloOrIsbn(String titulo, String isbn);
    List<Livro> findByTituloAndPreco(String titulo, BigDecimal preco);
}
