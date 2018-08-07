package br.unicentro.acaddecomp;

public class ContaBanco {
	
	private double saldo;
	private double NumConta;
	
	public ContaBanco(double NumConta){
		this.saldo = 0;
		this.NumConta = NumConta;
	}
	
	public void deposito (double quantidade){
		saldo = quantidade + saldo;
	}
	
	public void retirada (double quantidade){
		if (saldo > 0 && saldo > quantidade){
			saldo = saldo - quantidade;
		} else {
			System.out.println("Saldo Insuficiente!");
		}
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public double getNumConta(){
		return NumConta;
	}
}
