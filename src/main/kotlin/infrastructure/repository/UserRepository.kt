package org.puzre.infrastructure.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.puzre.domain.User
import org.puzre.port.IDataExtractor
import java.lang.Thread.sleep

class UserRepository : IDataExtractor {
    override fun extractUsers(): Flow<User> {
        println("extracting users from repository...")
        sleep(5000)
        val testUser = User(1231, "Jorge", "Conor", "email@email.com")
        return flow { emit(testUser) }
    }
}