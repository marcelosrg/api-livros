package io.github.marcelosrg.api_biblioteca.dto;
import io.github.marcelosrg.api_biblioteca.model.Autor;

import java.time.LocalDate;
public record AutorDto(
        String nome,
        LocalDate dataNascimento,
        String nacionalidade
) {

    public Autor mapperToAutor(){
     Autor autor = new Autor();
     autor.setNome(this.nome);
     autor.setDataNascimento(this.dataNascimento);
     autor.setNacionalidade(this.nacionalidade);


     return autor;
    }
}
