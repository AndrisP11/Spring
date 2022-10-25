package com.example.springapp.SecondApp;

import com.example.springapp.SecondApp.domain.SecondPerson;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SecondRepository {

    private String text = "";
    private List<SecondPerson> persons = new ArrayList<>();

    public String getTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        return LocalTime.now().format(dtf);
    }

    public void saveText(String newText) {
        text = text + newText + " ";
    }

    public String getText() {
        return text.trim().replaceAll(" ", "; ");
    }

    public void savePerson(SecondPerson person) {
        persons.add(person);
    }

    public List<SecondPerson> getPersons() {
        return persons;
    }
}
