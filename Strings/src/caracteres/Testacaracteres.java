package caracteres;

public class Testacaracteres {

	public static void main(String[] args) {
		
		char letra='a'; // so aceita uma letra 
		System.out.println(letra);
		char valor=66; // b maiusculo
		System.out.println(valor);
		valor= (char)(valor+1);
		System.out.println(valor);
		
		String mensagem= "eu estou aprendendo java";
		System.out.println(mensagem);
		mensagem= (mensagem + " ") + 2023;
		System.out.println(mensagem);
	}

}
