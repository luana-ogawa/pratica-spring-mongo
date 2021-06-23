package br.com.meli.praticaspringmongo.config;

import br.com.meli.praticaspringmongo.entities.Doctor;
import br.com.meli.praticaspringmongo.entities.Patient;
import br.com.meli.praticaspringmongo.entities.Turn;
import br.com.meli.praticaspringmongo.repository.DoctorRepository;
import br.com.meli.praticaspringmongo.repository.PatientRepository;
import br.com.meli.praticaspringmongo.repository.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private TurnRepository turnRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public void run(String... args) throws Exception {

        turnRepository.deleteAll();
        doctorRepository.deleteAll();
        patientRepository.deleteAll();

        Doctor doctor1 = new Doctor(null, "Joao", "das Neves", "Otorrino");
        Patient patient1 = new Patient(null, "Karine", "Santos", 25, "F");
        Turn turn1 = new Turn(null, patient1, doctor1, "01-01-2001", "ACTIVE");

        doctorRepository.saveAll(Arrays.asList(doctor1));
        patientRepository.saveAll(Arrays.asList(patient1));
        turnRepository.saveAll(Arrays.asList(turn1));

    }
}
