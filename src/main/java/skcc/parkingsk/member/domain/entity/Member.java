package skcc.parkingsk.member.domain.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import skcc.parkingsk.member.domain.enums.MemberStatus;
import skcc.parkingsk.member.domain.enums.RoleType;
import skcc.parkingsk.member.domain.vo.Login;

@Entity
@Table(name="member")
@Data
@RequiredArgsConstructor
//@NoArgsConstructor
public class Member {

	@Id
	@Column(name = "memberId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long memberId;
	
	@Column(name = "company")
	private String company;
	
	@Column(name = "employeeNumber")
	private String employeeNumber;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "login")
	@Embedded
	private Login login;

	@Column(name = "roleType")
	@Enumerated(EnumType.STRING)
	private RoleType roleType;

	@Column(name = "memberStatus")
	@Enumerated(EnumType.STRING)
	private MemberStatus memberStatus;
}
