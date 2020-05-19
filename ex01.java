import java.util.Scanner;

public class ex01 {

	static Scanner in = new Scanner(System.in);

	public static String prompt(String pergunta) {
		String resposta = "";
		System.out.println(pergunta);
		resposta = in.nextLine();
		return resposta;
	}

	public static void main(String[] args) {
		Pessoa mulher = new Pessoa("", "", "");
		mulher.cartaoVisita();
	}
}
