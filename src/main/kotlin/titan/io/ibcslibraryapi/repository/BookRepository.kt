package titan.io.ibcslibraryapi.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import titan.io.ibcslibraryapi.model.Book

@Repository
interface BookRepository: JpaRepository<Book, Int>{
}