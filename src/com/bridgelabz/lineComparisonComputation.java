package com.bridgelabz;

public class lineComparisonComputation {

    static double x1 = 2;
    static double x2 = 4;
    static double y1 = 6;
    static double y2 = 12;
    static double x3 = 2;
    static double x4 = 4;
    static double y3 = 6;
    static double y4 = 10;
    String lengthOfLine2 = " ";
    String lengthOfLine1 = " ";

    public static void main(String[] args) {

        lineComparisonComputation method = new lineComparisonComputation();
        method.lengthCalculation(); // Call method to calculate lengths of two lines
        method.useEqualsMethod(); // Call method to check equality of lines
        method.useCompareToMethod(); // Call method to compare length
    }

    private void lengthCalculation() {
        //Use Math function to calculate length of line
        lengthOfLine1 = String.valueOf(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        lengthOfLine2 = String.valueOf(Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2)));
        System.out.println("Length Of Line1 = " + lengthOfLine1);
        System.out.println("Length Of Line2 = " + lengthOfLine2);
    }

    private void useEqualsMethod() {
        //Use Equals method to check equality of two lines
        if (lengthOfLine1.equals(lengthOfLine2)) {
            System.out.println("Length of two lines are equal");
        } else {
            System.out.println("Length of two lines are different");
        }
    }

    private void useCompareToMethod() {

        //Using compareTo method compare two lines
        double diff = (lengthOfLine1.compareTo(lengthOfLine2));
        System.out.println("Differance between two lines = " + diff);
    }
}

