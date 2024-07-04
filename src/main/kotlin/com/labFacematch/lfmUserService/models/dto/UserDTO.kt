package com.labFacematch.lfmUserService.models.dto

import com.labFacematch.lfmUserService.models.entity.User

/**
 * DTO com dados de usuário.
 * @param id ID
 * @param name Nome
 * @param status Status
 * @param riskStatus Status de risco
 */
data class UserDTO(
    val id: Long,
    val name: String,
    val status: User.Status,
    val riskStatus: User.RiskStatus
)
