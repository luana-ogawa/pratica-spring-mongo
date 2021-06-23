package br.com.meli.praticaspringmongo.service;

import br.com.meli.praticaspringmongo.entities.Doctor;
import br.com.meli.praticaspringmongo.entities.Turn;
import br.com.meli.praticaspringmongo.repository.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TurnServiceImpl implements TurnService{

    @Autowired
    TurnRepository turnRepository;

    @Override
    public List<Turn> findAllTurns() {
        return turnRepository.findAll();
    }

    @Override
    public List<Turn> findTurnsByDoctorId(String id) {
        return turnRepository.findAll().stream()
                .filter(turn -> turn.getDoctor().getDoctorId().equals(id))
                .collect(Collectors.toList());
    }

    @Override
    public List<Turn> findTurnsByStatus(String status) {
        return turnRepository.findAll().stream()
                .filter(turn -> turn.getStatus().equals(status))
                .collect(Collectors.toList());
    }
}
