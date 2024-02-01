package com.example.gestionapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Esta anotacion es para indicar que es un controlador que maneja vistas de Spring MVC
public class HomeController {
    @RequestMapping("/home")
}
