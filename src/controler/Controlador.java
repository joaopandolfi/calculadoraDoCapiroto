package controler;

import java.util.Scanner;

import model.AplCalcular;
import view.View;

public class Controlador {
	private AplCalcular aplCalcular = new AplCalcular();
	private View view = new View();
	
	public void start(){
		Integer resultado;
		try{
			resultado = aplCalcular.calcular(view.getValue());
			view.printResultado(resultado);
		}
		catch(Exception e){
			view.printError();
		}
	}
}
