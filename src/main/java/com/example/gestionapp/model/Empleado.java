package com.example.gestionapp.model;


import jakarta.persistence.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.ArrayList;

@Entity //Con esta anotacion le decimos que repesenta una tabla
@Table(name ="empleados")//Especificamos el nombre de la tabla
public class Empleado {

    @Id //Indica que es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Indica que se genera de manera auto incrementable
    private long  empleadoId;

    @Column(name="nombre_empleado")//Identifica el nombre de una columna
    @Size (min = 3, max = 15) //No puedes digitar datos que superen este rango
    private String nombreEmpleado;

    @Column(name ="direccion")//A todas las validaciones se les puede dar un mensaje por defecto
    @Size (min = 10, max = 50)
    private String direccionEmpleado;

    @Min(value = 1, message = "Tienes que indicar un número mayor a 1")
    @Max(value = 10, message = "Tienes que indicar un número menor a 10")//Una validacion a un rango
    private Integer aniosAntiguedad;

    @Email (message = "No se introdujo un correo valido")
    private String correoEmpleado;

    @ManyToOne//Indico que hay una relacion de Muchos a uno, desde el empleado
    @JoinColumn(name = "departamento")//Indicamos el nombre de la columna que lleva la llave foránea
    private Departamento departamentoEmpleado;

    @OneToOne
    @JoinColumn(name = "cargo")
    private Cargo cargoEmpleado;

    @ManyToMany(mappedBy = "tareaEmpleados")
    private ArrayList<Tarea> empleadoTareas;

    //Constructor vacio y constructor con atributos

    public Empleado(String nombreEmpleado, String direccionEmpleado, Integer aniosAntiguedad, String correoEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.aniosAntiguedad = aniosAntiguedad;
        this.correoEmpleado = correoEmpleado;
        this.departamentoEmpleado = departamentoEmpleado;
    }

    public Empleado() {

    }

    public long getEmpleadoId() {
        return empleadoId;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public Integer getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(Integer aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public ArrayList<Tarea> getEmpleadoTareas() {
        return empleadoTareas;
    }

    public void setEmpleadoTareas(ArrayList<Tarea> empleadoTareas) {
        this.empleadoTareas = empleadoTareas;
    }
}

//Getter y setter del ID

