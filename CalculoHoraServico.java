package exercicio;

import java.util.Scanner;

/* Calculadora para identificar quanto cobrar por hora com base na remuneração mensal pretendida, 
considerando custos com impostos de 30%, investimentos em ferramentas, cursos, etc de 20%. */

public class CalculoHoraServico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cálculo do valor da hora de um serviço");
		System.out.print("Remuneração mensal pretendida: ");
		float remuneracao = sc.nextFloat();
		System.out.print("Custo operacional mensal: ");
		float custo = sc.nextFloat();
		System.out.print("Carga horária mensal de trabalho: ");
		float cargaHoraria = sc.nextFloat();
		
		float hora = (float) ((remuneracao + (remuneracao * 0.3) + (remuneracao * 0.2) + custo) / cargaHoraria);
		
		System.out.printf("Valor da hora: %.2f", hora);
		
		sc.close();
	}
}
