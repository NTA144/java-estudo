package cliente;
import contas.Conta;
public class TestaBanco {
	public static void main(String[] args) {
		Cliente nathan= new Cliente();
		nathan.nome="Nathan";
		nathan.CPF= "111.111.111.11";
		nathan.profissao= "padeiro";
		Conta contaDoNathan = new Conta();
		contaDoNathan.deposita(100);
		contaDoNathan.titular= nathan;
		System.out.println(contaDoNathan.titular.nome);
	}

}
