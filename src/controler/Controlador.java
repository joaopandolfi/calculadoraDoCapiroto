package controler;

import java.util.Scanner;

import model.AplCalcular;

public class Controlador {
	private AplCalcular aplCalcular = new AplCalcular();
	private Scanner read = new Scanner(System.in);
	
	public void start(){
		Integer resultado;
		try{
			System.out.print("Insira o calculo do saci para eu calcular :D => ");
			resultado = aplCalcular.calcular(read.nextLine());
			System.out.println(resultado);
		}
		catch(Exception e){
			System.out.println("DEU ZICA");
		}
		
	}
}
