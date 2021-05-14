package skcc.parkingsk.member.controller;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import skcc.parkingsk.member.controller.dto.MemberDto;
import skcc.parkingsk.member.kafka.MessageSender;
import skcc.parkingsk.member.kafka.message.KafkaDto;
import skcc.parkingsk.member.service.MemberService;

/**
 * @author seoyeon on 2021/05/11
 * @project skparking
 */

@RestController
@RequiredArgsConstructor
public class MemberController {

  private final MemberService memberService;
  private final ModelMapper modelMapper;

  @Autowired
  MessageSender producer;

  //1. 카프카 발행 테스트 카프카테스트
  @GetMapping(value = "/kafkaTest")
  public void kafkatest() {
    KafkaDto kafkaDto = new KafkaDto();
    kafkaDto.setName("안서연");
    /*
    * 비동기로 전달할 데이터 셋팅
    * */
    producer.send(kafkaDto); // 이벤트 발행
  }

  //2. Get RestTemplete
  @GetMapping(value = "/testRestTempleteGet/{id}")
  public void testRestTempleteGet(@PathVariable Long id) {

    memberService.testRestTempleteGet(id);
  }

  //3. Post RestTemplete
  @PostMapping(value = "/testRestTempletePost")
  public MemberDto testRestTempletePost(@RequestBody MemberDto memberDto) {

    memberService.testRestTempletePost(memberDto);
    return null;
  }



}
