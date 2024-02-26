package es.uah.matcomp.mp.el1.practica2Clases.Ejercicio1;

import
public class Main {
    Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
System.out.println(ahTeck.toString()); // Test toString()
ahTeck.setEmail("paulTan@nowhere.com"); // Test setter
System.out.println("name is: " + ahTeck.getName()); // Test getter
System.out.println("eamil is: " + ahTeck.getEmail()); // Test getter
System.out.println("gender is: " + ahTeck.getGender()); // Test
}
