package contas;

import cliente.Cliente;

//saldo agencia numero e titular.
public class Conta {
	double saldo;
	int agencia;
	int numero;
	public Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out
					.println("saque de " + valor + " BRL realizado com sucesso resta na conta: " + this.saldo + " BRL");
			return true;

		} else {
			System.out.println("saque não realizado! saldo insuficiente");
			return false;

		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo>=valor){
			this.saldo-= valor;
			destino.deposita(valor);
			System.out.println("transferencia de " +valor+ " BRL executada com sucesso! saldo da atual da conta de origem:" +saldo);
			return true;
		}else {
			System.out.println("saldo insuficiente!");
			return false;
		}
	}
}
