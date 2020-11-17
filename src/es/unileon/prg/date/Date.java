package es.unileon.prg.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date (int day, int month, int year) throws DateException{
        
		//this.month = month;
		this.setMonth(month);
        if (month <= 0 || month >= 13) {
			throw new DateException("Mes " + month + " no valido. Valores posibles entre 1 y 12.");
		} else {
		    this.month = month;
		}


		//this.day = day;
		this.setDay(day);
    switch(this.month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(day <= 0 || day > 31) {
					throw new DateException("Dia " + day + " no valido. Valores posibles entre 1 y 31.");
				}else {
					this.day = day;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day <= 0 || day > 30) {
					throw new DateException("Dia " + day + " no valido. Valores posibles entre 1 y 30.");
				}else {
					this.day = day;
				}
				break;
			default:
				if(day <= 0 || day > 28) {
					throw new DateException("Dia " + day + " no valido. Valores posibles entre 1 y 28.");
				}else {
					this.day = day;
				}			
		}

	
   

		//this.year = year;
		this.setYear(year);
        if(year <= 0 
				){
			throw new DateException("Anyo " + month + " no valido. El anyo no puede ser negativo.");
		}else{
			this.year = year;
		}

	}
	
	public Date() {
		
	}
	
	public Date(Date aDay) {
		aDay = new Date();
		
	
	}


	public void setDay(int day) throws DateException {
					
		
		switch(this.month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(day <= 0 || day > 31) {
					throw new DateException("Dia " + day + " no valido. Valores posibles entre 1 y 31.");
				}else {
					this.day = day;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day <= 0 || day > 30) {
					throw new DateException("Dia " + day + " no valido. Valores posibles entre 1 y 30.");
				}else {
					this.day = day;
				}
				break;
			default:
				if(day <= 0 || day > 28) {
					throw new DateException("Dia " + day + " no valido. Valores posibles entre 1 y 28.");
				}else {
					this.day = day;
				}
		}
	}
	
	public int getDay(){
		return day;
	}

	public boolean isSameDay(Date another){

		boolean mismoDia = false;

		if(this.day == another.getDay()){
			mismoDia = true;
			System.out.println("Tienen el mismo dia");
		}else{
			mismoDia = false;
			System.out.println("Tienen el mismo dia?");
		}

		return mismoDia;
	}




	public void setMonth (int month) throws DateException {
		if ( month < 1 || month > 12) {
			throw new DateException("Date error: Month " + month + " not valid");
		}else{
		this.month = month;
		}
	}

	public int getMonth(){
		return month;
	}

	public boolean isSameMonth(Date another){

		boolean mismoMes = false;

		if(this.month == another.getMonth()){
			mismoMes = true;
			System.out.println("Tienen el mismo mes");
		}else{
			mismoMes = false;
			System.out.println("Tienen el mismo mes");
		}

		return mismoMes;
	}


	


	public void setYear (int year) throws DateException{
		if(year <= 0 
				){
			throw new DateException("Anyo " + month + " no valido. El anyo no puede ser negativo.");
		}else{
			this.year = year;

		}
	}
	public int getYear(){
		return year;
	}

	public boolean isSameYear(Date another){

		boolean mismoAnyo = false;

		if(this.year == another.getYear()){
			mismoAnyo = true;
			System.out.println("Tienen el mismo anyoo");
		}else{
			mismoAnyo = false;
			System.out.println("Tienen el mismo anyoo");
		}

		return mismoAnyo;
	}



	public boolean isSame(Date another){

		boolean mismaFecha = false;

		if((this.day == another.getDay()) && (this.month == another.getMonth()) && (this.year == another.getYear())){
			mismaFecha = true;
			System.out.println("Es la misma fecha");
		}else{
			mismaFecha = false;
			System.out.println("Es la misma fecha");
		}

		return mismaFecha;
	}


	public Date tomorrow() {
		
		Date tomorrow;
		
		int aDay = this.day;
		int aMonth = this.month;
		int aYear = this.year;
		tomorrow = new Date();
		
		aDay++;
		aMonth = month;
		
		if(aDay > daysOfMonth()) {
			aDay = 1;
			aMonth = month + 1;
		}
		
		if(aMonth > 12) {
			aDay = 1;
			aMonth = 1;
			aYear = this.year + 1;
		}else {
			aYear = this.year;
		}
		try {
			tomorrow.setDay(aDay); 
			tomorrow.setMonth(aMonth);
			tomorrow.setYear(aYear);
		}catch (DateException e) {
			e.printStackTrace();
		}
		return tomorrow;
	}

	public String getMonthName(){

		String nombreMes = "ERROR";

		switch(month){
			case 1:
				nombreMes = "January";
				break;
			case 2:
				nombreMes = "February";
				break;
			case 3: 
				nombreMes = "March";
				break;
			case 4:
				nombreMes = "April";
				break;
			case 5:
				nombreMes = "May";
				break;
			case 6:
				nombreMes = "June";
				break;
			case 7:
				nombreMes = "July";
				break;
			case 8:
				nombreMes = "August";
				break;
			case 9:
				nombreMes = "September";
				break;
			case 10:
				nombreMes = "October";
				break;
			case 11:
				nombreMes = "November";
				break;
			default:
				nombreMes = "December";
		}

		return nombreMes;
	}

		
	
	public int daysOfMonth() {
		int numDays;
		
		numDays = 0;
		switch (this.month) {
		case 1: //next
		case 3: //next
		case 5: //next
		case 7: //next
		case 8: //next
		case 10: //next
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2:
			numDays = 28;
			break;			
		}
		
		return numDays;
	}
	


	public String getSeasonName(){

		String season = " ";

		switch(month) {
			case 1: 
			case 2:
			case 12:
				season = "Winter";
				break;	
			case 3:
			case 4:
			case 5:
				season = "Spring";
				break;
			case 6:
			case 7:
			case 8:
				season = "Summer";
				break;
			case 9:
			case 10:
			case 11:
				season = "Autumn";
				break;
		}

		return season;
	}



	public String getMonthsLeft(){

		StringBuffer meses = new StringBuffer();
		int month=this.month;
		Date fecha = this;

		for(int i = this.month; i < 12; i++){
			month++;
			try {
				fecha.setMonth(month);
			} catch (DateException e) {
				e.printStackTrace();
			}
			
			meses.append(fecha.getMonthName() + " ");
			
		}

		return meses.toString();
	}




	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	public String getDaysLeftOfMonth(){

		StringBuffer dias = new StringBuffer();
		Date fecha = this;

		for(int i = this.day; i < daysOfMonth(); i++){
			fecha = fecha.tomorrow();
			dias.append(fecha.toString() + " ");
			
		}

		return dias.toString();
	}

	public String getMonthsSameDays(){

		String meses = " ";

		switch(this.month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				meses = "January March May July August October December ";
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				 meses = "April June September November ";
				break;
			default: 
				meses = "February ";
		}

		return meses;
	}




	public int daysPast() throws DateException{

		int nums = 0;

		if(this.getMonth() == 1 && this.getDay() != 1) {
			nums += this.getDay()-1;
		}else {
			int mes = this.getMonth();
			for(int i = 1; i < this.month ; i++) {
				this.setMonth(i);
				nums = nums + this.daysOfMonth();
			}
			if(this.getDay() == 31 && mes == 12 ) {
				nums = 365 - (daysOfMonth() - getDay())-1;
			}
		}
		return nums;
	}

	public int numRandomTriesEqualDate(){

		int day_ = 0;
		int month_ = 0;
		int attemps = 0;
		
		do{
			day_ = (int)((Math.random()*31)+1);
			month_ = (int)((Math.random()*12)+1);
			attemps = attemps +1;
		}while((day_ != this.day) && (month_ != this.month));
		
		return attemps;
	}

	
	public String dayOfWeek(int day) throws DateException {
		
		String valor_dia = " ";
		int diaSemana = this.daysPast() % 7;
		
		switch(diaSemana) {
			case 0:
				valor_dia = "Monday";
				break;
			case 1:
				valor_dia = "Tuesday";
				break;
			case 2:
				valor_dia = "Wednesday";
				break;
			case 3:
				valor_dia = "Thursday";
				break;
			case 4:
				valor_dia = "Friday";
				break;
			case 5:
				valor_dia = "Saturday";
				break;
			case 6:
				valor_dia = "Sunday";
				break;
		}    
	    return valor_dia;
	}	

}