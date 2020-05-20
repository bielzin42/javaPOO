import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Voo {
	private int numeroVoo;
	private Date data;
	private String horario;
	private int numeroPassageiros;

	public Voo(int numeroVoo, Date data, String horario, int numeroPassageiros) {
		this.numeroVoo = numeroVoo;
		this.data = data;
		this.horario = horario;
		this.numeroPassageiros = numeroPassageiros;
	}

	public int getNumeroVoo() {
		return numeroVoo;
	}

	public void setNumeroVoo(int numeroVoo) {
		this.numeroVoo = numeroVoo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data2) {
		this.data = data2;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}

	public Scanner getIn() {
		return in;
	}

	public void setIn(Scanner in) {
		this.in = in;
	}

	Scanner in = new Scanner(System.in);

	public void numeroVoo() {
		System.out.println("Bem-vindo ao voo: " + getNumeroVoo());
	}

	public void dataVoo() {
		Date data = new Date();
		setData(data);
		System.out.println(getData());

	}

	public void controlePassageiros() {
		mostraInfo();
		int cont = 1;
		while (cont == 1) {
			System.out.println("Escolha a operação: 1 - Adicionar Passageiros 2 - Remover Passageiros");
			int menu = in.nextInt();
			if (menu == 1) {
				adicionaPassageiro();
			} else {
				if (menu == 2) {
					removePassageiro();
				} else {
					System.out.println("Numero inválido");
				}
			}
			System.out.println("Deseja voltar ao menu?" );
			System.out.println("Numero 1 - Sim");
			System.out.println("Qualquer numero - Não" );

			cont = in.nextInt();
		}
		System.out.println("Finalizando operação...");
		System.out.println("Operação encerrada.");
	}

	public void removePassageiro() {
		System.out.println("--------------------------------");
		System.out.println("| O numero de passageiros é: " + getNumeroPassageiros() + " |");
		System.out.println("--------------------------------");
		int limite = getNumeroPassageiros();
		System.out.println("Quantos passageiros deseja remover? Lembrando que o limite é: " + limite);
		int removePassageiros = in.nextInt();
		if(removePassageiros <= limite && removePassageiros >= 0) {
			this.numeroPassageiros -= removePassageiros;
			System.out.println("------------------------------------");
			System.out.println("| Número atual de passageiros é: " + getNumeroPassageiros() + " |");
			System.out.println("------------------------------------");
		} else {
			System.out.println("Você não pode remover este número de passageiros.");
		}
		
	}

	public void adicionaPassageiro() {
		int passageiros = getNumeroPassageiros();
		if (passageiros < 50) {
			System.out.println("------------------------------------");
			System.out.println("| Número atual de passageiros é: " + getNumeroPassageiros() + " |");
			System.out.println("------------------------------------");
			int limitePassageiros = 50 - passageiros;
			System.out.println("Digite o número de passageiros que deseja adicionar. O limite é: " + limitePassageiros);
			int numeroAdicionar = in.nextInt();
			if (numeroAdicionar <= limitePassageiros) {
				this.numeroPassageiros += numeroAdicionar;
				System.out.println("Passageiro(s) adicionado(os) com sucesso! ");
				System.out.println("-------------------------------------");
				System.out.println("| Número atual de passageiros é: " + getNumeroPassageiros() + " |");
				System.out.println("-------------------------------------");
			} else {
				System.out.println("Numero excede a quantidade limite de passageiros!");
				System.out.println("Operação cancelada.");
			}

		} else {
			System.out.println("numero limite de passageiros atingidos, você não pode adicionar.");
		}
	}
	public void mostraInfo() {		
		System.out.printf("Data: ");
		dataVoo();
		System.out.println("Numero do voo: " + getNumeroVoo());
		System.out.println("Numero de passageiros: " + getNumeroPassageiros());		
	}
}
