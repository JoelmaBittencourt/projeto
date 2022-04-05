package com.jib.pontointeligente.repository

import com.jib.pontointeligente.entitymodel.EmpresaEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmpresaRepository : JpaRepository<EmpresaEntity, Long> { //jpa vai fazer a conexão
    fun findByCnpj(cnpj: String): EmpresaEntity? // fazer busca por cnpj , cnpj do tipo string e retorna empresa

}