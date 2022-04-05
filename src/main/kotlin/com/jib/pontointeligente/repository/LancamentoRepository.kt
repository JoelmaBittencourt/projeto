package com.jib.pontointeligente.repository

//
//import com.jib.pontointeligente.entitymodel.LancamentoEntity
//import org.springframework.data.domain.Page
//import org.springframework.data.domain.Pageable
//import org.springframework.data.jpa.repository.JpaRepository
//import org.springframework.stereotype.Repository
//
//
//@Repository
//interface LancamentoRepository : JpaRepository<LancamentoEntity, Long> {
//
//    //fun findByFuncionarioId(funcionarioId: String, pageable: Pageable): Page<lancamento>
//    fun <lancamento : Any?> findByFuncionarioId(funcionarioId: String, pageable: Pageable): Page<lancamento>
//
//     fun delete(id: Long)
//
//
//}