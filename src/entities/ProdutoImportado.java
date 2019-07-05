package entities;

public class ProdutoImportado extends Produto{
	
	private Double taxaAlfandega;
	
	//Constructors:
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	//Getters and Setters:
	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	//Métodos:
	public Double precoTotal() {
		return preco + taxaAlfandega;
	}
	
	//Verificar a implementação deste override:
	@Override
	public final String etiquetaPreco() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(nome + " - Preço: R$ " + String.format("%.2f", precoTotal()) + " "); 
		sb.append("(Alfândega: R$ " + String.format("%.2f", taxaAlfandega) + ")");
		return sb.toString();
	}
	
}
