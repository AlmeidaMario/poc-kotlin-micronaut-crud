package br.com.gtresm.application.port.out_

import br.com.gtresm.application.domain.Author

interface PersistencePort {
    fun createAutor(author: Author): Author
    fun getAutorByEmail(email: String): Any
    fun listAutor(): List<Author>
    fun updateAutor(author: Author): Author
}