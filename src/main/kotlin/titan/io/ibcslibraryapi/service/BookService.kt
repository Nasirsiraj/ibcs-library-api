package titan.io.ibcslibraryapi.service

import org.jetbrains.annotations.NotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import titan.io.ibcslibraryapi.model.Book
import titan.io.ibcslibraryapi.repository.BookRepository

@Service
class BookService {
    @Autowired
    lateinit var bookRepository: BookRepository

    // get book by id
    fun getBookById(@NotNull id: Int): Book?{
        return bookRepository.findById(id).orElse(null)
    }
    // get all books
    fun getAllBooks(): MutableList<Book>{
        return bookRepository.findAll()
    }
    // post one book
    fun postOneBook(@NotNull book: Book): Book?{
        return bookRepository.save(book)
    }
}