package br.com.meli.praticaspringmongo.repository;

import br.com.meli.praticaspringmongo.entities.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {
}
