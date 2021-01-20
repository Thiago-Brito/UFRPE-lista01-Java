package Questao05;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Venda {
   
	private LocalDate data;
    private String atendente;
    List<ItemVenda> venda;
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/YYYY");
    
    public Venda(LocalDate data, String atendente) {
    	this.atendente = atendente;
    	this.data = data;
    	this.venda = new ArrayList();
    }
    
    public void adicionarItemVenda(ItemVenda item) {
    	venda.add(item);
    }
   
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getAtendente() {
		return atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}

	public List<ItemVenda> getVenda() {
		return venda;
	}

	public void setVenda(List<ItemVenda> venda) {
		this.venda = venda;
	}
	public double calcularTotal() {
	    	double soma = 0.0;
	    	for(int i = 0;i<4;i++) {
	    		soma = soma + venda.get(i).calcularTotal();
	    	}
	    	return soma;
	    }
	 
	 public void listarItensVenda(Cliente cliente) {
		 System.out.println("Data da venda : "+formatador.format(data));
		 System.out.println("Cliente : "+cliente.getNome()+" | CPF: "+cliente.getCpf()+" | idade: "+cliente.calcularIdade());
		 System.out.println("Atendente: "+atendente);
		 System.out.println("\nNome do produto | Preço    | Quantidade | Total");
		 System.out.println("---------------------------------------------------------");
		 System.out.println(venda.get(0).getNome1()+"           | R$ "+venda.get(0).getPreco1()+"  |         "+venda.get(0).getQuantidade()+" | R$ "+venda.get(0).calcularTotal());
		 System.out.println(venda.get(1).getNome1()+"         | R$ "+venda.get(1).getPreco1()+"  |          "+venda.get(1).getQuantidade()+" | R$ "+venda.get(1).calcularTotal());
		 System.out.println(venda.get(2).getNome1()+"         | R$ "+venda.get(2).getPreco1()+" |         "+venda.get(2).getQuantidade()+" | R$ "+venda.get(2).calcularTotal());
		 System.out.println(venda.get(3).getNome1()+"      | R$ "+venda.get(3).getPreco1()+"|          "+venda.get(3).getQuantidade()+" | R$ "+venda.get(3).calcularTotal());
		 System.out.println("---------------------------------------------------------");
		 System.out.println("Total da Venda:                           R$ "+calcularTotal());
	 }
}
