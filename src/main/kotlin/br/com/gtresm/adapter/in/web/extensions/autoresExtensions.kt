package br.com.gtresm.adapter.`in`.web.extensions

import br.com.gtresm.adapter.`in`.web.resources.AutorResourceRequest
import br.com.gtresm.application.domain.Author

fun AutorResourceRequest.toAutorDomain(): Author = Author(
    id = this.id,
    nome = this.nome,
    email = this.email,
    descricao = this.descricao
)

fun Author.toNovoAutorResourceRequest(): AutorResourceRequest = AutorResourceRequest(
    id = this.id,
    nome = this.nome,
    email = this.email,
    descricao = this.descricao
)