package skcc.parkingsk.member.service.serviceImpl;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import skcc.parkingsk.member.controller.dto.MemberDto;
import skcc.parkingsk.member.domain.entity.Member;
import skcc.parkingsk.member.repository.MemberRepository;
import skcc.parkingsk.member.service.MemberService;

/**
 * @author seoyeon on 2021/05/11
 * @project skparking
 */

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

  private final MemberRepository memberRepository;
  private final RestTemplate restTemplate;



  @Override
  public void testRestTempleteGet(Long id) {
    MemberDto returnMemberDto = this.restTemplate
        .getForObject(String.format("%s%s%d", "http://localhost:8081", "/testRestTempleteGet/", id),
            MemberDto.class);

    System.out.println(returnMemberDto.getLoginId());
    System.out.println(returnMemberDto.getName());
  }


  @Override
  public void testRestTempletePost(MemberDto memberDto) {
    // 자 나는 BFF야, MSA에게 포스트 매핑을 던져보자


    memberDto.setName("안서연BFF이름");
    memberDto.setLoginId("안서연BFF로그인아이디");
    MemberDto returnMemberDto = this.restTemplate
        .postForObject(String.format("%s%s", "http://localhost:8081", "/testRestTempletePost"),
            memberDto, MemberDto.class);

    System.out.println(returnMemberDto.getName());
    System.out.println(returnMemberDto.getLoginId());

  }
}
