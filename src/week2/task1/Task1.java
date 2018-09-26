package week2.task1;

import java.util.Scanner;
import java.io.PrintStream;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO 1A: Tính ước chung lớn nhất của 2 số a, b
		
		while (a != b) {
			if (a > b) {
				a = a - b;
			}
			else { //a < b
				b = b - a;
			}
		}
		
        return a;
    }

    public static int fibonacci(int n) {
        // TODO 1B: Tìm số fibonacci ở vị trí n        
		if (n == 0) {
                    return 0;
                }
                else if (n == 1 || n == 2) {
			return 1;
		}
		else {
			return fibonacci(n - 1) + fibonacci(n - 2);
                }
    }
}
