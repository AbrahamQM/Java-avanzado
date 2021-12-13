// Creditos: https://refactoring.guru/es/design-patterns/facade/java/example#example-0

package FachadaOFarcade;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        else {  //Aqui habría que hacer un if similar al de VideoConversionFacade(Lin20 a 25)
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}