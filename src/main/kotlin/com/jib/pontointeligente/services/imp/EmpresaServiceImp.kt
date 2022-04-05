package com.jib.pontointeligente.services.imp

import com.jib.pontointeligente.entitymodel.EmpresaEntity
import com.jib.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service
import com.jib.pontointeligente.repository.EmpresaRepository


@Service
class EmpresaServiceimpl(val empressRepository: EmpresaRepository) : EmpresaService {
    override fun buscarPorCnpj(cnpj: String): EmpresaEntity? = empressRepository.findByCnpj(cnpj)

    override fun persistir(empresa: EmpresaEntity): EmpresaEntity = empressRepository.save(empresa)
}

























//import com.jib.pontointeligente.entitymodel.EmpresaEntity
//import com.jib.pontointeligente.services.EmpresaService
//import org.springframework.stereotype.Service
//import com.jib.pontointeligente.repository.EmpresaRepository
//
//@Service // pra ser identicado como serviço
//class EmpresaServiceImp(val empresaRepository : EmpresaRepository) : EmpresaService{
//    override fun buscarPorCnpj(cnpj: String): EmpresaEntity? = empresaRepository
//            .findByCnpj(cnpj)
//
//
//    override fun persistir(empresa: EmpresaEntity): EmpresaEntity = empresaRepository.save(empresa)
//
//    }
