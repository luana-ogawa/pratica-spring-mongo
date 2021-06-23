package br.com.meli.praticaspringmongo.service;

import br.com.meli.praticaspringmongo.entities.Turn;

import java.util.List;

public interface TurnService {

    public List<Turn> findAllTurns();
    public List<Turn> findTurnsByDoctorId(String id);
    public List<Turn> findTurnsByStatus(String status);
}
