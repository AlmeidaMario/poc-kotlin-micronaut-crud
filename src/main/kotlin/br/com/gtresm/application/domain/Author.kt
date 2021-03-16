package br.com.gtresm.application.domain

data class Author(
    val id: Long? = null,
    val nome: String,
    val email: String,
    val descricao: String
)