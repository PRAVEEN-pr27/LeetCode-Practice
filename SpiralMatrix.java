import java.util.*;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0)
            return result;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse from Left to Right
            for (int i = left; i <= right; i++)
                result.add(matrix[top][i]);
            top++;

            // Traverse from Top to Bottom
            for (int i = top; i <= bottom; i++)
                result.add(matrix[i][right]);
            right--;

            // Traverse from Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    result.add(matrix[bottom][i]);
                bottom--;
            }

            // Traverse from Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    result.add(matrix[i][left]);
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = spiralOrder(matrix);
        System.out.println("Spiral Order: " + result);
    }
}
