package com.example.maven;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Persona> personas = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


        while (true) {
            System.out.println("Ingrese el nombre de la persona (enter para salir):");
            String nombre = scn.nextLine();
            if(nombre.isEmpty()){
                break;
            }
            System.out.println("Ingrese el apellido: ");
            String apellido = scn.nextLine();
            System.out.println("Ingrese la fecha de nacimiento (dd-MM-yyyy): ");
            String fdnString = scn.nextLine();
            LocalDate fdn = LocalDate.parse(fdnString, formatter);
            Persona persona = new Persona();
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setFechaDeNacimiento(fdn);
            personas.add(persona);
        }
        for(Persona persona : personas){
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellido: " + persona.getApellido());
            System.out.println("Fecha de nacimiento: " + persona.getFechaDeNacimiento());
        }
    }
}
