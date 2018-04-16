
public class Carro {

	private String nome;
	private int ano;
	private int estoque;
	private int estoqueMinimo;
	private double precoCusto;
	private double precoVenda;
	private Montadora montadora;

	public Carro() {
	}

	public Carro(String nome, int ano, int estoque, int estoqueMinimo, double precoCusto, double precoVenda,
			Montadora montadora) {
		this.nome = nome;
		this.ano = ano;
		this.estoque = estoque;
		this.estoqueMinimo = estoqueMinimo;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.montadora = montadora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Montadora getMontadora() {
		return montadora;
	}

	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}

	public boolean isEstoqueMinimo() {
		return estoque <= estoqueMinimo;
	}

	public double vender(int qtde) {
		if (estoque >= qtde) {
			return descontarAno() * qtde;
		} else {
			return -1;
		}
	}

	public void comprar(int qtde, double precoCusto, double precoVenda) {
		this.estoque += qtde;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
	}

	public void reporAutomaticamente() {
		if (isEstoqueMinimo()) {
			int random = 1 + (int) (Math.random() * 10);
			this.estoque += random;
		}
	}

	public void ajustarPrecoVenda(double percentual) {
		double ajuste = precoVenda * percentual;
		if (ajuste > 0) {
			this.precoVenda += ajuste;
		} else {
			this.precoVenda -= ajuste;
		}
	}

	private double descontarAno() {
		if (ano > 2015) {
			return precoVenda;
		} else if (ano > 2010 && ano < 2015) {
			return precoVenda - precoVenda * 0.05;
		} else {
			return precoVenda - precoVenda * 0.08;
		}
	}

	public double calcularLucro() {
		descontarAno();
		return precoVenda * estoque;
	}

	public void exibirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Ano: " + this.ano);
		System.out.println("Estoque: " + this.estoque);
		System.out.println("Preço custo: " + this.precoCusto);
		System.out.println("Preço venda: " + this.precoVenda);
		System.out.println("Montadora: " + this.getMontadora().getNome());
	}

}
