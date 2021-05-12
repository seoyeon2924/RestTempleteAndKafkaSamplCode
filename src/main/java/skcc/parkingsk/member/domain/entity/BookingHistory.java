package skcc.parkingsk.member.domain.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import skcc.parkingsk.member.domain.enums.BookStatus;

/**
 * @author seoyeon on 2021/05/11
 * @project skparking
 */
@RequiredArgsConstructor
@Entity
@Data
@Table(name="book_history")
public class BookingHistory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "booker_id")
  private Long bookerId;

  @Column(name = "booker_name")
  private String bookerName;

  @Column(name = "booking_parking_lot_id")
  private String bookParkingLotId;

  @Column(name = "booking_parking_lot_name")
  private String bokkingParkingLotName;


  @Column(name = "book_date")
  private Date bookdate;

  @Column(name = "book_car_no")
  private String bookCarNo;

  @Enumerated(EnumType.STRING)
  @Column(name = "book_status")
  private BookStatus bookStatus;

}
