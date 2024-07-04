package com.labFacematch.lfmUserService.models.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
/**
 * Entidade que representa um documento.
 * @param id Identificador do documento.
 * @param url URL do documento.
 * @param ocrData Dados extraídos do documento.
 */
@Entity
class Document(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    val id: Long,

    @Column
    val url: String,

    @Column
    val ocrData: String
)
