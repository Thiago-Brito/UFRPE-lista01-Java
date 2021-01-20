package Questao03;


public class Estoque {
	private String produto;
	private int qtdAtual;
	private int qtdMinima;
	
	public Estoque() {
		produto = "produto";
		qtdAtual =0;
		qtdMinima = 0;
				
	}
	
	public Estoque(String produtoInicial,int qtdAtualInicial,int qtdMinimaInicial) {
		produto = produtoInicial;
		qtdAtual = qtdAtualInicial;
		qtdMinima = qtdMinimaInicial;
	}
	
     void mudarQtdMinima(int valor) {
		qtdMinima -= valor;
	}
    void reporEstoque(int valor) {
    	qtdAtual += valor;
    }
    
    void darBaixa(int valor) {
    	qtdAtual -= valor;
    }
  
	void relatorio(String nomeP) {
    	System.out.println("o "+nomeP+" ta com "+this.qtdAtual+" de quantidade atual e de quantidade minima "+this.qtdMinima);
    }
    
    
}
