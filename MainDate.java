package es.unileon.prg.clase_date;

public class MainDate {

	public static void main(String[] args) {
		Date today;
        Date tomorrow;
		
		try {
			today = new Date(11,11,2020);
			System.out.println(today);
            tomorrow = new Date(11, 10, 2019);
			System.out.println("Segunda fecha: " + tomorrow.toString());
			System.out.println(today.isSameYear(tomorrow));
			System.out.println(today.isSameMonth(tomorrow));
			System.out.println(today.isSameDay(tomorrow));
			System.out.println(today.isSame(tomorrow));
			System.out.println("El nombre del mes de " + today + " es: " + today.getMonthName());
			System.out.println("El nombre del mes de " + tomorrow + " es: " + tomorrow.getMonthName());
			System.out.println("El mes de " + today.getMonthName() + " tiene " + today.daysOfMonth() + " dias.");
			System.out.println("El mes de " + tomorrow.getMonthName() + " tiene " + tomorrow.daysOfMonth() + " dias.");
			System.out.println("La estacion de la primera fecha es: " + today.getSeasonName());
			System.out.println("La estacion de la segunda fecha es: " + tomorrow.getSeasonName());
			System.out.println("Desde la primera fecha faltan " + today.getMonthsLeft() + " meses para acabar el anyo.");
			System.out.println("Desde la segunda fecha faltan " + tomorrow.getMonthsLeft() + " meses para acabar el anyo.");
			System.out.println("Desde la primera fecha faltan " + today.getDaysLeftOfMonth() + " dias para acabar el mes.");
			System.out.println("Desde la segunda fecha faltan " + tomorrow.getDaysLeftOfMonth() + " dias para acabar el mes.");
			System.out.println("Los meses con los mismos dnyas que la primera fecha son: " + today.getMonthsSameDays());
			System.out.println("Los meses con los mismos dnyas que la segunda fecha son: " + tomorrow.getMonthsSameDays());
			System.out.println("Dias desde principio de anyo hasta " + today + ": " + today.daysPast());
			System.out.println("Dias desde principio de anyo hasta " + tomorrow + ": " + tomorrow.daysPast());
			System.out.println("Intentos de generar la misma fecha 1 con bucle do-while: " + today.numRandomTriesEqualDate());
			System.out.println("Intentos de generar la misma fecha 2 con bucle do-while: " + tomorrow.numRandomTriesEqualDate());
			//System.out.println("Intentos de generar la misma fecha 1 con bucle while: " + today.numberAttempsWhile());
			//System.out.println("Intentos de generar la misma fecha 2 con bucle while: " + tomorrow.numberAttempsWhile());

		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
	}

}