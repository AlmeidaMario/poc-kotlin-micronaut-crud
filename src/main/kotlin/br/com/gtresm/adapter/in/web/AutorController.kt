package br.com.gtresm.adapter.`in`.web

import br.com.gtresm.adapter.`in`.web.extensions.toAutorDomain
import br.com.gtresm.adapter.`in`.web.extensions.toNovoAutorResourceRequest
import br.com.gtresm.adapter.`in`.web.resources.AutorResourceRequest
import br.com.gtresm.application.port.`in`.AutorUseCase
import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import javax.transaction.Transactional
import javax.validation.Valid

@Validated
@Controller("/autores")
class AutorController(
    val autorUseCase: AutorUseCase
) {

    @Post("/")
    fun create(
        @Body @Valid request: AutorResourceRequest
    ) = autorUseCase.createAutor(request.toAutorDomain()).toNovoAutorResourceRequest()

    @Get
    @Transactional
    fun getAutor(
        @QueryValue(defaultValue = "") email: String
    ) = autorUseCase.getAutorByEmail(email)

    @Get("/all")
    @Transactional
    fun listAutor() = autorUseCase.listAutor()

    @Put("/{id}")
    fun atualiza(
        @Body @Valid authorRequest: AutorResourceRequest,
    ) = autorUseCase.updateAutor(authorRequest.toAutorDomain()).toNovoAutorResourceRequest()

}