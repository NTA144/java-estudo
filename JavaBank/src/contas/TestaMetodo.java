package contas;

public class TestaMetodo {
	
	
	public static void main(String[] args) {
		Conta contaDoNathan = new Conta();

		contaDoNathan.saldo = 100;

		contaDoNathan.deposita(70);

	

		contaDoNathan.saca(2);
		
		Conta contaDaMaria= new Conta();
		contaDaMaria.deposita(1000);
		
		contaDaMaria.transfere(300, contaDoNathan);
		System.out.println("saldo do nathan apos transferencia: "+contaDoNathan.saldo);
		
	

	}

}
