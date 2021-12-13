// Creditos: https://refactoring.guru/es/design-patterns/facade/java/example#example-0

package FachadaOFarcade;

import java.io.File;

public class Main {
    public static void main(String []args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        System.out.println("---Convertir youtubevideo.ogg:");
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        System.out.println("\n---Convertir StarWars.MPEG4:");
        File oggVideo = converter.convertVideo("StarWars.MPEG4", "mpeg4");
        System.out.println("\n---Convertir VideoVacaciones.wmv:");
        File wmvVideo = converter.convertVideo("VideoVacaciones.wmv", "wmv");
    }
}
