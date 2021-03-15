package br.com.gtresm.adapter.`in`.web.extensions

import br.com.gtresm.adapter.`in`.web.resources.NovoAutorResourceRequest
import br.com.gtresm.application.domain.Autor

fun NovoAutorResourceRequest.toAutorDomain(): Autor = Autor(
    nome = this.nome,
    email = this.email,
    descricao = this.descricao
)

fun Autor.toNovoAutorResourceRequest(): NovoAutorResourceRequest = NovoAutorResourceRequest(
    nome = this.nome,
    email = this.email,
    descricao = this.descricao
)