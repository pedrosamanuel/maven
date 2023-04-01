package com.example.maven;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter@Setter
public class Persona {

    private String nombre;

    private String apellido;

    private LocalDate fechaDeNacimiento;



}
