package lacosrepeticao;
import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) {
		/*
		 * Vamos escrever um programa que l� um n�mero via teclado e multiplica 
		 * ele por 5, at� o contador atingir o valor limite menor ou igual a 2, 
		 * iniciando o nosso contador em 3.
		 */
		
		int contador = 3;
		int numero, resultado;
		Scanner leia = new Scanner(System.in);
		
		do {
			//
			System.out.println("Digite um n�mero:");
			numero = leia.nextInt();
			resultado = numero * 5;
			//o calculo de multiplica��o solicitado no enunciado
			
			System.out.println("Resultado �: "+ resultado);
			//System.out.println(contador);
			contador++;
		}while(contador >=2);

		//contador = 1 --- 5 contador ++
		//contador = 5 ---- 1 contador --
	}
}
