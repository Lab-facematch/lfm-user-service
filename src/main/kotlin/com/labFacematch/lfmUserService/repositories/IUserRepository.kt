package com.labFacematch.lfmUserService.repositories

import com.labFacematch.lfmUserService.models.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface IUserRepository : CrudRepository<User, Long>
