package entities;

public class Inover {

	private String nome;
	private Integer pergunta1;
	private Integer pergunta2;
	private Integer pergunta3;
	private Integer pergunta4;
	private Integer pergunta5;
	private double mediaSatisfacao;
	
	public Inover() {
	}

	public Inover(String nome, int pergunta1, int pergunta2, int pergunta3, int pergunta4, int pergunta5) {
		this.nome = nome;
		this.pergunta1 = pergunta1;
		this.pergunta2 = pergunta2;
		this.pergunta3 = pergunta3;
		this.pergunta4 = pergunta4;
		this.pergunta5 = pergunta5;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPergunta1() {
		return pergunta1;
	}

	public void setPergunta1(int pergunta1) {
		this.pergunta1 = pergunta1;
	}

	public int getPergunta2() {
		return pergunta2;
	}

	public void setPergunta2(int pergunta2) {
		this.pergunta2 = pergunta2;
	}

	public int getPergunta3() {
		return pergunta3;
	}

	public void setPergunta3(int pergunta3) {
		this.pergunta3 = pergunta3;
	}

	public int getPergunta4() {
		return pergunta4;
	}

	public void setPergunta4(int pergunta4) {
		this.pergunta4 = pergunta4;
	}

	public int getPergunta5() {
		return pergunta5;
	}

	public void setPergunta5(int pergunta5) {
		this.pergunta5 = pergunta5;
	}

	public double getMediaSatisfacao() {
	    return (pergunta1 + pergunta2 + pergunta3 + pergunta4 + pergunta5)/5;
	}
	
	
	public String mediaFelicidade() {
		double media = (pergunta1 + pergunta2 + pergunta3 + pergunta4 + pergunta5)/5;
		if(media <=2) {
			return("Infeliz!");
		}
		if(media > 2 && media < 4) {
			return("Indiferente!");
		}
		else {
			return("Feliz!");
		}
	}
	
	
}
