package br.com.meli.praticaspringmongo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "patients")
public class Patient {

    @Id
    private String patientId;

    private String firstName;
    private String lastName;
    private int age;
    private String gender;

}
