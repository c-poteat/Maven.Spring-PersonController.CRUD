package io.zipcoder.crudapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController// Annotation
@RequestMapping(value = "/person-controller")
public class PersonController {

    @RequestMapping(value = "/create/{id}", method = RequestMethod.POST)   // C
    public ResponseEntity<Person> createPerson(@RequestBody Person p) {
        return new ResponseEntity<>(service.createPerson(p), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/read/{id}", method = RequestMethod.GET)    // R
    public ResponseEntity<Person> getPerson(@PathVariable Long id) {
        return new ResponseEntity<>(service.getPerson(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/read/{id}", method = RequestMethod.GET)    // R
    public ResponseEntity<Person> getPersonList(@PathVariable Long id) {
        return new ResponseEntity<>(service.getPersonList(id), HttpStatus.OK);
    }
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)   // U
    public ResponseEntity<Person> updatePerson(@PathVariable Long id) {
        return new ResponseEntity<>(service.updatePerson(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)  // D
    public ResponseEntity<Boolean> deletePerson(@PathVariable Long id) {  // Delete
        return new ResponseEntity<>(service.deletePerson(id), HttpStatus.OK);
    }
}
/*

    Create a PersonController class with Person createPerson(Person p), Person getPerson(int id),
        List<Person> getPersonList(), Person updatePerson(Person p), and void DeletePerson(int id) methods, and let
        it track a list of Person objects.