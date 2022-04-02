// RealImage - Concrete class that provides actual functionality
public class RealImage implements Image {

  // Instance variables
	private double[] location = new double[2];
	private String name;
  private boolean border;

	// Constructor
	public RealImage(String filename) {
		// Loads image from disk
		System.out.println("Loaded from disk : " + filename);
		name = filename;
	}

	@Override
	public void setBorder(boolean border) {
		this.border = border;
	}

	@Override
	public boolean getBorder() {
		return this.border;
	}

  @Override
  public void setLocation(double x, double y) {
    this.location[0] = x;
    this.location[1] = y;
  }

  @Override
  public double[] getLocation() {
    return this.location;
  }

	@Override
	public void display() {
		// Display the Image
		System.out.println("Displayed : " + this.name);
	}
}
