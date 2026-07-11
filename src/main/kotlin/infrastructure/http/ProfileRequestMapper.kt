package org.puzre.infrastructure.http

import org.puzre.domain.User

class ProfileRequestMapper {
    companion object {
        fun fromUser(user: User) = ProfileRequest(
            user.id,
            "${user.name} ${user.surnames}",
            user.email
        )
    }
}