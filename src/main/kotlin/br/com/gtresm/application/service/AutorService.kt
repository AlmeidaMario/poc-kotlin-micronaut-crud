package br.com.gtresm.application.service

import br.com.gtresm.application.domain.Autor
import br.com.gtresm.application.port.`in`.AutorUseCase
import br.com.gtresm.application.port.out.PersistencePort
import javax.inject.Singleton

@Singleton
class AutorService(
    private val persistencePort: PersistencePort
): AutorUseCase{

    override fun createAutor(autor: Autor): Autor =
        persistencePort.createAutor(autor)

    override fun getAutorByEmail(email: String): Any =
        persistencePort.getAutorByEmail(email)
}