package skcc.parkingsk.member.domain.vo;

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
public class FavorateParkingLot {
	private Long parkingLotId;
	private String parkingLotName;
	
	
	@JsonCreator
	public FavorateParkingLot(@JsonProperty("parkingLotId") Long parkingLotId,
							@JsonProperty("parkingLotName") String parkingLotName) {
		this.parkingLotId = parkingLotId;
		this.parkingLotName = parkingLotName;
	}
}
