package com.labFacematch.lfmUserService.mappers

import com.labFacematch.lfmUserService.models.dto.UserDTO
import com.labFacematch.lfmUserService.models.entity.User
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface IUserMapper {
    fun toDTO(source: User): UserDTO
}
