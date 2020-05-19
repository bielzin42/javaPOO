import java.util.Calendar;
import java.util.Date;


public class Pessoa2 {
	private String nome;
	private int dia;
	private int mes;
	private int ano;
	
	public Pessoa2(String nome, int dia, int mes, int ano) {
		this.nome = nome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void calculaIdade() {
		int diaHoje = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		int mesHoje = Calendar.getInstance().get(Calendar.MONTH);
		int anoHoje = Calendar.getInstance().get(Calendar.YEAR);		
		int diaNascimento = getDia();
		int mesNascimento = getMes();
		int anoNascimento = getAno();
		int anoDaqui50 = (anoHoje + 50) - anoNascimento;		
		int calculoIdade = anoHoje - anoNascimento;
		
		System.out.println("Você nasceu no dia: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento);
		System.out.println("Sua idade é: " + calculoIdade + " Anos");
		System.out.println("Em 50 anos você terá: " + anoDaqui50 + " Anos");
	}
}
