package br.com.gtresm.adapter.out_.persistence

import br.com.gtresm.adapter.out_.persistence.extension.*
import br.com.gtresm.adapter.out_.persistence.repository.AutorRepository
import br.com.gtresm.application.domain.Author
import br.com.gtresm.application.exception.NotFoundException
import br.com.gtresm.application.port.out_.PersistencePort
import javax.inject.Singleton

@Singleton
class PersistenceAdapter(
    private val autorRepository: AutorRepository
) : PersistencePort{

    override fun createAutor(author: Author): Author =
        autorRepository.save(author.toAuthorEntity()).toAuthorDomain()

    override fun getAutorByEmail(email: String): Author {
        return when(autorRepository.findByEmail(email).isEmpty){
            true -> throw NotFoundException("Autor Not Found")
            false  -> autorRepository.findByEmail(email).get().toAuthorDomain()
        }
    }

    override fun listAutor(): List<Author> =
        autorRepository.findAll().toAuthorDomainList()

    override fun updateAutor(author: Author): Author {
//        val possibleAuthor = author.id?.let {
//            autorRepository.findById(it)
//        }
//        possibleAuthor?.get()
        return author
    }
}