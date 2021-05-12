package skcc.parkingsk.member.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import skcc.parkingsk.member.controller.dto.MemberDto;
import skcc.parkingsk.member.domain.entity.Member;
import skcc.parkingsk.member.service.MemberService;

/**
 * @author seoyeon on 2021/05/11
 * @project skparking
 */

@RestController
@AllArgsConstructor
public class MemberController {

  private final MemberService memberService;
  private final ModelMapper modelMapper;

  //1.로그인
  @PostMapping(value = "/login")
  public MemberDto login(@RequestBody MemberDto memberDto) {
    //memberDto를 Member로 바꾸기
   // Member member = modelMapper.map(memberDto, Member.class);
   // Member resultMember = memberService.login(member);
    return null;
        //modelMapper.map(resultMember, MemberDto.class);
  }
/*
  //2.회원가입
  public MemberDto join(@RequestBody MemberDto memberDto){
    Member member = modelMapper.map(memberDto, Member.class);
    Member joinedMember = memberService.join(member);
    return modelMapper.map(joinedMember,MemberDto.class);
  }
*/

  //3.블랙리스트 목록 조회

  //4.특정회원의 경고횟수 조히인데.. 이건잠시 보류

  //5.경고횟수 초기화

  //6.경고주기

  //7.좋아요 목록 추가

  //8.좋아요 취소

  //9.최근예약 주차장 등록


}
