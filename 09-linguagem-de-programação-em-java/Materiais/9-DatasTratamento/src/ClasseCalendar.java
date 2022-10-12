import java.util.Calendar;

public class ClasseCalendar {

	public static void main(String[] args) {
		// Recupera��o da data com a classe Calendar
		
		System.out.println("==> Recupera��o da data com a classe Calendar");
		Calendar cal = Calendar.getInstance();
		System.out.println("Data e Hora atual: " + cal.getTime() + "\n");
		
		// Mostra o dia da semana, m�s e ano
		System.out.println("==> Mostra o dia da semana, m�s e ano");
		System.out.println("Data/Hora atual: " + cal.getTime());
		System.out.println("Ano: " + cal.get(Calendar.YEAR));
		System.out.println("M�s: " + cal.get(Calendar.MONTH));
		System.out.println("Dia do M�s: " + cal.get(Calendar.DAY_OF_MONTH) + "\n");

		// Alterando a data/hora com m�todo set
		System.out.println("==> Alterando a data/hora com m�todo set");
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 04);

		System.out.println("Data/Hora atual: " + cal.getTime());
		System.out.println("Ano: " + cal.get(Calendar.YEAR));
		System.out.println("M�s: " + cal.get(Calendar.MONTH));
		System.out.println("Dia do M�s: " + cal.get(Calendar.DAY_OF_MONTH)+ "\n");
		
		// Recuperando a hora do dia
		System.out.println("==> Recuperando a hora do dia");
		
		Calendar cal1 = Calendar.getInstance();
		int hora = cal1.get(Calendar.HOUR_OF_DAY);
		System.out.println("Agora s�o: " + hora + " hrs");
		if(hora > 6 && hora < 12){
			System.out.println("Bom Dia");
		}else if(hora > 12 && hora < 18){
			System.out.println("Boa Tarde");
		}else{
			System.out.println("Boa Noite");
		}
	}

}
