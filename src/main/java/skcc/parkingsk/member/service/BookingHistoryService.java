package skcc.parkingsk.member.service;

import skcc.parkingsk.member.domain.entity.BookingHistory;
import skcc.parkingsk.member.domain.entity.Member;

/**
 * @author seoyeon on 2021/05/11
 * @project skparking
 */

public interface BookingHistoryService {

  BookingHistory findBookingHistoryById(Member member);

}
