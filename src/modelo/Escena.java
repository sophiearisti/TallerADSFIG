package modelo;

import java.util.ArrayList;

public class Escena {
	
  private Double areaEscena;
  private ArrayList<Cuadrante> Cuadrantes;

  Escena(Double areaEscena) {
    this.areaEscena = areaEscena;
  }

  public Escena(Double areaEscena, ArrayList<Cuadrante> cuadrantes) {
	super();
	this.areaEscena = areaEscena;
	Cuadrantes = cuadrantes;
}

public void calcular_area_escena() {
    
  }

  public void listar_cuadrantes () {
    
  }
}