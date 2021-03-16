package br.com.gtresm.adapter.out_.persistence.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
data class AutorEntity(
    val nome: String = "",
    val email: String = "",
    val descricao: String = ""
){

    @Id
    @GeneratedValue
    var id: Long? = null

    var criadoEm: LocalDateTime? = LocalDateTime.now()
}