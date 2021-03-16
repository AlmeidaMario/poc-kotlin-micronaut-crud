package br.com.gtresm.adapter.out_.persistence

import br.com.gtresm.adapter.out_.persistence.extension.toAutorDomain
import br.com.gtresm.adapter.out_.persistence.extension.toAutorDomainList
import br.com.gtresm.adapter.out_.persistence.extension.toAutorEntity
import br.com.gtresm.adapter.out_.persistence.repository.AutorRepository
import br.com.gtresm.application.domain.Autor
import br.com.gtresm.application.port.out_.PersistencePort
import io.micronaut.http.HttpResponse
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
            true -> HttpResponse.notFound("Autor Not Found")
            false  -> autorRepository.findByEmail(email).get().toAutorDomain()
        }
    }
}