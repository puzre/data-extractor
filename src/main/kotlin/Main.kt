package org.puzre

import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking
import org.puzre.infrastructure.http.ProfileRequestMapper
import org.puzre.infrastructure.storage.StorageManager
import org.puzre.port.IDataExtractor

fun main() = runBlocking {
    val dataExtractor: IDataExtractor = StorageManager()
    dataExtractor.extractUsers()
        .map(ProfileRequestMapper::fromUser)
        .collect { println(it) }
}