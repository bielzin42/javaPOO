import java.util.Scanner;

public class Empregados {
	private int id;
	private String nome;
	private String sobrenome;
	private double salarioAtual;
	
	public  Empregados (int id, String nome, String sobrenome, double salarioAtual) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioAtual = salarioAtual;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioAtual() {
		return salarioAtual;
	}

	public void setSalarioAtual(double salarioAtual) {
		this.salarioAtual = salarioAtual;
	}
	Scanner in = new Scanner(System.in);
	
	public void nomeSalario() {
		System.out.println("Listando funcionario");
		System.out.println("funcionário id: " +getId());
		System.out.println("Nome: " + getNome() + " " + getSobrenome());
		System.out.println("Salário atual: " + "R$"+getSalarioAtual());
	}
	
	public void aumento20() {
		nomeSalario();
		System.out.println("Aplicando aumento de 20% sob: R$" + getSalarioAtual());
		double salario = getSalarioAtual();
		setSalarioAtual (salario += (salario *.2));
		System.out.println("Salário atual: " + "R$"+getSalarioAtual());
	}
	
	public void reajuste(double aumento) {
		nomeSalario();
		double salario =  getSalarioAtual();
		double calc = (aumento / 100);
		setSalarioAtual(salario += (salario *calc)); 
		System.out.println("Reajuste de salário com sucesso.");
		System.out.println("percentual de reajuste: " + aumento +  "%");
		System.out.println("Salário atual: R$" + getSalarioAtual());
	}
	
	public int percentualAumento(double percentual) {
		int porcentagemDeAumento = (int) (percentual * 100);			
		return porcentagemDeAumento;
		}
}
