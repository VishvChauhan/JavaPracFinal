package E_DesignPattern.DesignPatterns;

public class FactoryM {

    public static void main(String[] args) {

        //creating instance variable of DecodedImage class;
        DecodedImage decodedImage;
        //creating instance variable of ImageReader interface;
        ImageReader imageReader = null;

        String image = "Hello";

        // creating insatance object via interface
        if (image == "jpeg") {
            imageReader = new JpegReader(image);
        } else if (image == "gif") {
            imageReader = new GifReader(image);
        }

        // Asserting instance object
        assert imageReader != null;

        // Calling method via interface and storing in base classes
       decodedImage = imageReader.getDecodeImage();
        System.out.println(decodedImage);

    }
}


interface ImageReader{
    DecodedImage getDecodeImage();
}

class DecodedImage{
    private String Image;

    // constructor
    public DecodedImage(String image) {
        Image = image;
    }

    @Override
    public String toString() {
        return "DecodedImage{" +
                "Image='" + Image + '\'' +
                '}';
    }
}


class GifReader  implements ImageReader{
    private DecodedImage decodedImage;
    // constructor
    public GifReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}


class JpegReader implements ImageReader{
    private DecodedImage dImage;
    // constructor
    public JpegReader(String Image) {
        this.dImage = new DecodedImage(Image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return dImage;
    }
}