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
public class RecentParkingLot {
	private Long parkingLotId;
	private String parkingLotName;
	
//	RecentParkingLot(){
//		this.parkingLotId = parkingLotId;
//		this.parkingLotName = parkingLotName;
//	}
	
	@JsonCreator
	public RecentParkingLot(@JsonProperty("parkingLotId") Long parkingLotId,
							@JsonProperty("parkingLotName") String parkingLotName) {
		this.parkingLotId = parkingLotId;
		this.parkingLotName = parkingLotName;
	}
}
