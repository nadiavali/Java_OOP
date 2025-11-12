package com.nadia.BusinessCalculationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService {
    public int[] retrieveData() {
        return new int[] {10, 20, 30};
    }
}
