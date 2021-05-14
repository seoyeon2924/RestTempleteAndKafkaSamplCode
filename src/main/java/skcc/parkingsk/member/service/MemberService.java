package skcc.parkingsk.member.service;

import skcc.parkingsk.member.controller.dto.MemberDto;

/**
 * @author seoyeon on 2021/05/11
 * @project skparking
 */


public interface MemberService {


  void testRestTempleteGet(Long id);

  void testRestTempletePost(MemberDto memberDto);
}
