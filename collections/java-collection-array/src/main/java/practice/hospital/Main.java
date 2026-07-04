package practice.hospital;
public class Main {
    public static void main(String[] args) {

        float[] temperatureData = Hospital.generatePatientsTemperatures(30);
        for (int i = 0; i < temperatureData.length; i++) {
            System.out.println(temperatureData[i]);
        }
        System.out.println(Hospital.getReport(temperatureData));

    }
}
