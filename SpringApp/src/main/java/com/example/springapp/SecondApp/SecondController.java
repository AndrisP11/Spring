package com.example.springapp.SecondApp;

import com.example.springapp.SecondApp.domain.SecondPerson;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class SecondController {

    private SecondService service;

    public SecondController(SecondService service) {
        this.service = service;
    }

    @GetMapping("/getTime")
    public String getTime() {
        return service.getTime();
    }

    @PostMapping("/saveText")
    public void saveText(@RequestBody String newText) {
        if (newText == null) {
            throw new RuntimeException("Can't be null!");
        } else {
            service.saveText(newText);
        }
    }

    @GetMapping("/getSavedTexts")
    public String getText() {
        return service.getText();
    }

    @PostMapping("/savePerson")
    public void savePerson(@RequestBody SecondPerson person) {
        if (person.getFirstName().equals("") || person.getLastName().equals("")) {
            throw new RuntimeException("Can't be null!");
        } else {
            service.savePerson(person);
        }
    }

    @GetMapping("/getPersons")
    public List<SecondPerson> getPersons() {
        return service.getPersons();
    }
}
