package member;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MemberServiceTest {

    private final MemberService memberService = new MemberService();

    @Test
    void findById() {
        memberService.findById("test");
    }

    @Test
    void add() {
        Member member = new Member();
        member.setUserId("grepp");
        member.setPassword("1234");
        member.setTel("0102223333");
        member.setEmail("aaa@ppp.jjj");
        memberService.add(member);
    }
  
}