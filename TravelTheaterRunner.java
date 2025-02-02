import org.code.theater.*;
import org.code.media.*;

public class TravelTheaterRunner {
    public static void main(String[] args) {
/*
* 2d array 
*/        String[][] travelLocations = {
            {"Places I visited in Dubai", "Atlantis, The Palm"},
            {"Desert Safari", "Global Village"}
        };

/*
* 2d array fro images 
*/        DestinationImage[][] travelImages = {
            {new DestinationImage("dubai-image.png"), new DestinationImage("atlantis.jpg")},
            {new DestinationImage("desertsafari.png"), new DestinationImage("globalvillage.jpg")}
        };

        // Scene instance
        Scene scene = new Scene();

      /*
*  Loop through the arrays to display images and apply effects
*/
        for (int row = 0; row < travelImages.length; row++) {
            for (int col = 0; col < travelImages[row].length; col++) {
                DestinationImage currentImage = travelImages[row][col];
                String locationName = travelLocations[row][col];

                // Display the image and text
                scene.drawImage(currentImage, 10, 10, currentImage.getWidth());
                scene.drawText(locationName, 100, 50);
                scene.pause(1);

                // Apply different effects based on index or string content
                if (locationName.contains("Dubai")) {
                    currentImage.applyNegative();
                } else if (locationName.equals("Atlantis, The Palm")) {
                    currentImage.applyMotionBlur();
                } else if (locationName.toLowerCase().contains("safari")) {
                    currentImage.mirrorVertical();
                } else if (locationName.contains("Global Village")) {
                    currentImage.applyThreshold(100);
                }

                // Redraw the modified image
                scene.drawImage(currentImage, 10, 10, currentImage.getWidth());
                scene.drawText(locationName, 100, 50);
                scene.pause(1);
            }
        }

/*
* create and draw narrative scene 
*/        NarrativeScene narrative = new NarrativeScene(scene);
        narrative.drawPartOfScene(); 

/*
* play the scenes in the theater  
*/        Theater.playScenes(scene);
    }
}

