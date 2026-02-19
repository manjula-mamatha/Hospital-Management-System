package com.hospital.service;

import com.hospital.dao.PatientDAO;
import com.hospital.dao.PatientDAOImpl;
import com.hospital.dto.PatientDTO;

public class PatientService {

    private PatientDAO dao = new PatientDAOImpl();

    public boolean registerPatient(PatientDTO patient) {

        if (patient.getAge() <= 0) {
            System.out.println("Invalid Age");
            return false;
        }

        return dao.addPatient(patient);
    }
}

