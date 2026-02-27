package io.github.marcelosrg.api_biblioteca.model;
import io.github.marcelosrg.api_biblioteca.enums.Genero;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@Table(name = "LIVRO", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID")
    private UUID id;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "DATAPUBLICACAO")
    private LocalDate dataPublicacao;

    @Column(name = "PRECO")
    private BigDecimal preco;

    @Column(name = "GENERO")
    @Enumerated(EnumType.STRING)
    private Genero genero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idAutor")
    private Autor autor;


}
