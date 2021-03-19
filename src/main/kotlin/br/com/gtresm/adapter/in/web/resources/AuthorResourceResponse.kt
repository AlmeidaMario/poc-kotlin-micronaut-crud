package br.com.gtresm.adapter.`in`.web.resources

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Introspected
data class AuthorResourceResponse(
    val id: Long?,
    val nome: String,
    val email: String,
    val descricao: String
)