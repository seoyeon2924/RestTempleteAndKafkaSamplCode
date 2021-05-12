package skcc.parkingsk.member.service.serviceImpl;

import org.springframework.stereotype.Service;
import skcc.parkingsk.member.domain.entity.BookingHistory;
import skcc.parkingsk.member.domain.entity.Member;
import skcc.parkingsk.member.service.BookingHistoryService;

/**
 * @author seoyeon on 2021/05/11
 * @project skparking
 */

@Service
public class BookingHistoryServiceImpl implements BookingHistoryService {


  @Override
  public BookingHistory findBookingHistoryById(Member member) {
    return null;
  }
}
