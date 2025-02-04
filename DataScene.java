import org.code.theater.*;
import org.code.media.*;

public class DataScene extends Scene {

  private String[][] locations;
  private int[][] ratings;

  public DataScene(String[][] locations, int[][] ratings) {
    this.locations = locations;
    this.ratings = ratings;
  }

  /*
   * Draw scenes of Dubai images.
   */
  public void drawScene() {
    drawIntroScene();
    drawBurjKhalifaScene();
    drawDubaiMarinaScene();
    drawPalmJumeirahScene();
    drawDubaiMallScene();
    drawDesertSafariScene();
    drawAtlantisScene();
    drawAtmosphereScene();
    drawGlobalVillageScene();
    drawLaMerBeachScene();
    drawOssianoScene();
    drawEnd();
  }

  public void drawIntroScene() {
    playSound("airplane_chime_x.wav");
    drawImage("dubai-image.png", 0, 0, 400);
    drawText("Welcome to Dubai!", 60, 50);
    pause(2);
    clear("white");
  }

  /*
   * Methods for location in dubai.
   */
  public void drawAtlantisScene() {
    drawLocationScene(5, "atlantis.jpg", "Atlantis");
  }

  public void drawAtmosphereScene() {
    drawLocationScene(6, "atmosphere.jpg", "Atmosphere");
  }

  public void drawGlobalVillageScene() {
    drawLocationScene(7, "globalvillage.jpg", "Global Village");
  }

  public void drawLaMerBeachScene() {
    drawLocationScene(8, "la-mer-beach.jpg", "La Mer Beach");
  }

  public void drawOssianoScene() {
    drawLocationScene(9, "ossiano.jpg", "Ossiano");
  }

  // Existing methods for the first 5 locations
  public void drawBurjKhalifaScene() {
    drawLocationScene(0, "burj.jpeg", "Burj Khalifa");
  }

  public void drawDubaiMarinaScene() {
    drawLocationScene(1, "dubai-marina-boat.jpg", "Dubai Marina");
  }

  public void drawPalmJumeirahScene() {
    drawLocationScene(2, "palmjumeirah.jpg", "Palm Jumeirah");
  }

  public void drawDubaiMallScene() {
    drawLocationScene(3, "dubaimall.jpg", "Dubai Mall");
  }

  public void drawDesertSafariScene() {
    drawLocationScene(4, "desertsafari.png", "Desert Safari");
  }

  /*
   * Draw any location scene.
   */
  private void drawLocationScene(int index, String imageFile, String locationName) {
    setTextHeight(30);
    setBackgroundColor(index);
    CustomImage img = new CustomImage(imageFile);
    drawImage(img, 50, 0, 300);
    drawText(locationName, 10, 390);
    drawAverageTimeSpent(index);  
    drawRating(index);  // Draw the rating
    pause(1);

    /*
     * Apply filters.
     */    
    img.invertColors();
    drawImage(img, 50, 0, 300);
    pause(1);

    clear("white");
  }

  public void drawEnd() {
    drawImage("burjalarab.jpg", 0, 0, 400);
    drawText("Live, Laugh, Love Dubai!", 50, 50);
  }

  /*
   * New method to draw the average time spent at the place.
   */  
  private void drawAverageTimeSpent(int index) {
    drawText("Average Time Spent: " + locations[2][index] + " hours", 10, 330);  
  }

  /*
   * New method to draw the rating of the place.
   */
  private void drawRating(int index) {
    int rating = ratings[0][index];  
    drawText("Rating: " + rating + "/10", 10, 360); 
  }

  /*
   * Sets background color based on the rating.
   */
  private void setBackgroundColor(int index) {
    int rating = ratings[0][index];
    if (rating >= 8) {
      clear("green");
    } else if (rating >= 5) {
      clear("yellow");
    } else {
      clear("red");
    }
  }
}
