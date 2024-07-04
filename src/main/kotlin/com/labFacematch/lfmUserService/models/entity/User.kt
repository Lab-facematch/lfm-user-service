package com.labFacematch.lfmUserService.models.entity

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import jakarta.persistence.Table

/**
 * Entidade que representa um usuário.
 * @param id ID
 * @param name Nome
 * @param status Status
 * @param riskStatus Status de risco
 * @param score Grau de similaridade entre a foto da face e documento
 * @param urlPhoto URL da foto da face
 * @param document Documento do usuário
 */
@Entity
@Table(name = "`user`")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    val id: Long? = null,

    @Column
    val name: String,

    @Column
    @Enumerated(EnumType.STRING)
    var status: Status,

    @Column
    @Enumerated(EnumType.STRING)
    val riskStatus: RiskStatus,

    @Column
    val score: Double? = null,

    @Column
    val urlPhoto: String? = null,

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "document_id", referencedColumnName = "id")
    val document: Document? = null
) {
    enum class Status {
        ACTIVE, INACTIVE
    }

    enum class RiskStatus {
        WAITING, APPROVED, REFUSED
    }
}
