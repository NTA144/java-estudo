package variaveis;

public class testaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais. 2");
		int idade = 20;
		int quantidadepessoas = 1;
		//boolean acompanhado = quantidadepessoas >=2;
		boolean acompanhado;
		if(quantidadepessoas>=2) {
			acompanhado= true;
		}else {
			acompanhado=false; 
		}
		System.out.println("valor de acompanhado é " + acompanhado);
		if (idade >= 18 && acompanhado == true) // && and  // é ou 

		{
			System.out.println("ok, voce pode comprar bebida");
		} else {
			System.out.println("voce não pode comprar bebida");
			}
		
		}
}
