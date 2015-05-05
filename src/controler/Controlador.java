package controler;

import java.util.Scanner;

import model.AplCalcular;
import model.AplTradutorNotacao;
import view.ViewConsole;

public class Controlador {
	private AplCalcular aplCalcular = new AplCalcular();
	private ViewConsole view = new ViewConsole();
	
	public void start(){
		Integer resultado;
		String notacao;
		try{
			notacao = view.getValue();
			//notacao = AplTradutorNotacao.ocidentalToPolonesa(notacao);
			resultado = aplCalcular.calcular(notacao);
			view.printResultado(resultado);
		}
		catch(Exception e){
			view.printError();
			e.printStackTrace();
		}
	}
}
