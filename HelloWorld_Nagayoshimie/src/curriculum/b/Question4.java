package curriculum.b;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// --- Question 1 ---
        
        int[] scores = {1, 2, 3, 4, 5};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        // --- Question 2 ---
        
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        // --- Question 3 ---
        
        int[] scores1 = {3, 5, 7, 9, 1};
        int sum = 0;
        for (int i = 0; i < scores1.length; i++) {
            sum += scores1[i];
        }
        System.out.println("合計値: " + sum);

        // --- Question 4 ---
        
        int[] numbers1 = {12, 7, 9, 21, 5, 18};
        int max = numbers1[0];
        int min = numbers1[0];
        for (int i = 1; i < numbers1.length; i++) {
            if (numbers1[i] > max) {
                max = numbers1[i];
            }
            if (numbers1[i] < min) {
                min = numbers1[i];
            }
        }
        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);

        // --- Question 5 ---
        
        int[] scores2 = {1, 2, 3, 4, 5};
        for (int i1 = 0; i1 < scores2.length; i1++) {
            scores2[i1] = scores2[i1] * 2;
        }
        for (int num1 : scores2) {
            System.out.println(num1);
        }

        // --- Question 6 ---
        
        int[] numbers2 = {4, 7, 10, 15, 20};
        Scanner scanner = new Scanner(System.in);
        System.out.print("数値を入力してください: ");
        int input = scanner.nextInt();
        boolean found = false;
        for (int num : numbers2) {
            if (num == input) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(input + "は配列に含まれています");
        } else {
            System.out.println(input + "は配列に含まれていません");
        }
        scanner.close();

        // --- Question 7 ---
        
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int k = 0; k < array.length; k++) {
            for (int j = 0; j < array[k].length; j++) {
                System.out.println(array[k][j]);
            }
        }
       //Question8
        int[][] array1 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int sum1 = 0;
        for (int[] row : array1) {
            for (int num : row) {
                sum1 += num;
            }
        }

        System.out.println("合計値: " + sum1);
        
        //Question9
        int[][] array2 = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
        int max2 = array2[0][0];
        int min2 = array2[0][0];

        for (int[] row : array2) {
            for (int num : row) {
                if (num > max2) {
                    max2 = num;
                }
                if (num < min2) {
                    min2 = num;
                }
            }
        }

        System.out.println("最大値: " + max2);
        System.out.println("最小値: " + min2);
        
        //Question10
        int[][][] array3= {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        for (int[][] matrix : array3) {
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.println(num);
                }
            }
        }
    }
}
