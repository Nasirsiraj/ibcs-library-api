package titan.io.ibcslibraryapi.model

import javax.persistence.*

@Entity
@Table(name="Book")
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   var id: Int,
   var name: String,
   var subject: String,
   var writer: String,
   var page: Int
) {}
