package service;

import model.Clinic;
import model.Patient;

public interface ClinicService {
    void addClinic(Clinic clinic);

    void addPatientToClinic(Patient patient, String idClinic);
}
