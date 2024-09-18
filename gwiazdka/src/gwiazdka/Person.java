package gwiazdka;

public class Person {
    public static String name;
    public static double age;
    public static double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
    
    void validate() {
    	if (age > 30) {
    		if (height > 1.60) {
    			System.out.println("Użytkownik ma więcej niż 30 lat i jest wyższy niż 160cm");
    		} else {
    			System.out.println("Użytkownik jest młodszy niż 30 lat lub ma mniej niż 160cm wzrostu");
    		}
    	}else {
    		System.out.println("Użytkownik jest młodszy niż 30 lat lub ma mniej niż 160cm wzrostu");
    	}
    }
}
