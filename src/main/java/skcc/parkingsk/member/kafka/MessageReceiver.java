package skcc.parkingsk.member.kafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import skcc.parkingsk.member.controller.dto.MemberDto;
import skcc.parkingsk.member.kafka.message.KafkaDto;

/**
 * @author seoyeon on 2021/05/13
 * @project skparking
 */
@Service
public class MessageReceiver {

  @Value(value = "${spring.kafka.consumer.bootstrap-servers}")
  private String bootstrapServers;

  @Value(value = "${spring.kafka.consumer.topic-name}")
  private String topic;


  @KafkaListener(topics = "${spring.kafka.consumer.topic-name}")
  public void processMessage(KafkaDto kafkaDto) {

    System.out.println("!!!received content = " + kafkaDto);
    System.out.println(kafkaDto.getName());
    System.out.println(kafkaDto.getLoginId());

    /*
     * 이벤트 수신 후 필요한 로직 작성
     * */
  }

}
