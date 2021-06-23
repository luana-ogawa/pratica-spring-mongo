package br.com.meli.praticaspringmongo.repository;

import br.com.meli.praticaspringmongo.entities.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {
}
