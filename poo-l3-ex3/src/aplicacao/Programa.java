package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.Fisico;
import entidades.Juridico;

public class Programa {
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  List<Contribuinte> contribuintes = new ArrayList<>();
		  
		  System.out.println("Digite o número de contribuintes:");
		  int n = sc.nextInt();
		  
		  for (int i = 0; i < n; i++) {
			  System.out.println();
			  System.out.println("Dados do contribuinte #" + (i+1) + ":");
			  System.out.println("Pessoas física ou jurídica (f/j)?");
			  char tipo = sc.next().charAt(0);
			  System.out.println("Nome:");
			  sc.nextLine();
			  String nome = sc.nextLine();
			  System.out.println("Renda anual:");
			  double renda = sc.nextDouble();
			  
			  if (tipo == 'f' || tipo == 'F') {
				  System.out.println("Despesas com saúde");
				  double despesas = sc.nextDouble();
				  contribuintes.add(new Fisico(nome, renda, despesas));
			  } else {
				  System.out.println("Número de empregados");
				  int nEmpregados = sc.nextInt();				  				  
				  contribuintes.add(new Juridico(nome, renda, nEmpregados));
			  }
		  }
		  
		  System.out.println();
		  System.out.println("Impostos pagos:");
		  double totalImposto = 0;
		  
		  for (Contribuinte c : contribuintes) {
			  double valorImposto = c.imposto();
			  System.out.println(c.getNome() + ": R$ " + String.format("%.2f", valorImposto));
			  totalImposto += valorImposto;
		  }
		  
		  System.out.println();
		  System.out.println("Impostos totais: R$ " + String.format("%.2f", totalImposto));
		  
	  }
}