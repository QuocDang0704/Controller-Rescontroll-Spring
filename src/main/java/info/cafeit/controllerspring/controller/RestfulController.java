package info.cafeit.controllerspring.controller;

import info.cafeit.controllerspring.model.RequestModel;
import info.cafeit.controllerspring.model.ResponseModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulController {

    @GetMapping(value = "/rest-controller1")
    public String index() {
        return "{ \"Status\" : \"OK\"}";
    }

    @GetMapping(value = "/rest-controller2")
    public ResponseEntity<?> responseEntity() {
        return new ResponseEntity<>("{ \"Status\" : \"OK\"}", HttpStatus.OK);
    }

    @GetMapping(value = "/rest-controller3")
    public ResponseEntity<?> responseEntityModel() {
        return new ResponseEntity<>(new ResponseModel("OK"), HttpStatus.OK);
    }


    @GetMapping(value = "/rest-controller4")
    public ResponseModel model() {
        return new ResponseModel("OK");
    }

    @PostMapping(value = "/rest-controller5")
    public HttpEntity<?> httpEntity(HttpEntity<RequestModel> data) {
        return new HttpEntity<>("Hello " + data.getBody().getUsername());
    }

}
