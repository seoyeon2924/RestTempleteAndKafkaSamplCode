package skcc.parkingsk.member.service.serviceImpl;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
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

  @Override
  public Member login(Member member) {
/*
    Member findedMember = memberRepository.findByLoginId(member.getLogin().getLoginId());
    if(findedMember.getLogin().getLoginPassword()==member.getLogin().getLoginPassword())
    return findedMember;
    else */
      return null;
  }

  @Override
  public Member join(Member member) {
    Member savedMember = memberRepository.save(member);
    return savedMember;
  }

  @Override
  public List<Member> findAllBlackListMember() {
    return null;
  }

  @Override
  public boolean initPenalty(Member member) {
    return false;
  }

  @Override
  public boolean givePenalty(Member member) {
    return false;
  }
}
