package br.com.gtresm.application.port.`in`

import br.com.gtresm.application.domain.Autor

interface AutorUseCase{

    fun createAutor(autor: Autor): Autor
    fun getAutorByEmail(email:String): Any
    fun updateAutor(id: Long, autor: Autor): Autor
}