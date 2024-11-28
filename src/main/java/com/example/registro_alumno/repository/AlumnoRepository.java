/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.registro_alumno.repository;

import com.example.registro_alumno.model.Alumno;
import com.github.restup.repository.jpa.JpaRepository;
import javax.persistence.EntityManager;

public class AlumnoRepository  extends JpaRepository<Alumno, String>{
    
    public AlumnoRepository(EntityManager entityManager) {
        super(entityManager);
    }

    public void save(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
