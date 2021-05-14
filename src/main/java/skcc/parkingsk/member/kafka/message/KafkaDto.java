package skcc.parkingsk.member.kafka.message;

import lombok.Data;

/**
 * @author seoyeon on 2021/05/14
 * @project skparking
 */

@Data
public class KafkaDto {

  private String name;

  private String loginId;
}
