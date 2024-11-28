/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.registro_alumno.controller;

import com.example.registro_alumno.repository.AlumnoRepository;
import com.example.registro_alumno.model.Alumno;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

public class AlumnoController {
    
    @Autowired
    private AlumnoRepository alumnoRepository;

    // Página de inicio con el formulario
    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        model.addAttribute("alumno", new Alumno());
        return "index";
    }

    // Manejar el envío del formulario
    @PostMapping("/registrar")
    public String registrarAlumno(@ModelAttribute Alumno alumno, Model model) {
        // Aquí calculamos la edad basado en la fecha de nacimiento
        int edad = java.time.Period.between(alumno.getFechaNacimiento(), java.time.LocalDate.now()).getYears();
        alumno.setEdad(edad);

        // Guardamos el alumno en la base de datos
        alumnoRepository.save(alumno);

        // Pasamos los datos a la página de éxito
        model.addAttribute("alumno", alumno);
        return "success";
    }
}
