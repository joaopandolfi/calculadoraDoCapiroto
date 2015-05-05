package model;

import java.util.Stack;

public class AplTradutorNotacao {

	public static String ocidentalToPolonesa(String ocidental){
		Stack<String> pilha = new Stack<String>();
		String novaNotacao = "";
		String buffer = "";
		
		ocidental = adicionaParenteses(ocidental);
		
		//percorro a notação A ser convertida
		for(char operando : ocidental.toCharArray()){
			
			if(operando == '('){
				if(buffer == ""){
					pilha.push(buffer);
					buffer = "";
				}
			}
			else if(operando == ')'){
				
				//processar buffer
				processaNotacao(buffer);
				
				if(!pilha.isEmpty()){
					buffer = pilha.pop();
					//processo
					processaNotacao(buffer);
				}
			}
			else if(operando == ' '){
				//se for espaco nao faz nada
			}else{
				//adciono no buffer
				buffer +=operando;
			}
		}
		
		while(!pilha.empty()){
			buffer = pilha.pop();
			processaNotacao(buffer);
		}
		
		return novaNotacao;
	}
	
	private static String adicionaParenteses(String notacao){
		int size = notacao.length();
		int comecoIndex, fimIndex;
		ArrayList<char> listaElementos = new ArrayList<char>();
		
		for (int index = 0; index < size; index++){
			if (notacao.charAt(index) == '*'){
				while (){
						
				}
			}
		}
		
		notacao = notacao.substring(0, 4) + "(" + notacao.substring(4, notacao.length());
		return "";
	}
	
	private static String processaNotacao(String notacao){
		return "";
	}
}
