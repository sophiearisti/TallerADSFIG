package controlador;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Persistencia.ManejadorArchivo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.Circulo;
import modelo.Cuadrado;
import modelo.Figura;
import modelo.Rectangulo;
import modelo.StringException;
import modelo.Triangulo;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

public class ControlArea implements Initializable
{

    @FXML
    private Button BCalcularArea;

    @FXML
    private Button atras;
    
    @FXML
    private TextField CuadroTexto1;

    @FXML
    private TextField CuadroTexto2;
    
    @FXML
    private Label resultado;
    
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
    	if(DatoFigura.getFigura().equals("triangulo"))
		{
			CuadroTexto2.setVisible(true);
			CuadroTexto1.setPromptText("base");
			CuadroTexto2.setPromptText("altura");
		}
    	else if(DatoFigura.getFigura().equals("cuadrado"))
		{
			CuadroTexto1.setPromptText("lado");
		}else if(DatoFigura.getFigura().equals("circulo"))
		{
			CuadroTexto2.setVisible(false);
			CuadroTexto1.setPromptText("Radio");
			
		}
    	
		else if(DatoFigura.getFigura().equals("rectangulo")) {
			CuadroTexto2.setVisible(true);
			CuadroTexto1.setPromptText("base");
			CuadroTexto2.setPromptText("altura");
		}
    	
	}
    	
   
    @FXML
    void Calcular(ActionEvent event) throws StringException 
    {
    	Double area=0d;
    	
    	if(DatoFigura.getFigura().equals("triangulo"))
    	{
    		try {
    			Double altura=Double.parseDouble (CuadroTexto2.getText());
        		Double base=Double.parseDouble (CuadroTexto1.getText());
        		
        		Triangulo triangulo=new Triangulo("0", 5d,4d, altura,base);
        		
        		area=triangulo.calcular_area();
        		
        		ManejadorArchivo.escribirEnArchivo(triangulo);
    		} catch(NumberFormatException nfe) {
    			//final Label errorLabel = new Label();
    			System.out.println("NumberFormatExcdeption");
    			//errorLabel.setText("bro eso es invalido");
    		}
    		
    	}
    	else if(DatoFigura.getFigura().equals("cuadrado"))
    	{
    		try {
    			Double lado=Double.parseDouble (CuadroTexto1.getText());
        		
        		Cuadrado cuadrado=new Cuadrado("0", 5d,4d, lado);
        		
        		area=cuadrado.calcular_area();
        		
        		ManejadorArchivo.escribirEnArchivo(cuadrado);
    		}  catch (NumberFormatException nfe) {
        		System.out.println("NumberFormatExcdeption");
        		}
        	}
    		
    		
    	else if(DatoFigura.getFigura().equals("circulo")) {
    		
    		try {
    			Double radio= Double.parseDouble(CuadroTexto1.getText());
        		Circulo circulo =new Circulo("0", 5d,4d, radio);
        		
        		area =circulo.calcularArea();
        		
        		ManejadorArchivo.escribirEnArchivo(circulo);
        	} catch (NumberFormatException nfe) {
        		System.out.println("NumberFormatExcdeption");
        	}
    	}
    		
    	
    	else if(DatoFigura.getFigura().equals("rectangulo")) {
    		try {
    			Double altura=Double.parseDouble (CuadroTexto2.getText());
        		Double base=Double.parseDouble (CuadroTexto1.getText());
        		
        		Rectangulo rectangulo =new Rectangulo("0", 5d,4d, altura,base);
        		
        		area=rectangulo.calcular_area();
        		
        		ManejadorArchivo.escribirEnArchivo(rectangulo);
    		} catch(NumberFormatException nfe) {
    			System.out.println("NumberFormatException");
    		}
    	}
    	
    	
    	resultado.setText(Double.toString(area));
    }
    
    @FXML
    void MostrarPantallaMenu(ActionEvent event) throws IOException 
    {
	     Stage stage;
	   	 Scene scene;
	   	 Parent root;
	   	 
   	 
   	 	root = FXMLLoader.load(getClass().getResource("/vista/MenuFigura.fxml"));
	    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

    } 
}

