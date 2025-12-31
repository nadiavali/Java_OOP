package com.nadia.rest.webservices.restful_web_services.Filtering;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

    @GetMapping("/filtering") // daynamic filtering
    public MappingJacksonValue filtering() {
        SomeBean someBean = new SomeBean("value1", "value2", "value3");
        MappingJacksonValue mapping = new MappingJacksonValue(someBean);
        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("SomeBeanFilter", SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field3"));
        mapping.setFilters(filters);
        return mapping;
    }

    @GetMapping("/filtering-list")
    public MappingJacksonValue filteringList() {

        List<SomeBean> ArrayB = Arrays.asList(new SomeBean("value1", "value2", "value3"),
                       new SomeBean("value12", "value22", "value32"));
        MappingJacksonValue mapping = new MappingJacksonValue(ArrayB);
        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("SomeBeanFilter", SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3"));
        mapping.setFilters(filters);
        return mapping;
    }
}