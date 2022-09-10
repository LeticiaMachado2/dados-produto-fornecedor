package entities;

public class Produto {

	// atributos
	private Integer idProduto;
	private String nome;
	private Double preço;
	private Integer quantidade;
	private Fornecedor fornecedor;


	// construtor sem argumentos(defaul),mesmo nome da classe,usado quando da new na
	// classe,quando instancia.
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	// construtor com entrada de argumentos (sobrecarga de métodos)
	public Produto(Integer idProduto, String nome, Double preço, Integer quantidade, Fornecedor fornecedor) {
		super(); // super: faz uma chamada na classe pai
		this.idProduto = idProduto;
		this.nome = nome;
		this.preço = preço;
		this.quantidade = quantidade;
		this.fornecedor = fornecedor;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
// toString: método filho da classe Object que é a classe pai(usado quando vc quiser pegar todos os dados do produto e imprimir numa única linha de texto.)
//imprime em String com uma única linha de texto,saída de dados.
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", preço=" + preço + ", quantidade=" + quantidade
				+ ", fornecedor=" + fornecedor + "]";
	}

}
