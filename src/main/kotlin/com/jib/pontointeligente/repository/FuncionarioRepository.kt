package com.jib.pontointeligente.repository


import com.jib.pontointeligente.entitymodel.FuncionarioEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FuncionarioRepository : JpaRepository<FuncionarioEntity, Long> {
    fun findByEmail(email: String) : FuncionarioEntity?  //busca por email que sera usado no controller
//? pra não lançar uma excessao se o retorno for null
    fun findByCpf(cpf : String) : FuncionarioEntity? //busca por cpf que sera usado no controller
}