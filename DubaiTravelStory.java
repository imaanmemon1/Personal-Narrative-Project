import org.code.theater.*;
import org.code.media.*;

public class DubaiTravelStory {

  public static void main(String[] args) {

    /*
     * Name of the place in Dubai, date, average time spent.
     */
    String[][] locations = {
      {"Burj Khalifa", "Dubai Marina", "Palm Jumeirah", 
       "Dubai Mall", "Desert Safari", "Atlantis", "Atmosphere", 
       "Global Village", "La Mer Beach", "Ossiano"},
      {"2023-01-15", "2023-02-10", "2023-03-05", "2023-04-20", 
       "2023-05-12", "2023-06-18", "2023-07-25", "2023-08-10", 
       "2023-09-15", "2023-10-05"},
      {"5", "3", "6", "4", "2", "6", "5", "4", "3", "7"} 
    };

    // 2D array to store ratings for each location
    int[][] ratings = {
      {9, 8, 10, 7, 9, 10, 8, 9, 7, 9},
      {10, 9, 8, 7, 10, 9, 8, 10, 8, 9},
      {8, 7, 9, 8, 10, 9, 8, 9, 7, 9}
    };

    // Create a DataScene object
    DataScene dubaiScene = new DataScene(locations, ratings);

    // Draw the scene
    dubaiScene.drawScene();

    // Play the scene
    Theater.playScenes(dubaiScene);
  }
}
