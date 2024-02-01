package com.example.gestionapp.Repository;

import com.example.gestionapp.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    //Herda de JPARepository que aporta metodos para realizar CRUD, paginacion y orden

}
