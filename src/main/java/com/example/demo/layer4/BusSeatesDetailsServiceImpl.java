package com.example.demo.layer4;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.BusSeatDetailsNotFoundException;
import com.example.demo.layer2.BusSeatesDetails;
import com.example.demo.layer3.BusSeatesDetailsRepositoryImpl;

@Service
public class BusSeatesDetailsServiceImpl implements BusSeatesDetailsService{
	@Autowired
	BusSeatesDetailsRepositoryImpl busSeatesDetailsRepositoryImpl ;


	public List<BusSeatesDetails> selectAllBusSeatesDetailsService() {
		// TODO Auto-generated method stub
		return busSeatesDetailsRepositoryImpl.selectAllBusSeatesDetails();
	}

	@Override
	public List<BusSeatesDetails> selectBusSeatesDetailsByReservationIdService(String ReservationID)
			throws BusSeatDetailsNotFoundException {
		// TODO Auto-generated method stub
		return busSeatesDetailsRepositoryImpl.selectBusSeatesDetailsByReservationId(ReservationID);
	}

	@Override
	public List<BusSeatesDetails> selectBusSeatesDetailsBySeatNoService(String SeatNo)
			throws BusSeatDetailsNotFoundException {
		// TODO Auto-generated method stub
		return busSeatesDetailsRepositoryImpl.selectBusSeatesDetailsBySeatNo(SeatNo);
	}

	@Override
	public List<BusSeatesDetails> selectBusSeatesDetailsByJourneyIDService(int journeyID)
			throws BusSeatDetailsNotFoundException {
		// TODO Auto-generated method stub
		return busSeatesDetailsRepositoryImpl.selectBusSeatesDetailsByJourneyID(journeyID);
	}

}
