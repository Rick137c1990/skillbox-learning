package practice.hospital;

public class Hospital {
    private static final float MIN_DIAPAZON = 32.00F;
    private static final float MAX_DIAPAZON = 40.00F;
    private static final float MAX_HEALTHY_TEMP = 36.2F;
    private static final float MIN_HEALTHY_TEMP = 36.9F;

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] allTemperature = new float[patientsCount];
        for (int i = 0; i < allTemperature.length; i++) {
            allTemperature[i] = (float) (Math.random() * (MAX_DIAPAZON - MIN_DIAPAZON)) + MIN_DIAPAZON;
            allTemperature[i] = allTemperature[i] * 100;
            int result = Math.round(allTemperature[i]);
            float result2 = (float) result / 100;
            allTemperature[i] = result2;
        }
        return allTemperature;
    }

    public static String getReport(float[] temperatureData) {
        float sumTemperature = 0.0F;
        for (float temp : temperatureData) {
            sumTemperature += temp;
        }
        float averageTemperature = sumTemperature / temperatureData.length;
        averageTemperature = averageTemperature * 100;
        int result = Math.round(averageTemperature);
        float roundedAverage = (float) result / 100;

        int numberOfHealthy = 0;
        for (float temp : temperatureData) {
            if (temp <= MIN_HEALTHY_TEMP && temp >= MAX_HEALTHY_TEMP) {
                numberOfHealthy++;
            }
        }

        String listTemperature = "";
        for (float temp : temperatureData) {
            listTemperature = listTemperature.concat(temp + " ");
        }

        return "Patient temperatures: " + listTemperature.trim() +
                "\nAverage temperature: " + roundedAverage +
                "\nNumber of healthy patients: " + numberOfHealthy;
    }
}


