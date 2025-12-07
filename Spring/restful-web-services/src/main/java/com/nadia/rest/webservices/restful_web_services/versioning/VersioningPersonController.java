package com.nadia.rest.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
    @GetMapping("v1/person")
    public PersonV1 getPersonV1() {
        return new PersonV1("Bob Charlie"); }

    @GetMapping("v2/person")
    public PersonV2 getPersonV2() {
        return new PersonV2(new Name("Bob", "Charlie"));}

    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getPersonV1RequestParam() {
        return new PersonV1("Bob Charlie"); }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getPersonV2RequestParam() {
        return new PersonV2(new Name("Bob", "Charlie"));}
}