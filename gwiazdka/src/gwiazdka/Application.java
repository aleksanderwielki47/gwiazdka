package gwiazdka;

import gwiazdka.Person;

public class Application {

	public static void main(String[] args) {
	
		 Person adam = new Person("Adam", 35, 1.80);
		 adam.validate();
		 
		 Person mateusz = new Person("mateusz", 20, 1.60);
		 
		 if (mateusz.getAge() > 30) {
	    		if (mateusz.getHeight() > 1.60) {
	    			System.out.println("Użytkownik ma więcej niż 30 lat i jest wyższy niż 160cm");
	    		} else {
	    			System.out.println("Użytkownik jest młodszy niż 30 lat lub ma mniej niż 160cm wzrostu");
	    		}
	    	}else {
	    		System.out.println("Użytkownik jest młodszy niż 30 lat lub ma mniej niż 160cm wzrostu");
	    	}
	}

}
