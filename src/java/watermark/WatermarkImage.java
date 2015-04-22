package watermark;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class WatermarkImage {

    public void addImageWatermark(File watermarkImageFile, File sourceImageFile, File destImageFile, File desresize) {
        try {
            BufferedImage sourceImage = ImageIO.read(sourceImageFile);
            BufferedImage watermarkImage = ImageIO.read(watermarkImageFile);
            int type = sourceImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : sourceImage.getType();
            BufferedImage resizeImageJpg = resizeImage(sourceImage, type);

            // initializes necessary graphic properties
            Graphics2D g2d = (Graphics2D) sourceImage.getGraphics();
            AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f);
            g2d.setComposite(alphaChannel);

            // calculates the coordinate where the image is painted
            int topLeftX = (sourceImage.getWidth() - watermarkImage.getWidth()) / 2;
            int topLeftY = (sourceImage.getHeight() - watermarkImage.getHeight()) / 2;

            // paints the image watermark
            g2d.drawImage(watermarkImage, topLeftX, topLeftY, null);

            ImageIO.write(sourceImage, "jpg", destImageFile);
            ImageIO.write(resizeImageJpg, "jpg", desresize);
            g2d.dispose();

            System.out.println("The image watermark is added to the image.");

        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private static BufferedImage resizeImage(BufferedImage originalImage, int type) {
        if (originalImage.getWidth() < originalImage.getHeight()) {
            BufferedImage resizedImage = new BufferedImage(150, 200, type);
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(originalImage, 0, 0, 150, 200, null);
            g.dispose();

            return resizedImage;
        } else if (originalImage.getWidth() > originalImage.getHeight()) {
            BufferedImage resizedImage = new BufferedImage(200, 150, type);
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(originalImage, 0, 0, 200, 150, null);
            g.dispose();

            return resizedImage;
        } else {

            BufferedImage resizedImage = new BufferedImage(150, 150, type);
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(originalImage, 0, 0, 150, 150, null);
            g.dispose();

            return resizedImage;

        }

        

    }
}
