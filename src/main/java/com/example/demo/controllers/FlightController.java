package com.example.demo.controllers;

import com.example.demo.dto.FlightDTO;
import com.example.demo.dto.ResponseModel;
import com.example.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Sanyam Goel created on 18/9/18
 */
@RequestMapping(value = "/")
@RestController
public class FlightController extends RestResponseHandler {

    @Autowired
    FlightService flightService;

    @RequestMapping(method = RequestMethod.GET, value = "/flights", produces = "application/json")
    public ResponseEntity<ResponseModel<List<FlightDTO>>> getAllFlights() {
        List<FlightDTO> flights = flightService.getAllFlights();
        return super.responseStandardizer(flights);
    }

}
