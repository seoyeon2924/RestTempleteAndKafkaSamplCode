package skcc.parkingsk.member.bff;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import skcc.parkingsk.member.controller.dto.MemberDto;

/**
 * @author seoyeon on 2021/05/14
 * @project skparking
 */

@Service
@RequiredArgsConstructor
public class BffService {

  private final RestTemplate restTemplate; // 서비스 안에 restTemplate 추가

  //1. BFF의 Service에서 Get 요청
  public void testRestTempleteGet(Long id) {
    MemberDto returnMemberDto = this.restTemplate
        .getForObject(String.format("%s%s%d", "http://localhost:8082", "/testRestTempleteGet/", id),
            MemberDto.class); // localhost:8081(MSA)에서 리턴하는 memberDto를 반환 받을 수 있음

    System.out.println(returnMemberDto.getLoginId());
    System.out.println(returnMemberDto.getName());
  }

  //2. BFF의 Service에서 POST 요청
  public void testRestTempletePost(MemberDto memberDto) {

    memberDto.setName("안서연BFF이름");
    memberDto.setLoginId("안서연BFF로그인아이디");
    MemberDto returnMemberDto = this.restTemplate
        .postForObject(String.format("%s%s", "http://localhost:8082", "/testRestTempletePost"),
            memberDto, MemberDto.class); // localhost:8081(MSA에서 리턴 하는 memberDto를 반환받을 수 있음

    System.out.println(returnMemberDto.getName());
    System.out.println(returnMemberDto.getLoginId());
  }
}
