package view;

import java.util.Scanner;

public class View {
	private Scanner read = new Scanner(System.in);
	
	public String getValue(){
		System.out.print("Insira o calculo do saci para eu calcular :D => ");
		return read.nextLine();
	}
	
	public void printResultado(int resultado){
		System.out.println("Resultado: "+resultado);
	}
	
	public void printError(){
		System.out.println("DEU ZICA");
	}
}
