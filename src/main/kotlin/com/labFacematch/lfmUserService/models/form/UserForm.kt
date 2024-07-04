package com.labFacematch.lfmUserService.models.form

import jakarta.validation.constraints.NotBlank

/**
 * Formulário para cadastrar dados do usuário.
 * @param name = Nome do usuário
 */
data class UserForm(
    @field:NotBlank
    val name: String
)
