package colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		System.out.println("=====================================================");
		System.out.println("Adicionando elementos na lista: \n");
		
		List<String> list = new ArrayList<>();
		
		list.add("MARIA");
		list.add("ALEX");
		list.add("BOB");
		list.add("ANA \n");
				
		
		for (String x : list) {
		    System.out.println(x);
		}
		System.out.println("=====================================================");
		System.out.println("Inserir um elemento na posição 2 da minha lista: \n");
		
		list.add(2, "MARCO");
		
		for (String x : list) {
		    System.out.println(x);
		}
		System.out.println("=====================================================");
		
		System.out.println("Ver tamanho da lista: \n");
		System.out.println(list.size() + "\n");
		System.out.println("=====================================================");
		
		System.out.println("Remover um elemento da lista: \n");
		
		list.remove("ANA");
		
		for (String x : list) {
		    System.out.println(x);
		}
		System.out.println("=====================================================");
		
		System.out.println("Remover um elemento da lista que está na posição 1: \n");
		
		list.remove(1);
		
		for (String x : list) {
		    System.out.println(x);
		}
		System.out.println("=====================================================");
		
		
		System.out.println("Remover da lista elementos que começam com a letra M: \n");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
		    System.out.println(x);
		}
		System.out.println("=====================================================");
		System.out.println("Encontrar a posição de um elemento: \n");
		System.out.println("Index of BOB: " + list.indexOf("BOB"));
		System.out.println("Index of MARCO: " + list.indexOf("MARCO") + "\n");
		
		System.out.println("=======================================================================");
		System.out.println("Deixar na minha lista apenas os elementos que começam com a letra A: \n");
		

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
		    System.out.println(x);
		}
		
		System.out.println("========================================================================");
		System.out.println("Encontrar um elemento da lista em que a segunda letra seja N: \n");
		String name = list.stream().filter(x -> x.charAt(1) == 'N').findFirst().orElse(null);
		System.out.println(name);
	}
}