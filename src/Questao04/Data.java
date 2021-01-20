package Questao04;

import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Data {

	public static void main(String[] args) {
		// data que o usuario tem que digitar
	   Scanner datah = new Scanner(System.in);
	    
	   CharSequence data;
	   
	   System.out.println("Digite uma data no formata YYYY-MM-DD :");
	   
	   data = datah.next();
	   
	   LocalDate usuario = LocalDate.parse(data);
	   
	   // diferenca de dias da data digitada pelo usuario e hoje
	   LocalDate agora = LocalDate.now();
	   
	   System.out.println("\ndifenca em dias de "+usuario+" para o "+agora+" eh "+usuario.until(agora,ChronoUnit.DAYS));
	   
	   // some 110 dias a data digitada pelo usuario
	   System.out.println("\na data digitada pelo usuario +100 dias eh "+usuario.plusDays(110));
	   
	   //alterar a data digitda pelo usuario para agosto, e trocar formato
	   
	   LocalDate usuarioAlterada = usuario.withMonth(8);
	   
	   DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
	   
	   String resultado = formatador.format(usuarioAlterada);
	   
	   System.out.println("\na data digitada pelo usuario em agosto eh "+resultado);
	   
	   //pega a função da diferença de dias uteis
	   diferencaDataUteis();
	} 
	
	public static void diferencaDataUteis() {
		LocalDate data1 = LocalDate.parse("2020-11-01");
		LocalDate data2 = LocalDate.parse("2020-12-01");
		
	    long v = data1.until(data2,ChronoUnit.DAYS);
		
		int diau = 0;
		
		for(int i = 1;i<=v;i++) {
			if(data1.plusDays(i).getDayOfWeek() != DayOfWeek.SUNDAY && data1.plusDays(i).getDayOfWeek() != DayOfWeek.SATURDAY) {
			 diau++;
			}
			
		}
		
		System.out.println("\ndo "+data1+" para o "+data2+" possui "+diau+" dias uteis");
	
	}

}
