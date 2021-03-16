package br.com.gtresm.application.port.`in`

import br.com.gtresm.application.domain.Author

interface AutorUseCase{

    fun createAutor(author: Author): Author
    fun getAutorByEmail(email:String): Any
    fun listAutor(): List<Author>
    fun updateAutor(author: Author): Author
}