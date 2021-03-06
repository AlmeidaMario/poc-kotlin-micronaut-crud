package br.com.gtresm.adapter.`in`.web.extensions

import br.com.gtresm.adapter.`in`.web.resources.AuthorUpdateResourceRequest
import br.com.gtresm.adapter.`in`.web.resources.AuthorResourceRequest
import br.com.gtresm.adapter.`in`.web.resources.AuthorResourceResponse
import br.com.gtresm.application.domain.Author

fun AuthorUpdateResourceRequest.toAuthorDomain(): Author = Author(
    id = this.id,
    nome = this.nome,
    email = this.email,
    descricao = this.descricao
)


fun AuthorResourceRequest.toAuthorDomain(): Author = Author(
    id = null,
    nome = this.nome,
    email = this.email,
    descricao = this.descricao
)

fun Author.toAuthorResourceResponse(): AuthorResourceResponse = AuthorResourceResponse(
    id = this.id,
    nome = this.nome,
    email = this.email,
    descricao = this.descricao
)