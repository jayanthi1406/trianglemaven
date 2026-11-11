package com.example.trianglemaven;

public class Triangle {

    public static String classify(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0)
            return "Invalid";

        if (a + b <= c || a + c <= b || b + c <= a)
            return "Invalid";

        if (a == b && b == c)
            return "Equilateral";

        if (a == b || b == c || a == c)
            return "Isosceles";

        return "Scalene";
    }
}