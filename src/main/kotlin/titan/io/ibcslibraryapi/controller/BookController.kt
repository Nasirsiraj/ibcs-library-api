package titan.io.ibcslibraryapi.controller

import org.jetbrains.annotations.NotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import titan.io.ibcslibraryapi.model.Book
import titan.io.ibcslibraryapi.service.BookService

@RestController
@CrossOrigin(origins = ["*"], allowedHeaders = ["*"])
class BookController {
    @Autowired
    lateinit var bookService: BookService

    // get book by id
    @GetMapping("/book/{id}")
    fun getBookById(@PathVariable @NotNull id: Int): Book?{
        return bookService.getBookById(id)
    }
    @GetMapping("/books")
    fun getAllBooks(): MutableList<Book>{
        return bookService.getAllBooks()
    }
    // post one book
    @PostMapping("/book")
    fun postOneBook(@RequestBody @NotNull book: Book): Book?{
        return bookService.postOneBook(book)
    }
}