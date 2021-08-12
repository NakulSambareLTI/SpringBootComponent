package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.BusDetails;
import com.example.demo.layer2.BusJourneyDetails;
import com.example.demo.layer4.BusJourneyDetailServiceImpl;

@CrossOrigin(origins = "*")
@RestController // it is a specialized version of @Component - marker to receive web request
@RequestMapping("/busJourneyDetails")
public class BusJourneyDetailsJPAController {
	@Autowired
	BusJourneyDetailServiceImpl busJourneyDetailServiceImpl;
	
public	BusJourneyDetailsJPAController(){
		System.out.println("JourneyDetailsJPAController() .....");
	}


}
