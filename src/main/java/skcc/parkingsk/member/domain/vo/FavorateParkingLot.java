package skcc.parkingsk.member.domain.vo;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class FavorateParkingLot {
	private Long parkingLotId;
	private String parkingLotName;
}
