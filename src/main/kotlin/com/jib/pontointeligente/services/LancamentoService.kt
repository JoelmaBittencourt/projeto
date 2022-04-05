package com.jib.pontointeligente.services
//
//import com.jib.pontointeligente.entitymodel.LancamentoEntity
//import org.springframework.data.domain.Page
//import org.springframework.data.domain.PageRequest
//
//interface LancamentoService {
//
//    //nao precisa do ? automaticamente restorna uma lista vazia
//    fun buscarPorFuncionarioId(funcionarioId : String, pageRequest : PageRequest) : Page<LancamentoEntity>
//
//    fun buscarPorId(id : Long) : LancamentoEntity?
//
//    fun persistir(lancamentoEntity: LancamentoEntity) : LancamentoEntity
//    //se nao colocar nada automaticamente nao tem retorno
//    fun remover(id : Long)
//
//}