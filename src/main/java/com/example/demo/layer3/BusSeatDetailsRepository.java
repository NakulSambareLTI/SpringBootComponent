package com.example.demo.layer3;

import java.util.List;

import com.example.demo.layer2.BusJourneyDetails;
import com.example.demo.layer2.BusSeatDetailsNotFoundException;
import com.example.demo.layer2.BusSeatesDetails;

public interface BusSeatDetailsRepository {
	List<BusSeatesDetails> selectAllBusSeatesDetails();
	List<BusSeatesDetails> selectBusSeatesDetailsByReservationId(String ReservationID)throws BusSeatDetailsNotFoundException;
	List<BusSeatesDetails> selectBusSeatesDetailsBySeatNo(String SeatNo)throws BusSeatDetailsNotFoundException;
	List<BusSeatesDetails> selectBusSeatesDetailsByJourneyID(int journeyID)throws BusSeatDetailsNotFoundException;
	
	
}
