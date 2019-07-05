package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Digite o número de produtos: ");
		int numProdutos = sc.nextInt();
		
		for(int i = 1; i <= numProdutos; i++) {
			System.out.println("Dados do produto nº " + i);
			System.out.print("Produto Comum(C) / Usado(U) / Importado(I): ");
			sc.nextLine();
			char tipoProduto = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço: ");
			double precoProduto = sc.nextDouble();
			
			if(tipoProduto == 'C') {
				Produto produtoComum = new Produto(nomeProduto, precoProduto);
				list.add(produtoComum);
			}else if(tipoProduto == 'U') {
				System.out.print("Digite a data de fabricação (DD/MM/AAAA): ");
				Date dataFabricacao = sdf.parse(sc.next());
				Produto produtoUsado = new ProdutoUsado(nomeProduto, precoProduto, dataFabricacao);
				list.add(produtoUsado);
			}else {
				System.out.print("Digite o custo alfandegário: ");
				double taxaAlfandega = sc.nextDouble();
				Produto produtoImportado = new ProdutoImportado(nomeProduto, precoProduto, taxaAlfandega);
				list.add(produtoImportado);
			}
		}
		
		System.out.println("PREÇOS");
		for(Produto prod : list) {
			System.out.println(prod.etiquetaPreco());
		}
		
		sc.close();
	}
}
