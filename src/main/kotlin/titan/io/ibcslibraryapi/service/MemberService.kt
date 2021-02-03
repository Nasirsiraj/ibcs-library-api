package titan.io.ibcslibraryapi.service

import org.jetbrains.annotations.NotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import titan.io.ibcslibraryapi.model.Member
import titan.io.ibcslibraryapi.repository.MemberRepository

@Service
class MemberService {
    @Autowired
    lateinit var memberRepository: MemberRepository

    // get all member
    fun getAllMember(): MutableList<Member>{
        return this.memberRepository.findAll()
    }
    // get member by id
    fun getMemberById(@NotNull  id: Int): Member{
        return this.memberRepository.findById(id).orElse(null)
    }
    // post all member
    fun postAllMember(@NotNull members: MutableList<Member>): MutableList<Member>{
        return this.memberRepository.saveAll(members)
    }
    // post one member
    fun postOneMember(@NotNull member: Member): Member{
        return this.memberRepository.save(member)
    }
    // delete member by id
    fun deleteMemberById(@NotNull id: Int): String{
        var member_: Member ?= this.memberRepository.findById(id).orElse(null)
        return if(member_ == null){
            "member not found, id: ${id}"
        }else{
            this.memberRepository.deleteById(id)
            "member deleted, id: ${id}"
        }
    }
    // delete member by obj
    fun deleteMemberByObj(@NotNull member: Member): String{
        val member_: Member ?= this.memberRepository.findById(member.id).orElse(null)
        return if(member_ == null){
            "member not found, id: ${member.id}"
        }else{
            this.memberRepository.deleteById(member.id)
            "member deleted, id: ${member.id}"
        }
    }
    // update member by obj
    fun updateMemberByObj(@NotNull member: Member): Member?{
        val member_: Member = this.memberRepository.findById(member.id).orElse(null)

        return if(member_ == null){
            null
        }else{
            member_.name = member.name
            member_.nid = member.nid
            member_.birthDate = member.birthDate
            member_.age = member.age
            member_.email = member.email
            member_.password = member.password
            member_.address = member.address
            member_.book = member.book
            member_.issueDate = member.issueDate
            member_.fine = member.fine

            this.memberRepository.save(member_)
        }
    }
}