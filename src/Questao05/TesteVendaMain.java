package Questao05;

import java.time.LocalDate;

public class TesteVendaMain {
	public static void main(String[] args) {
		Produto produto01 = new Produto(01,"Mouse","descricao",10);
		Produto produto02 = new Produto(02,"Teclado","descricao",30);
		Produto produto03 = new Produto(03,"Monitor","descricao",100);
		Produto produto04 = new Produto(04,"Computador","descricao",2000);
		
		ItemVenda item01 = new ItemVenda(10,produto01);
		ItemVenda item02 = new ItemVenda(5,produto02);
		ItemVenda item03 = new ItemVenda(10,produto03);
		ItemVenda item04 = new ItemVenda(2,produto04);
		
		Venda venda = new Venda(LocalDate.now(),"jose da silva");
		
		
		venda.adicionarItemVenda(item01);
		venda.adicionarItemVenda(item02);
		venda.adicionarItemVenda(item03);
		venda.adicionarItemVenda(item04);
		
		
		Cliente cliente = new Cliente("1234","Thiago Brito",LocalDate.parse("2001-12-01"));
			
		venda.listarItensVenda(cliente);
	    
		
	}
}
