package br.com.meli.praticaspringmongo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "doctors")
public class Doctor {

    @Id
    private String doctorId;

    private String firstName;
    private String lastName;
    private String specialty;

}
