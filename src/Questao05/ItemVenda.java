package Questao05;

public class ItemVenda {
   private int quantidade;
   private Produto produto;
   
   public ItemVenda(int quantidade, Produto produto) {
	   this.quantidade = quantidade;
	   this.produto = produto;
   }
   
public double calcularTotal() {
	   return produto.getPreco() * this.quantidade;
   }

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
public double getPreco1() {
	return produto.getPreco();
}

public String getNome1() {
	return produto.getNome();
}
   
}
