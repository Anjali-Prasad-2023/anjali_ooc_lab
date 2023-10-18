package polymorphism_assignment;

public class Meter implements Measure {
	  private double length;

	  public Meter(double length) {
	    this.length = length;
	  }
	  public double calculateLength() {
	    return length/100;
	  }
	}