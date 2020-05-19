import java.util.Scanner;

public class Pessoa {
	//ATT
	private String nome;
	private String email;
	private String numero;
	
	public Pessoa(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.numero = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void cartaoVisita() {		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = in.nextLine();
		setNome(nome);
		System.out.println("Digite seu email: ");
		String email = in.next();		
		setEmail(email);		
		System.out.println("Digite seu numero: ");
		String numero = in.next();
		setNumero(numero);		
		
		 System.out.println(getNome());
		 System.out.println(getEmail());
		 System.out.println(getNumero());
	}
}
