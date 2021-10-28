package hello.hellospring;

import hello.hellospring.member.Grade;
import hello.hellospring.member.Member;
import hello.hellospring.member.MemberService;
import hello.hellospring.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {

//        MemberService memberService = new MemberServiceImpl();

        MemberService appConfig = new AppConfig().provideMemberService();

        Member member = new Member(1L, "memberA", Grade.VIP);

        appConfig.join(member);

        Member findMember = appConfig.findMember(member.getId());

        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
