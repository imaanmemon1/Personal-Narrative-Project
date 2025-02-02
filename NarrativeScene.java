import org.code.theater.*;
import org.code.media.*;

public class NarrativeScene {
    private Scene scene;
    
/*
* constructor
*/    public NarrativeScene(Scene scene) {
        this.scene = scene;
    }
    /*
*Method to draw a part of the narrative scene
*/
    public void drawPartOfScene() {
        // Clear the scene with a background color
        scene.clear(Color.BLACK);
        scene.setFillColor(Color.BLUE);
        scene.drawRectangle(0, 0, 800, 600);
        
/*
* burj khalifa image and draw scene
*/        DestinationImage burjKhalifa = new DestinationImage("burj.jpeg");
        scene.drawImage(burjKhalifa, 10, 10, burjKhalifa.getWidth());
        scene.pause(1);
/*
* apply the filter to the image
*/        burjKhalifa.applyCustomFilter();  

        // Draw the image and text
        scene.drawImage(burjKhalifa, 10, 10, burjKhalifa.getWidth());
        scene.drawText("Burj Khalifa", 100, 50);

/*
* play sound
*/        scene.playSound("airplane_chime_x.wav");

        // Pause before transitioning
        scene.pause(1);
    }
}
