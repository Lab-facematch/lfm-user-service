package com.labFacematch.lfmUserService.controllers

import com.labFacematch.lfmUserService.models.dto.UserDTO
import com.labFacematch.lfmUserService.models.form.UserForm
import com.labFacematch.lfmUserService.services.IUserService
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI

@RestController
@RequestMapping("/users")
class UserController(
    private val service: IUserService
) {
    @PostMapping
    fun create(
        @RequestBody @Valid
        userForm: UserForm
    ): ResponseEntity<UserDTO> {
        val user = service.create(userForm)
        return ResponseEntity.created(URI.create(user.id.toString())).body(user)
    }

    fun findAll(): Any {
        throw UnsupportedOperationException()
    }

    fun findById(): Any {
        throw UnsupportedOperationException()
    }

    fun savePhoto(): Any {
        throw UnsupportedOperationException()
    }

    fun saveDocument(): Any {
        throw UnsupportedOperationException()
    }

    @DeleteMapping("/{id}")
    fun delete(
        @PathVariable id: Long
    ): ResponseEntity<Any> {
        service.delete(id)
        return ResponseEntity.noContent().build()
    }
}
