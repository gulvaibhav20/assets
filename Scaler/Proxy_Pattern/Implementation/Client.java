// Client - Take use of the Service.
public class Client {
    public static void main(String[] args) {
        // Creating a new RealImage object
        Image img = new Proxy("Pic.jpg");

        // Setting Location of the Image
        img.setLocation(1.0, 0.0);
        double[] loc = img.getLocation();

				// Setting the Image Border to True
				img.setBorder(true);

        // Getting Details related to the Image.
				System.out.println("\n-- Image Details --");
				System.out.println("Image Border : " + img.getBorder());
        System.out.println("Image location : (" + loc[0] + "," + loc[1] + ")");

				// Displaying the Image
        System.out.println("\n\n-- Displaying image now --");
        img.display();
    }
}
