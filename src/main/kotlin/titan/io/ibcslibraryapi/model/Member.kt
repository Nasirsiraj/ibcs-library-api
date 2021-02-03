package titan.io.ibcslibraryapi.model

import javax.persistence.*

@Entity
@Table(name="member")
class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0
    var name: String = ""
    var nid: Int = 0
    var birthDate: String = ""
    var age: Int = 0
    var email: String = ""
    var password: String = ""
    var address: String = ""
    var book: String ?= ""
    var issueDate: String ?= ""
    var fine: Int ?= 0
}
