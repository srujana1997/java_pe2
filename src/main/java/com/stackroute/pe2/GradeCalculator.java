package com.stackroute.pe2;
import java.util.Arrays;

    public class GradeCalculator {
        float average;
        int minimum;
        int maximum;
        public String calculateGrades(int number, int[] grades) {
            if (number != grades.length) {
                return "grades must be equal to number of students";
            }
            for (int grade : grades) {
                if (grade < 0 || grade > 100) {
                    return "grades must not be in between 0 and 100";
                }
            }

            this.average = Arrays.stream(grades).sum() / grades.length;
            Arrays.sort(grades);
            this.minimum = grades[0];
            this.maximum = grades[grades.length - 1];

            return average + "";
        }

        @Override
        public String toString() {
            return "GradeCalculator{" +
                    "average=" + average +
                    ", minimum=" + minimum +
                    ", maximum=" + maximum +
                    '}';
        }
    }

