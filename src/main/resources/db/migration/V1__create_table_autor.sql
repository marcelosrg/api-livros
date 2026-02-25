CREATE TABLE autor (
    id uuid not null primary key,
    nome varchar(100) not null,
    dataNascimento date not null,
    nacionalidade varchar (50)
)
