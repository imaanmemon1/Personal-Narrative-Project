import org.code.theater.*;
import org.code.media.*;

class DestinationImage extends Image {
    private Pixel[][] imagePixels;
    
/*
* Constructor 
*/     public DestinationImage(String imageFile) {
        super(imageFile);
        imagePixels = getPixelsFromImage();
    }
    
/*
* method to retrieve pixels 
*/    public Pixel[][] getPixelsFromImage() {
        Pixel[][] tempPixels = new Pixel[getHeight()][getWidth()];
        
        for (int row = 0; row < tempPixels.length; row++) {
            for (int col = 0; col < tempPixels[0].length; col++) {
                tempPixels[row][col] = getPixel(col, row);
            }
        }
        
        return tempPixels;
    }

/*
* apply negative filter 
*/    public void applyNegative() {
        for (Pixel[] row : imagePixels) {
            for (Pixel pixel : row) {
                pixel.setRed(255 - pixel.getRed());
                pixel.setGreen(255 - pixel.getGreen());
                pixel.setBlue(255 - pixel.getBlue());
            }
        }
    }
    
/*
* apply motion blur 
*/    public void applyMotionBlur() {
        for (int row = 0; row < imagePixels.length; row++) {
            for (int col = 1; col < imagePixels[0].length; col++) {
                Pixel currentPixel = imagePixels[row][col];
                Pixel prevPixel = imagePixels[row][col - 1];
                
                currentPixel.setRed((currentPixel.getRed() + prevPixel.getRed()) / 2);
                currentPixel.setGreen((currentPixel.getGreen() + prevPixel.getGreen()) / 2);
                currentPixel.setBlue((currentPixel.getBlue() + prevPixel.getBlue()) / 2);
            }
        }
    }

/*
* apply vertical filter 
*/    public void mirrorVertical() {
        for (int row = 0; row < imagePixels.length; row++) {
            for (int col = 0; col < imagePixels[row].length / 2; col++) {
                int rightCol = imagePixels[row].length - 1 - col;
                
                // Get the left and right pixel
                Pixel leftPixel = imagePixels[row][col];
                Pixel rightPixel = imagePixels[row][rightCol];

                // Swap the pixel colors 
                Color leftColor = leftPixel.getColor();
                Color rightColor = rightPixel.getColor();
                
                leftPixel.setColor(rightColor);
                //rightPixel.setColor(leftColor);
            }
        }
    }
    
/*
* apply threshold filter 
*/    public void applyThreshold(int threshold) {
        for (Pixel[] row : imagePixels) {
            for (Pixel pixel : row) {
                int brightness = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
                if (brightness < threshold) {
                    pixel.setRed(0);
                    pixel.setGreen(0);
                    pixel.setBlue(0);
                } else {
                    pixel.setRed(255);
                    pixel.setGreen(255);
                    pixel.setBlue(255);
                }
            }
        }
    }

    // Apply custom filter (mirror vertical + motion blu)
    public void applyCustomFilter() {
        this.mirrorVertical();
        this.applyMotionBlur();
    }
}
