package contas;

public class CriarConta {
	public static void main(String[] args) {
		Conta primeiraconta = new Conta();
		primeiraconta.saldo = 200;
		System.out.println("saldo: "+primeiraconta.saldo + " reais");
		primeiraconta.saldo +=100;
		System.out.println(primeiraconta.saldo);
		Conta segundaConta = new Conta();
		System.out.println(segundaConta.agencia);
		segundaConta.saldo= 50;
		System.out.println("primeira "+ primeiraconta.saldo);
		System.out.println("segunda "+ segundaConta.saldo);
	}

}
