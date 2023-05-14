package modelo;

import java.io.*;
import java.nio.file.Files;

import java.util.Scanner;
import java.util.logging.FileHandler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class ManejadorArchivo 
{
	 public static void escribirEnArchivo(String nombreArchivo, Figura dato) {
	        try {
	            BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo, true));
	            escritor.write(dato.toString() );
	            escritor.newLine(); // Agrega una nueva línea
	            escritor.close();
	            System.out.println("Dato agregado al archivo correctamente.");
	        } catch (IOException e) {
	            System.out.println("Error al escribir en el archivo: " + e.getMessage());
	        }
	    }
}
