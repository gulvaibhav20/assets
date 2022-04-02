// Image Interface - Defines the operations used by the Client
public interface Image {

  boolean getBorder();
  void setBorder(boolean border);

	double[] getLocation();
  void setLocation(double x, double y);

	void display();
}
