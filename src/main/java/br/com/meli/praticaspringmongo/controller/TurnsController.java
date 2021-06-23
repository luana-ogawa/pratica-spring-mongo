package br.com.meli.praticaspringmongo.controller;

import br.com.meli.praticaspringmongo.entities.Doctor;
import br.com.meli.praticaspringmongo.entities.Patient;
import br.com.meli.praticaspringmongo.entities.Turn;
import br.com.meli.praticaspringmongo.service.TurnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turns")
public class TurnsController {

    @Autowired
    TurnService turnService;

    @PostMapping("/newdoctor")
    public ResponseEntity<Doctor> createDoctor(@RequestBody Doctor doctor) {
        return null;
    }

    @PostMapping("/newpatient")
    public ResponseEntity<Doctor> createPatient(@RequestBody Patient patient) {
        return null;
    }

    @PostMapping("/newturn")
    public ResponseEntity<Doctor> createTurn(@RequestBody Turn turn) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<Turn>> findAllTurns() {
        List<Turn> turns = turnService.findAllTurns();
        return ResponseEntity.ok().body(turns);
    }

    @GetMapping("/doctor/{id}")
    public ResponseEntity<List<Turn>> findTurnsByDoctor(@PathVariable String id) {
        List<Turn> turns = turnService.findTurnsByDoctorId(id);
        return ResponseEntity.ok().body(turns);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<Turn>> findTurnsByStatus(@PathVariable String status) {
        List<Turn> turns = turnService.findTurnsByStatus(status);
        return ResponseEntity.ok().body(turns);
    }

}
