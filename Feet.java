package polymorphism_assignment;

public class Feet implements Measure {
	  private double length;

	  public Feet(double length) {
	    this.length = length;
	  }
	  public double calculateLength() {
	    return length/30.48;
	  }
	}