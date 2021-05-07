package skcc.parkingsk.member.domain.vo;

import java.util.Date;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Penalty {
	private Date penaltyDate;
	private String parkingLotName;
	private Long parkingLotId;
	private String penaltyReason;
}
