package com.example.demo.service;

import com.example.demo.domains.Flight;
import com.example.demo.dto.FlightDTO;
import com.example.demo.exceptions.FlightSearchResourceNotFoundException;
import com.example.demo.repository.FlightRepository;
import com.example.demo.utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sanyam Goel created on 18/9/18
 */
@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public List<FlightDTO> getAllFlights() {
        List<Flight> flightList = flightRepository.getList(Flight.class);
        List<FlightDTO> flightDTOList = Utility.convertModelList(flightList, FlightDTO.class);

        if(flightDTOList == null || flightDTOList.isEmpty()) {
            throw new FlightSearchResourceNotFoundException("Flight List not found");
        }

        return flightDTOList;
    }

}
