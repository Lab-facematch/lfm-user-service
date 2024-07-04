package com.labFacematch.lfmUserService.services.implementations

import com.labFacematch.lfmUserService.mappers.IUserMapper
import com.labFacematch.lfmUserService.models.dto.UserDTO
import com.labFacematch.lfmUserService.models.entity.User
import com.labFacematch.lfmUserService.models.entity.User.RiskStatus.WAITING
import com.labFacematch.lfmUserService.models.entity.User.Status.ACTIVE
import com.labFacematch.lfmUserService.models.entity.User.Status.INACTIVE
import com.labFacematch.lfmUserService.models.form.UserForm
import com.labFacematch.lfmUserService.repositories.IUserRepository
import com.labFacematch.lfmUserService.services.IUserService
import org.springframework.stereotype.Service

@Service
class UserService(
    private val repository: IUserRepository,
    private val mapper: IUserMapper
) : IUserService {
    override fun create(userForm: UserForm): UserDTO {
        val user = repository.save(
            User(
                name = userForm.name,
                status = ACTIVE,
                riskStatus = WAITING
            )
        )
        return mapper.toDTO(user)
    }

    override fun delete(id: Long) {
        val user = repository.findById(id)
            .orElseThrow { throw NoSuchElementException() }

        user.status = INACTIVE

        repository.save(user)
    }
}
