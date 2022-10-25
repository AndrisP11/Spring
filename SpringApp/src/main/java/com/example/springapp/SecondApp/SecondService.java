package com.example.springapp.SecondApp;

import com.example.springapp.SecondApp.domain.SecondPerson;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecondService {

    private SecondRepository repository;

    public SecondService(SecondRepository repository) {
        this.repository = repository;
    }

    public String getTime() {
        return repository.getTime();
    }

    public void saveText(String newText) {
        this.repository.saveText(newText);
    }

    public String getText() {
        return repository.getText();
    }

    public void savePerson(SecondPerson person) {
        repository.savePerson(person);
    }

    public List<SecondPerson> getPersons() {
        return repository.getPersons();
    }
}
