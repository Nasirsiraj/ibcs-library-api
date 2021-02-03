package titan.io.ibcslibraryapi.controller

import org.jetbrains.annotations.NotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import titan.io.ibcslibraryapi.model.Member
import titan.io.ibcslibraryapi.service.MemberService

@RestController
class MemberController {
    @Autowired
    lateinit var memberService: MemberService

    // get all member
    @GetMapping("/members")
    fun getAllMember(): MutableList<Member>{
        return this.memberService.getAllMember()
    }

    // get member by id
    @GetMapping("/member/{id}")
    fun getMemberById(@PathVariable @NotNull id: Int): Member?{
        return this.memberService.getMemberById(id)
    }
    // post all member
    @PostMapping("/members")
    fun postAllMember(@RequestBody @NotNull members: MutableList<Member>): MutableList<Member>{
        return this.memberService.postAllMember(members)
    }
    // post one member
    @PostMapping("/member")
    fun postOneMember(@RequestBody @NotNull member: Member): Member{
        return this.memberService.postOneMember(member)
    }
    // delete member by id
    @DeleteMapping("/member/{id}")
    fun deleteMemberById(@PathVariable @NotNull id: Int): String{
        return this.memberService.deleteMemberById(id)
    }
    // delete member by obj
    @DeleteMapping("/member")
    fun deleteMemberByObj(@RequestBody @NotNull member: Member): String{
        return this.memberService.deleteMemberByObj(member)
    }
    // update member by obj
    @PutMapping("/member")
    fun updateMemberByObj(@RequestBody @NotNull member: Member): Member?{
        return this.memberService.updateMemberByObj(member)
    }
}