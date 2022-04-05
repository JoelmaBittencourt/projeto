package com.jib.pontointeligente.services.imp


//import com.jib.pontointeligente.entitymodel.LancamentoEntity
//
//import com.jib.pontointeligente.services.LancamentoService
//
//import org.springframework.stereotype.Service
//
//import com.jib.pontointeligente.repository.LancamentoRepository
//import org.springframework.data.domain.Page
//import org.springframework.data.domain.PageRequest
//
//
//        @Service
//        class LancamentoServiceImpl(val lancamentoRepository: LancamentoRepository) : LancamentoService {
//                override fun buscarPorFuncionarioId(funcionarioId: String, pageRequest: PageRequest): Page<LancamentoEntity> =
//                        lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest)
//
//                override fun buscarPorId(id: Long): LancamentoEntity? =
//                        lancamentoRepository.getById(id)
//
//                override fun persistir(lancamentoEntity: LancamentoEntity): LancamentoEntity =
//                        lancamentoRepository.save(lancamentoEntity)
//
//                override fun remover(id: Long) = lancamentoRepository.delete(id)
//        }
//
