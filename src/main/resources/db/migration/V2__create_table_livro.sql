
CREATE TABLE livro(
    id uuid not null primary key,
    isbn varchar(20) not null,
    titulo varchar(255) not null,
    dataPublicacao date not null,
    genero varchar(30) not null,
    preco numeric (18,2),
    idAutor uuid not null references autor(id)

constraint chk_genero check (genero in ('FICCAO', 'FANTASIA', 'MISTERIO', 'ROMANCE'))
)