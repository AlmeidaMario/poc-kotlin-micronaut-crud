package br.com.gtresm.adapter.out_.persistence.extension

import br.com.gtresm.adapter.out_.persistence.entity.AutorEntity
import br.com.gtresm.application.domain.Author

fun AutorEntity.toAuthorDomain(): Author = Author(
    id = this.id,
    nome = this.nome,
    email= this.email,
    descricao = this.descricao
)

fun List<AutorEntity>.toAuthorDomainList(): List<Author> = this.map {
    Author(
        id = it.id,
        nome = it.nome,
        email = it.email,
        descricao = it.descricao
    )
}

fun Author.toAuthorEntity(): AutorEntity = AutorEntity(
    nome = this.nome,
    email= this.email,
    descricao = this.descricao
)