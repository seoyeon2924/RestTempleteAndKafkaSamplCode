package skcc.parkingsk.member.domain.vo;

import java.util.Date;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Penalty {
	private Date penaltyDate;
	private String parkingLotName;
	private Long parkingLotId;
	private String penaltyReason;
	
	@JsonCreator
	public Penalty(@JsonProperty("penaltyDate") Date penaltyDate,
							@JsonProperty("parkingLotName") String parkingLotName,
							@JsonProperty("parkingLotId") Long parkingLotId,
							@JsonProperty("penaltyReason") String penaltyReason) {
		this.parkingLotId = parkingLotId;
		this.parkingLotName = parkingLotName;
	}
	
}
