package Questao03;

public class TesteEstoqueMain {
	public static void main(String[] args) {
     Produto produto01 = new Produto(1,"teclado");
     
     
     Produto produto02 = new Produto(2,"mouse");
     
     
     Estoque estoque1 = new Estoque("produto01",20,15);
     
     
     Estoque estoque2 = new Estoque("produto02",30,10);
     
     
     
      estoque1.darBaixa(10);
      estoque2.reporEstoque(19);
      
      estoque1.relatorio(produto01.getNome());
      estoque2.relatorio(produto02.getNome());
     
     produto01.mudarNome("Teclado Virtual");
     System.out.println("\n\nSegunda parte\n\n");
     estoque1.relatorio(produto01.getNome());
     estoque2.relatorio(produto02.getNome());
    
     
     
     
   
     
     
     
}}
