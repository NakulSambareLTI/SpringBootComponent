package com.example.demo.layer3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.BusJourneyDetails;
import com.example.demo.layer2.BusSeatDetailsNotFoundException;
import com.example.demo.layer2.BusSeatesDetails;
@Repository
public class BusSeatesDetailsRepositoryImpl extends BaseRepository implements BusSeatDetailsRepository{
          public BusSeatesDetailsRepositoryImpl()
          {
        	  System.out.println("BusSeatesDetailsRepositoryImpl()......");
          }

        @Transactional
		public List<BusSeatesDetails> selectAllBusSeatesDetails() {
			// TODO Auto-generated method stub
        	EntityManager entityManager = getEntityManager();

    		Query query = entityManager.createQuery(" from BusSeatesDetails");
    		List<BusSeatesDetails> busSeatesDetailsList = query.getResultList();
    		System.out.println("BusSeatesDetails length "+busSeatesDetailsList.size());
    		
    		return busSeatesDetailsList;		
    		}

        @Transactional
		public List<BusSeatesDetails> selectBusSeatesDetailsByReservationId(String ReservationID)
				throws BusSeatDetailsNotFoundException {
			// TODO Auto-generated method stub
        	EntityManager entityManager = getEntityManager();
    		Query query = entityManager.createQuery("select b from BusSeatesDetails b where b.reservation_id = :vreservation_id");
    		query.setParameter("vreservation_id",ReservationID);
    		List<BusSeatesDetails> busSeatesDetailsbyReservationId= query.getResultList();
    		return busSeatesDetailsbyReservationId;		
    		}

        @Transactional
		public List<BusSeatesDetails> selectBusSeatesDetailsBySeatNo(String SeatNo)
				throws BusSeatDetailsNotFoundException {
			// TODO Auto-generated method stub
        	EntityManager entityManager = getEntityManager();
    		Query query = entityManager.createQuery("select b from BusSeatesDetails b where b.seat_no = :vseat_no");
    		query.setParameter("vseat_no",SeatNo);
    		List<BusSeatesDetails> busSeatesDetailsbySeatNo= query.getResultList();
    		return busSeatesDetailsbySeatNo;	
		}

        @Transactional
		public List<BusSeatesDetails> selectBusSeatesDetailsByJourneyID(int journeyID)
				throws BusSeatDetailsNotFoundException {
			// TODO Auto-generated method stub
        	EntityManager entityManager = getEntityManager();
    		Query query = entityManager.createQuery("select b from BusSeatesDetails b where b.journey_id = :vjourney_id");
    		query.setParameter("vjourney_id",journeyID);
    		List<BusSeatesDetails> busSeatesDetailsbyjourneyID= query.getResultList();
    		return busSeatesDetailsbyjourneyID;
		}
}
