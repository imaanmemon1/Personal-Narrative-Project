# Unit 4 - Personal Narrative

## Introduction

Images are often used to portray our personal experiences and interests. We also use image filters and effects to change or enhance the mood of an image. When combined into collages and presentations, these images tell a story about who we are and what is important to us. Your goal is to create a personal narrative using The Theater that consists of images of your personal experiences and/or interests, incorporates data related to these experiences and/or interests that can be organized in a 2D array, and uses image filters and effects to change or enhance the mood of your images.

## Requirements

Use your knowledge of object-oriented programming, two-dimensional (2D) arrays, and algorithms to create your personal narrative collage or animation:

- **Create at least two 2D arrays** – Create at least two 2D arrays to store the data that will make up your visualization.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and two-way or multi-selection statements with compound Boolean expressions to analyze the data.
- **Use Image Filters** - Include multiple image filters learned from this unit, and additionally create new ones of your own.
- **Use methods in the String class** – Use one or more methods in the String class in your program, such as to determine whether the name of an image file contains specific characters.
- **Create a visualization** – Create an image or animation that conveys the story of the data by illustrating the patterns or relationships in the data.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

![Copy of Unit 5 - UML Diagram](https://github.com/user-attachments/assets/5b8d3dba-e773-4185-86fb-d4b9cd7fce23)

## Video

Record a short video of your story to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown


https://github.com/user-attachments/assets/7c976817-b9e5-41b0-9af9-a492464227ff


## Story Description

Write a description of the story that your animation showcases. Give addional context for your story here in the case your animation is more abstract and only has images and little text. Lastly, include what data in your project is represented in 2D arrays and how those directly relate to the story your animation showcase.
This animation tells the story of my travels, particularly focusing on my experiences in Dubai. The animation starts by showcasing different locations that I visited in Dubai, such as the Burj Khalifa, Atlantis The Palm, Desert Safari, and Global Village. Each location is displayed with relevant image filters applied, which help convey the mood and significance of each place. For instance, the Burj Khalifa is depicted with a custom filter to emphasize its towering and impressive nature. The Atlantis The Palm is shown with a motion blur effect to evoke a sense of excitement and movement. The Desert Safari is mirrored vertically to create the illusion of a desert landscape with the car, and the Global Village is given a threshold filter to add contrast and highlight the vibrant diversity of the place. These images are paired with text labels showing the names of the locations, and the animation also incorporates sound to enhance the atmosphere.

To organize this data, two 2D arrays are used in the program. The first array stores the names of the places visited, and the second array stores instances of DestinationImage objects, which represent the images associated with each place. These arrays are used to loop through the images and apply specific filters, ensuring that each location is displayed with its appropriate effect. This structure helps relate the images and their corresponding filters to the story of my travels, guiding the user through each location in a dynamic, visually engaging way.

## Image Filter Analysis

Choose at least 2 filters uses in your animation to explain how the pixels are modified. If you created a new image filter that was not one of the ones from this unit, make sure to explain and analyze that filter(s) before choosing ones that came from this unit.

In this project, I used several filters, both pre built and custom, to modify the appearance of the images and enhance the narrative. Two of the key filters I used are the motion blur filter and the threshold filter. The motion blur filter is applied to the image of Atlantis The Palm. This filter simulates movement by averaging the color values of adjacent pixels horizontally. This creates a blur effect that gives the impression of motion, which was important for conveying the excitement of being at Atlantis, especially since it is a popular vacation destination. The motion blur filter essentially smooths out the transitions between pixels, making it look like the image is in motion, which adds an energetic and dynamic element to the scene.
The threshold filter, on the other hand, is applied to the image of Global Village. This filter works by adjusting the brightness of each pixel: if the brightness is below a set threshold, the pixel turns black, and if it’s above the threshold, the pixel turns white. This effect creates a high contrast black and white image, which helps highlight the vivid lights and contrasts in the Global Village, making it appear more dramatic and vibrant. The threshold filter emphasizes the cultural diversity of Global Village by using stark contrasts to represent the bright lights and dynamic atmosphere of the place. 
