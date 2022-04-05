package com.jib.pontointeligente.services

import com.jib.pontointeligente.entitymodel.EmpresaEntity

interface EmpresaService {

    fun buscarPorCnpj(cnpj : String) : EmpresaEntity?
    //pode retornar nulo caso o cnpj nao exista
    fun persistir(empresa : EmpresaEntity) : EmpresaEntity
    //não precisa do ? por que ja existe a empresa
}