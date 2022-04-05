package com.jib.pontointeligente.services

import com.jib.pontointeligente.entitymodel.FuncionarioEntity

interface FuncionarioService {

    fun persistir(funcionarioEntity: FuncionarioEntity) : FuncionarioEntity

    fun buscarPorCpf(cpf : String) : FuncionarioEntity?

    fun buscarPorEmail(email : String) : FuncionarioEntity?

    fun buscarPorId(id : Long) : FuncionarioEntity?
}