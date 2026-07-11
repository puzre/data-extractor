package org.puzre.infrastructure.http

data class ProfileRequest(
    val key: Int,
    val fullName: String,
    val email: String
)