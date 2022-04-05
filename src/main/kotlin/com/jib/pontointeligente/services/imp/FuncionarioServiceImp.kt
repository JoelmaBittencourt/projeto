package com.jib.pontointeligente.services.imp

import com.jib.pontointeligente.entitymodel.FuncionarioEntity
import com.jib.pontointeligente.services.FuncionarioService
import org.springframework.stereotype.Service
import com.jib.pontointeligente.repository.FuncionarioRepository


// estendendo a classe service tem que trazer as funcoes
@Service
class FuncionarioServiceimpl(val funcionarioRepository: FuncionarioRepository) : FuncionarioService {

    override fun persistir(funcionarioEntity: FuncionarioEntity): FuncionarioEntity  =
            funcionarioRepository.save(funcionarioEntity)



    override fun buscarPorCpf(cpf: String): FuncionarioEntity? = funcionarioRepository.findByCpf(cpf)



    override fun buscarPorEmail(email: String): FuncionarioEntity? = funcionarioRepository.findByEmail(email)


    override fun buscarPorId(id:    Long): FuncionarioEntity? = funcionarioRepository.getById(id)
    //override fun buscarPorId(id: String): FuncionarioEntity? = funcionarioRepository.findByCpf(id)
//override fun buscarPorId(id: String): FuncionarioEntity? = funcionarioRepository.getById(id)
    }
