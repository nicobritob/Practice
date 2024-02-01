package com.example.gestionapp.service;

import com.example.gestionapp.model.Empleado;

public interface EmpleadoService {
    Empleado guardarEmpleado(Empleado empleadoParaGuardar);
    //En esta interfaz declaro los metodos solamente
   // Empleado guardarEmpleado(Empleado empleadoParaGuardar);

    void borrarEmpleadoPorId(Long empleadoId);
}
