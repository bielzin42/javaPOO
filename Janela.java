
public class Janela {
	private double largura;
	private double altura;
	private boolean aberta;
	
	public Janela(boolean aberta) {
		this.aberta = aberta;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public boolean estaAberta () {
		if(isAberta() == true) {
			System.out.println("Janela est� aberta.");
		} else {
			System.out.println("Janela est� fechada.");
		}
		return isAberta();
	}
	
	public void abrirJanela() {
		if(estaAberta() == false) {
			System.out.println("Abrindo janela");
			setAberta(true);
			estaAberta();
		} else {
			System.out.println("Janela j� est� aberta.");			
		}		
	}
}
