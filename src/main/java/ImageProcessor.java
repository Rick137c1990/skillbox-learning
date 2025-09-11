import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageProcessor implements Runnable{
    private final File[] files;
    private final int startIdx;
    private final int endIdx;
    private final String dstFolder;

    public ImageProcessor(File[] files, int startIdx, int endIdx, String dstFolder) {
        this.files = files;
        this.startIdx = startIdx;
        this.endIdx = endIdx;
        this.dstFolder = dstFolder;
    }

    @Override
    public void run() {
        for (int i = startIdx; i < endIdx; i++) {
            try {
                BufferedImage image = ImageIO.read(files[i]);
                if (image == null) {
                    continue;
                }

                int newWidth = 300;
                int newHeight = (int) Math.round(
                        image.getHeight() / (image.getWidth() / (double) newWidth)
                );

                BufferedImage newImage = Scalr.resize(image, Scalr.Method.QUALITY, newWidth, newHeight);

                File newFile = new File(dstFolder + "/" + files[i].getName());
                ImageIO.write(newImage, "jpg", newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
