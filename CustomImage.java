import org.code.theater.*;
import org.code.media.*;

/*
 * CustomImage extends the Image class 
 */
public class CustomImage extends Image {

  private Pixel[][] pixelGrid; 

  /*
   * Constructor
   */
  public CustomImage(String filename) {
    super(filename); 
    pixelGrid = extractPixels();
  }

  /*
   * Returns the 2D array of pixels.
   */
  public Pixel[][] getPixelGrid() {
    return pixelGrid;
  }

  /*
   * Converts the image into a 2D array of Pixel objects.
   */
  private Pixel[][] extractPixels() {
    Pixel[][] tempGrid = new Pixel[getHeight()][getWidth()];
    
    for (int y = 0; y < tempGrid.length; y++) {
      for (int x = 0; x < tempGrid[0].length; x++) {
        tempGrid[y][x] = getPixel(x, y); 
      }
    }

    return tempGrid;
  }

  /*
   * Inverts the colors in the image.
   */
  public void invertColors() {
    Pixel[][] pixels = getPixelGrid();

    for (Pixel[] row : pixels) {
      for (Pixel p : row) {
        p.setRed(255 - p.getRed());   
        p.setGreen(255 - p.getGreen()); 
        p.setBlue(255 - p.getBlue());  
      }
    }
  }

  /*
   * Converts the image to grayscale.
   */
  public void convertToGrayscale() {
    Pixel[][] pixels = getPixelGrid();

    for (Pixel[] row : pixels) {
      for (Pixel p : row) {
        int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
        p.setRed(gray);
        p.setGreen(gray);
        p.setBlue(gray);
      }
    }
  }

  /*
   * Applies a pixelation effect to the image.
   */
  public void pixelate(int blockSize) {
    Pixel[][] pixels = getPixelGrid();

    for (int y = 0; y < pixels.length; y += blockSize) {
      for (int x = 0; x < pixels[0].length; x += blockSize) {
        int redSum = 0, greenSum = 0, blueSum = 0;

        // Define the boundaries of the block
        int endY = Math.min(y + blockSize, pixels.length);
        int endX = Math.min(x + blockSize, pixels[0].length);

        // Calculate the average color of the block
        for (int blockY = y; blockY < endY; blockY++) {
          for (int blockX = x; blockX < endX; blockX++) {
            redSum += pixels[blockY][blockX].getRed();
            greenSum += pixels[blockY][blockX].getGreen();
            blueSum += pixels[blockY][blockX].getBlue();
          }
        }

        int pixelsInBlock = (endY - y) * (endX - x);
        int avgRed = redSum / pixelsInBlock;
        int avgGreen = greenSum / pixelsInBlock;
        int avgBlue = blueSum / pixelsInBlock;

        // Apply the average color to all pixels in the block
        for (int blockY = y; blockY < endY; blockY++) {
          for (int blockX = x; blockX < endX; blockX++) {
            pixels[blockY][blockX].setRed(avgRed);
            pixels[blockY][blockX].setGreen(avgGreen);
            pixels[blockY][blockX].setBlue(avgBlue);
          }
        }
      }
    }
  }

  /*
   * Adjusts the contrast of the image.
   */
  public void adjustContrast(int factor) {
    Pixel[][] pixels = getPixelGrid();

    for (Pixel[] row : pixels) {
      for (Pixel p : row) {
        int newRed = p.getRed() * factor;
        int newGreen = p.getGreen() * factor;
        int newBlue = p.getBlue() * factor;

        // Ensure values are within the range 0-255
        p.setRed(Math.min(255, newRed));
        p.setGreen(Math.min(255, newGreen));
        p.setBlue(Math.min(255, newBlue));
      }
    }
  }
  
  /*
   * Applies a sepia filter to the image.
   */
  public void applySepia() {
    Pixel[][] pixels = getPixelGrid();

    for (Pixel[] row : pixels) {
      for (Pixel p : row) {
        int red = (int) (p.getRed() * 0.393 + p.getGreen() * 0.769 + p.getBlue() * 0.189);
        int green = (int) (p.getRed() * 0.349 + p.getGreen() * 0.686 + p.getBlue() * 0.168);
        int blue = (int) (p.getRed() * 0.272 + p.getGreen() * 0.534 + p.getBlue() * 0.131);

        // Ensure values are within the range 0-255
        red = Math.min(255, red);
        green = Math.min(255, green);
        blue = Math.min(255, blue);

        p.setRed(red);
        p.setGreen(green);
        p.setBlue(blue);
      }
    }
  }
}
