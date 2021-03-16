package br.com.gtresm.adapter.out_.persistence.extension

import br.com.gtresm.adapter.out_.persistence.entity.AutorEntity
import br.com.gtresm.application.domain.Autor

fun AutorEntity.toAutorDomain(): Autor = Autor(
    nome = this.nome,
    email= this.email,
    descricao = this.descricao
)

fun List<AutorEntity>.toAutorDomainList(): List<Autor> = this.map {
    Autor(
        nome = it.nome,
        email= it.email,
        descricao = it.descricao
    )
}


fun Autor.toAutorEntity(): AutorEntity = AutorEntity(
    nome = this.nome,
    email= this.email,
    descricao = this.descricao
)