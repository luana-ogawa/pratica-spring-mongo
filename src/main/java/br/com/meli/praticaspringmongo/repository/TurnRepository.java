package br.com.meli.praticaspringmongo.repository;

import br.com.meli.praticaspringmongo.entities.Doctor;
import br.com.meli.praticaspringmongo.entities.Turn;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TurnRepository extends MongoRepository<Turn, String> {
}
