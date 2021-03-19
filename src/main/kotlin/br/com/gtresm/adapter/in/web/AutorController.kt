package br.com.gtresm.adapter.`in`.web

import br.com.gtresm.adapter.`in`.web.extensions.toAuthorDomain
import br.com.gtresm.adapter.`in`.web.extensions.toAuthorResourceResponse
import br.com.gtresm.adapter.`in`.web.resources.AuthorResourceRequest
import br.com.gtresm.adapter.`in`.web.resources.AuthorUpdateResourceRequest
import br.com.gtresm.application.port.`in`.AuthorUseCase
import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import javax.transaction.Transactional
import javax.validation.Valid

@Validated
@Controller("/authors")
class AutorController(
    val authorUseCase: AuthorUseCase
) {

    @Post("/")
    fun createAuthor(
        @Body @Valid request: AuthorResourceRequest
    ) = authorUseCase.createAutor(request.toAuthorDomain()).toAuthorResourceResponse()

    @Get
    @Transactional
    fun getAuthor(
        @QueryValue(defaultValue = "") email: String
    ) = authorUseCase.getAutorByEmail(email)

    @Get("/all")
    @Transactional
    fun listAuthor() = authorUseCase.listAutor()

    @Put("/{id}")
    fun updateAuthor(
        @Body @Valid authorRequestUpdate: AuthorUpdateResourceRequest,
    ) = authorUseCase.updateAutor(authorRequestUpdate.toAuthorDomain()).toAuthorResourceResponse()

}