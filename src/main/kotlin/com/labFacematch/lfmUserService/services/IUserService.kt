package com.labFacematch.lfmUserService.services

import com.labFacematch.lfmUserService.models.dto.UserDTO
import com.labFacematch.lfmUserService.models.form.UserForm

interface IUserService {
    fun create(userForm: UserForm): UserDTO

    fun delete(id: Long)
}
