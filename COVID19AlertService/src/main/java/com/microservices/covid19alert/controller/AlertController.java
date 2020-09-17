package com.microservices.covid19alert.controller;

import com.microservices.covid19alert.dto.SummaryData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.covid19alert.dto.AlertStatus;
import com.microservices.covid19alert.service.AlertService;

import java.util.List;

@RestController
@RequestMapping("/")
public class AlertController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment env;

    @Autowired
    private AlertService alertService;

    @RequestMapping("/{state}")
    public AlertStatus getAlertAboutState(@PathVariable String state){
        return alertService.getAlertAboutState(state);
    }
    @RequestMapping("/summary")
    public SummaryData getOverAllSummary(){
        return alertService.getOverAllSummary();
    }

    //test request
    @RequestMapping("/homeAlert")
    public String homeAlert() {
        return "This is the admin area of COVID-19 ALERT service running at port: " + env.getProperty("local.server.port");
    }

}
