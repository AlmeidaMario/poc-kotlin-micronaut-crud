package br.com.gtresm.adapter.`in`.web.extensions

import br.com.gtresm.adapter.`in`.web.resources.AutorResourceRequest
import br.com.gtresm.application.domain.Autor

fun AutorResourceRequest.toAutorDomain(): Autor = Autor(
    nome = this.nome,
    email = this.email,
    descricao = this.descricao
)

fun Autor.toNovoAutorResourceRequest(): AutorResourceRequest = AutorResourceRequest(
    nome = this.nome,
    email = this.email,
    descricao = this.descricao
)