package Questao03;

public class Produto {
	private int codigo;
	private String nome;
	
	public Produto() {
		codigo = 0;
		nome = "teste";
	}
	
	public Produto(int codigoInicial,String nomeInicial) {
		codigo = codigoInicial;
		nome = nomeInicial;
	}
	
	void mudarNome (String nomeInicial) {
		this.nome = nomeInicial;
	}
	public String getNome() {
		return nome;
	}

	

}
