package com.example.gestionapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


@Entity
@Table(name= "cargos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter // inclui en el pom un maiven y asi puedo importar estas clases
public class Cargo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long cargoId;

    @Column (name= "nombre_cargo")
    @Size(min=2, max=15)
    private String nombreCargo;

    @Column(name="sueldo")
    @Min(value= 450000,message="El sueldo del cargo debe superar los 450000")
    private Integer sueldoCargo;

}
