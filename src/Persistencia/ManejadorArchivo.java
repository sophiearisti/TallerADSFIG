package Persistencia;

import java.io.*;
import java.nio.file.Files;

import java.util.Scanner;
import java.util.logging.FileHandler;

import modelo.Figura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class ManejadorArchivo 
{
	 public static void escribirEnArchivo(Figura dato) {
	        try {
	            BufferedWriter escritor = new BufferedWriter(new FileWriter("/Users/sophiaaristizabal/eclipse-workspace/TallerADS/src/Persistencia/FileFiguras.txt", true));
	            escritor.write(dato.toString() );
	            escritor.newLine(); // Agrega una nueva línea
	            escritor.close();
	            System.out.println("Dato agregado al archivo correctamente.");
	        } catch (IOException e) {
	            System.out.println("Error al escribir en el archivo: " + e.getMessage());
	        }
	    }
}
