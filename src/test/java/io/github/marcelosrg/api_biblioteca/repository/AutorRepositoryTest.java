package io.github.marcelosrg.api_biblioteca.repository;

import io.github.marcelosrg.api_biblioteca.model.Autor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

@DataJpaTest
public class AutorRepositoryTest {
    @Autowired
    AutorRepository autorRepository;

    @Test
    public void salvarTeste( ){
        Autor autor = new Autor();
        autor.setName("Marcelo");
        autor.setNacionalidade("Minas Gerais");
        autor.setDataNascimento(LocalDate.of(2005, 4, 24));
        var autorSalvo = autorRepository.save(autor);
        System.out.println("autor salvo: " + autorSalvo);
    }

    @Test
    public void atualizarTest(){
        var id = UUID.fromString("711339f9-3548-4169-bb0f-92c8cf25c26b");

        Optional<Autor> autorOptional = autorRepository.findById(id);

        if(autorOptional.isPresent()) {
            Autor autor = autorOptional.get();
            System.out.println("Dados do Autor: " + autorOptional.get());
            System.out.println(autor);
            autor.setDataNascimento(LocalDate.of(2005, 4, 24));
            autorRepository.save(autor);
        }
    }
}
