//package hello.hellospring.service;
//
//import hello.hellospring.domain.Member;
//import hello.hellospring.repository.MemoryMemberRepository;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MemberServiceTest {
//
//    MemberService memberService;
//    MemoryMemberRepository memberRepository;
//
//    @BeforeEach
//    void setUp() {
//        // 테스트가 서로 영향이 없도록 항상 새로운 객체를 생성해 의존 관계를 맺어준다.
//        memberRepository = new MemoryMemberRepository();
//        memberService = new MemberService(memberRepository);
//    }
//
//    @AfterEach
//    void tearDown() {
//        memberRepository.clearStore();
//    }
//
//    @Test
//    void 회원가입() {
//        // given
//        Member member = new Member();
//        member.setName("hello");
//
//        // when
//        Long saveId = memberService.join(member);
//
//        // then
//        Member findMember = memberService.findOne(saveId).get();
//        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
//    }
//
//    @Test
//    void 중복_회원_예외() {
//        // given
//        Member member1 = new Member();
//        member1.setName("spring");
//
//        Member member2 = new Member();
//        member2.setName("spring");
//
//        // when
//        memberService.join(member1);
//
//        // then
//        IllegalStateException e = assertThrows(IllegalStateException.class,
//                () -> memberService.join(member2));
//
//        // 예외의 메시지도 검증 가능
//        Assertions.assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
//    }
//}