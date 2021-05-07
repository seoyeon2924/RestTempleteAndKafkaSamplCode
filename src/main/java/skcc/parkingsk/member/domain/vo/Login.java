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
public class Login {
	private String loginId;
	private String loginPassword;
	private Date lastLoginDate;
}
