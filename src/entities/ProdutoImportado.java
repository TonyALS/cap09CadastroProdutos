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
		return getPreco() + taxaAlfandega;
	}
	
	@Override
	public final String etiquetaPreco() {
		return getNome() 
				+ " R$ " 
				+ String.format("%.2f", precoTotal())
				+ " (Custo alfandegário: R$ " 
				+ String.format("%.2f", taxaAlfandega)
				+ ")";
	}
}
