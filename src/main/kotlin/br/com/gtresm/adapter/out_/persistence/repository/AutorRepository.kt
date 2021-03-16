package br.com.gtresm.adapter.out_.persistence.repository

import br.com.gtresm.adapter.out_.persistence.entity.AutorEntity
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface AutorRepository : JpaRepository<AutorEntity, Long>{

    fun findByEmail(email: String): Optional<AutorEntity>
}