
public class TesteCarro {
	public static void main(String[] args) {
		Teclado t = new Teclado();

		Carro carro1, carro2, carro3;

		carro1 = new Carro(t.leString("Nome: "), t.leInt("Ano: "), t.leInt("Estoque: "), t.leInt("Estoque mínimo: "),
				t.leDouble("Preço custo: "), t.leDouble("Preço Venda: "),
				new Montadora(t.leString("Nome da montadora: "), new Cidade(t.leString("Nome da cidade: "))));

		carro2 = new Carro(t.leString("Nome: "), t.leInt("Ano: "), t.leInt("Estoque: "), t.leInt("Estoque mínimo: "),
				t.leDouble("Preço custo: "), t.leDouble("Preço Venda: "),
				new Montadora(t.leString("Nome da montadora: "), new Cidade(t.leString("Nome da cidade: "))));

		carro3 = new Carro(t.leString("Nome: "), t.leInt("Ano: "), t.leInt("Estoque: "), t.leInt("Estoque mínimo: "),
				t.leDouble("Preço custo: "), t.leDouble("Preço Venda: "),
				new Montadora(t.leString("Nome da montadora: "), new Cidade(t.leString("Nome da cidade: "))));
		
		System.out.println("-------------------------------------------");

		System.out.println("Valor da venda de 2 carros " + carro2.getNome() + ": " + carro2.vender(2));

		//Compra de 4 unidades de carros
		carro2.comprar(4, 40000, 80000);

		carro3.ajustarPrecoVenda(t.leDouble("Percentual de ajuste do preço do carro " + carro3.getNome() + ": "));

		carro1.ajustarPrecoVenda(t.leDouble("Percentual de ajuste do preço do carro " + carro1.getNome() + ": "));

		//Reposição de estoque do carro
		carro2.reporAutomaticamente();

		System.out.println("Lucro total dos carros " + carro1.getNome() + ", " + carro2.getNome() + " e "
				+ carro3.getNome() + " respectivamente:");
		System.out.println(carro1.calcularLucro());
		System.out.println(carro2.calcularLucro());
		System.out.println(carro3.calcularLucro());
		
		System.out.println("-------------------------------------------");

		System.out.println("Dados dos carros " + carro1.getNome() + ", " + carro2.getNome() + " e " + carro3.getNome()
				+ " respectivamente:");
		carro1.exibirDados();
		carro2.exibirDados();
		carro3.exibirDados();
	}
}
