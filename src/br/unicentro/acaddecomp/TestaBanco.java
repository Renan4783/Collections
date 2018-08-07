package br.unicentro.acaddecomp;

import java.util.*;

public class TestaBanco {
	public static void main (String args[]){
		ArrayList<ContaBanco> Banco = new ArrayList<ContaBanco>();
		Banco.add(new ContaBanco(1));
		Banco.add(new ContaBanco(2));
		Banco.add(new ContaBanco(3));
		System.out.println("\nTamanho: " + Banco.size());
		System.out.println("\nConteúdo: " + Banco);
		ContaBanco primeira = Banco.get(0);
		ContaBanco segunda = Banco.get(1);
		ContaBanco terceira = Banco.get(2);
		primeira.deposito(1000.25);
		segunda.deposito(500);
		terceira.deposito(450);
		primeira.retirada(300);
		segunda.retirada(600);
		terceira.retirada(450);
		System.out.println(primeira.getSaldo());
		System.out.println(segunda.getSaldo());
		System.out.println(terceira.getSaldo());
		Banco.remove(0);
		System.out.println("\nTamanho:" + Banco.size());
		System.out.println("\nConteúdo: " + Banco);
	}
}