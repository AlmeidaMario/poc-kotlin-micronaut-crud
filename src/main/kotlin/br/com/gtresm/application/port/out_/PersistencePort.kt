package br.com.gtresm.application.port.out_

import br.com.gtresm.application.domain.Autor

interface PersistencePort {
    fun createAutor(autor: Autor): Autor
    fun getAutorByEmail(email: String): Any
}