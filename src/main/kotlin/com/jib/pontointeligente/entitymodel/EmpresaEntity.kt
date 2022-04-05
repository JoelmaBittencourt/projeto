package com.jib.pontointeligente.entitymodel

import javax.persistence.*


// por que data class ?
// para acessar os atributos, substitui setter e setter

//@Document do pacote mongodb
@Table(name = "empresa")
@Entity //cria uma tabela
data class EmpresaEntity(
        val razaoSocial: String, //coluna

     //   @Column("")
        val cnpj: String,


        @GeneratedValue(strategy = GenerationType.IDENTITY)//o provedor de persistência a escolha da estratégia mais
        // adequada de acordo com o banco de dados
        @Id val id: Long
//    val id : String? = null pode ou não ser nulo
)

