package polymorphism_assignment;

public class Main {
	  public static void main(String[] args) {
	    Measure Meter = new Meter(10);
	    Measure Feet = new Feet(10);

	    System.out.println("converting cm into m (10): " + Meter.calculateLength());
	    System.out.println("converting cm into feet (10): " + Feet.calculateLength());
	  }
	}