// Creditos: https://refactoring.guru/es/design-patterns/facade/java/example#example-0

package FachadaOFarcade;
/**
 * Esta es la fachada
 * Se encarga de esconder la complejidad de all lo que hay por debajo, para que en el Main no se vea el proceso
 *
 */

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new OggCompressionCodec();
        } else if (format.equals("mpeg4")){
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            System.out.println("Formato Ilegible");
            return null;
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}