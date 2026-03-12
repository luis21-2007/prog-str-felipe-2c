package com.example.demolistviewfile.services;

import com.example.demolistviewfile.repositories.PersonFileRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PersonService {

    PersonFileRepository repo = new PersonFileRepository();

    public List<String> loadForListView() throws IOException {
        List<String> lines = repo.readAllLines();
        List<String> result= new ArrayList<>();
        for(String line : lines){
          if(line==null || line.isBlank()) continue;

          String[] parts= line.split(",");
            if(parts.length >= 3) {
                try {
                    String name = parts[0];
                    String email = parts[1];
                    int edad = Integer.parseInt(parts[2].trim());
                    result.add(name+" - "+ email+" - "+edad+" años");
                } catch (NumberFormatException e) {
                    continue;
                }
            }
        }
        return result;
    }

    public void addPerson(String name, String email, int edad) throws IOException {
        repo.addNewLine(name+","+email+","+edad);
    }


}
