package br.com.gtresm.adapter.out_.persistence

import br.com.gtresm.adapter.out_.persistence.extension.toAutorDomain
import br.com.gtresm.adapter.out_.persistence.extension.toAutorDomainList
import br.com.gtresm.adapter.out_.persistence.extension.toAutorEntity
import br.com.gtresm.adapter.out_.persistence.repository.AutorRepository
import br.com.gtresm.application.domain.Autor
import br.com.gtresm.application.exception.NotFoundException
import br.com.gtresm.application.port.out_.PersistencePort
import io.micronaut.http.HttpResponse
import net.bytebuddy.implementation.bytecode.Throw
import javax.inject.Singleton

@Singleton
class PersistenceAdapter(
    private val autorRepository: AutorRepository
) : PersistencePort{

    override fun createAutor(autor: Autor): Autor =
        autorRepository.save(autor.toAutorEntity()).toAutorDomain()

    override fun getAutorByEmail(email: String): Any {
        if (email.isEmpty()){
            return autorRepository.findAll().toAutorDomainList()
        }
        return when(autorRepository.findByEmail(email).isEmpty){
            true -> throw NotFoundException("Autor Not Found")
            false  -> autorRepository.findByEmail(email).get().toAutorDomain()
        }
    }

    override fun updateAutor(id: Long, autor: Autor): Autor {
        val autorToUpdate = autorRepository.findById(id)
        if(autorToUpdate.isEmpty){
        }

        return autor
    }
}