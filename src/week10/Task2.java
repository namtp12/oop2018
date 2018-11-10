package week10;

public class Task2 {
    //private static double[] array;
    
    public static void BubbleSort(double[] arr) {
        InitArray(arr);
        double tmp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        printArray(arr);
    }
    
    // The question is, the "reference" is outside the method
    // But the "new" operator is in the method
    // If control reaches end of function, is the array object still alive?
    private static void InitArray(double[] arr) {
        //arr = new double[1000]; // local variable, the above parameter is field variable
        for (int i = 0; i < 1000; i++) {
            arr[i] = Task2.getRandomValue();
        }
    }
    
    // To generate in a different range, change the param in the random statement
    private static double getRandomValue() {
        double x = Math.random() * 1000 + 0; // random() method generates a random double number in range [0, 1]
        return x;
    }
    
    private static void printArray(double[] arr) {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 100; j++) {
                System.out.print(arr[i * 100 + j] + " ");
            }
            System.out.print("\r\n"); //System.out.println();
        }
    } 
}
