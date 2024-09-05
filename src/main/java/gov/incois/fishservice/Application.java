package gov.incois.fishservice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        ImageService imageService = new ImageService();
        File file = new File("src/main/resources/img.jpeg");

        try {
            BufferedImage processedImage = imageService.processImage(file);
            // Use the processedImage as needed
            System.out.println("Image processed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}