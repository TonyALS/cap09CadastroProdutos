package entities;

public class Produto {
	
	private String nome;
	private Double preco;
	
	//Constructors
	public Produto () {
	}
	
	public Produto (String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//Getters and setters:
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	//M�todos:
	public String etiquetaPreco() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome + " - " + "Pre�o: R$ " + String.format("%.2f", preco));
		return sb.toString();
	}
}
