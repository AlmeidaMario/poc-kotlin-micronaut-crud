package br.com.gtresm.application.service

import br.com.gtresm.application.domain.Author
import br.com.gtresm.application.port.`in`.AuthorUseCase
import br.com.gtresm.application.port.out_.PersistencePort
import javax.inject.Singleton

@Singleton
class AuthorService(
    private val persistencePort: PersistencePort
): AuthorUseCase{

    override fun createAutor(author: Author): Author =
        persistencePort.createAutor(author)

    override fun getAutorByEmail(email: String): Any =
        persistencePort.getAutorByEmail(email)

    override fun listAutor(): List<Author> =
        persistencePort.listAutor()

    override fun updateAutor(author: Author): Author =
        persistencePort.updateAutor(author)
}