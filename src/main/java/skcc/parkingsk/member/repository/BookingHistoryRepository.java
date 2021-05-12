package skcc.parkingsk.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import skcc.parkingsk.member.domain.entity.BookingHistory;

/**
 * @author seoyeon on 2021/05/11
 * @project skparking
 */

public interface BookingHistoryRepository extends JpaRepository<BookingHistory,Long> {

}
