package io.github.marcelosrg.api_biblioteca.dto;
import java.time.LocalDate;
public record AutorDto(
        String name,
        LocalDate dataNascimento,
        String nacionalidade
) {
}
