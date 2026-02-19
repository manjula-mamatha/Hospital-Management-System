package com.hospital.main;

import java.util.Scanner;
import com.hospital.dto.PatientDTO;
import com.hospital.service.PatientService;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PatientService service = new PatientService();
        PatientDTO patient = new PatientDTO();

        System.out.print("Enter Patient ID: ");
        patient.setPatientId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Name: ");
        patient.setName(sc.nextLine());

        System.out.print("Enter Age: ");
        patient.setAge(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Disease: ");
        patient.setDisease(sc.nextLine());

        if (service.registerPatient(patient)) {
            System.out.println("Patient Registered Successfully");
        } else {
            System.out.println("Registration Failed");
        }

        sc.close();
    }
}
