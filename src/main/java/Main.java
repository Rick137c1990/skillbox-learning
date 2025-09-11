
import java.io.File;

public class Main {

    public static void main(String[] args) {
        String srcFolder = "ImageResizer/Files/picture";
        String dstFolder = "ImageResizer/Files/thumbnail_picture";

        File srcDir = new File(srcFolder);
        File[] files = srcDir.listFiles();

        if (files == null) {
            System.out.println("Directory is empty or does not exist.");
            return;
        }

        int numCores = Runtime.getRuntime().availableProcessors();
        int filesPerThread = (int) Math.ceil((double) files.length / numCores);

        Thread[] threads = new Thread[numCores];

        long start = System.currentTimeMillis();

        for (int i = 0; i < numCores; i++) {
            int startIdx = i * filesPerThread;
            int endIdx = Math.min(startIdx + filesPerThread, files.length);

            threads[i] = new Thread(new ImageProcessor(files, startIdx, endIdx, dstFolder));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Duration: " + (System.currentTimeMillis() - start));
    }
}


