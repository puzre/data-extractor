package org.puzre.port

import kotlinx.coroutines.flow.Flow
import org.puzre.domain.User

interface IDataExtractor {
    fun extractUsers(): Flow<User>
}