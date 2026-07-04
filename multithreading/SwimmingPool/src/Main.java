public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;
        int volumeNow = 0;
        int time = 0;

        while (true) {
            if (volumeNow == 0 || volumeNow < volume) {
                volumeNow = volumeNow + fillingSpeed;
                volumeNow = volumeNow - devastationSpeed;
                time = time + 1;
            } else if (volumeNow == volume) {
                System.out.println("время наполнения бассейна составит: " + time + " мин.");
                break;
            }
        }
    }
}