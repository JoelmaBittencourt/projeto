package com.jib.pontointeligente.entitymodel

import com.jib.pontointeligente.enums.TipoEnum
import java.util.*
import javax.persistence.*

@Table(name = "lancamento")
@Entity //cria uma tabela
data class LancamentoEntity(

        val data: Date,
        val tipo: TipoEnum,
        val funcionarioId: String,
        val descricao: String? = "", //opcional
        val localizacao: String? = "", //opcional


        @GeneratedValue(strategy = GenerationType.IDENTITY)//os valores a serem atribuídos ao identificador
        // único serão gerados pela coluna de auto incremento do banco de dados. Assim, um valor para o
        // identificador é gerado para cada registro inserido no banco.
        @Id val id: Long
)