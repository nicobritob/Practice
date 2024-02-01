package com.example.gestionapp.service;


import com.example.gestionapp.Repository.TareaRepository;
import com.example.gestionapp.model.Tarea;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class TareaServiceImpl implements TareaService{

    @Autowired
    private TareaRepository tareaRepository;

    @Override
    public List<Tarea> obtenerListaTareas() {
        return tareaRepository.findAll();
    }
}
