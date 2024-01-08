public class Week4 {

    /**
     * Find max.
     */
    public static int max2Int(int a, int b) {
        return (a > b ? a : b);
    }

    /**
     * Find min.
     */
    public static int minArray(int[] arr) {
        int min = arr[0];
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Calculate BMI.
     */
    public static String calculateBMI(double weight, double height) {
        String result = "";
        double BMI = Math.round((weight / (height * height) * 10.0)) / 10.0;
        if (BMI <= 18.4) {
            result = "Thiếu cân";
        } else if (BMI >= 14.5 && BMI <= 22.9) {
            result = "Bình thường";
        } else if (BMI >= 23 && BMI <= 24.9) {
            result = "Thừa cân";
        } else if (BMI >= 25) {
            result = "Béo phì";
        }
        return result;
    }
}