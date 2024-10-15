package org.example.services;

import org.example.models.Patron;

import java.util.ArrayList;
import java.util.List;

public class PatronService {
    private List<Patron> patrons;

    public PatronService() {
        this.patrons = new ArrayList<>();
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void updatePatron(String patronId, Patron updatedPatron) {
        for (int i = 0; i < patrons.size(); i++) {
            if (patrons.get(i).getPatronId().equals(patronId)) {
                patrons.set(i, updatedPatron);
                return;
            }
        }
    }

    public Patron findPatronById(String patronId) {
        for (Patron patron : patrons) {
            if (patron.getPatronId().equals(patronId)) {
                return patron;
            }
        }
        return null;
    }
}
