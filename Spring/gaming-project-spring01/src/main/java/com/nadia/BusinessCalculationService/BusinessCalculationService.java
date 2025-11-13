package com.nadia.BusinessCalculationService;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Componen
@Service
public class BusinessCalculationService {
    private DataService dataService;

    public BusinessCalculationService(@Qualifier("mySQLDataService")DataService dataService) {
        super();
        this.dataService = dataService;
    }
    public int findMaximum() {
       return Arrays.stream(dataService.retrieveData())
               .max()
               .orElse(0);
    }
}
