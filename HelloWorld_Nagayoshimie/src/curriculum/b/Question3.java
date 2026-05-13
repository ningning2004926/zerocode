package curriculum.b;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        //Question1
		for (int i = 1; i <= 10; i++) {   
			   if (i == 10) {    
			  }  
			   System.out.println(i);  
			  }
		//Question2
		for (int i = 2; i <= 20; i += 2) {
		    System.out.println(i);
		}
		//Question3
		for (int i = 10; i >= 1; i--) {   
			   
			   System.out.println(i);
		}
		//Question4
			   int sum = 0;
			   for (int j = 1; j <= 100; j++) {
			       sum += j;
			   }
			   System.out.println(sum);
			   
			 //Question5
			   for (int i = 1; i <= 5; i++) {
				    for (int j = 1; j <= i; j++) {
				        System.out.print("*");
				    }
				    System.out.println();
				}
			 //Question6
			   int count = 1; // カウンター変数を初期化
			   while (count <= 5) { // count が 5 以下の間ループ
			    System.out.println(+ count);
			    count++; // count を1ずつ増やす
			   }
			 //Question7
			   int i=2;
			   while(i<=20) {
			   System.out.println(i);
			   i+=2;
			   }
			 //Question8
			   int countdown=10;
			   while(countdown>=1) {
			   System.out.println(countdown);
			   countdown-=1;
			   }
			   //Question9
			   int total=1;
			    sum=0;
			   while(total<=100) {
				   sum+=total;
				   total++;
			   }
			   System.out.println(sum);
			   //Question10
			   Scanner sc = new Scanner(System.in);
			   System.out.print("数値を入力してください: ");
		        int input = sc.nextInt();
		        while (input != 0) {
		        System.out.print("数値を入力してください: ");
		        input = sc.nextInt();
		        }
		        System.out.println("終了しました");
		        sc.close();
		        
		        //Question11
		        for (int j = 1; j <= 9; j++) {
		        for (int k = 1; k <= 9; k++) {
		        System.out.printf("%02d * %02d = %02d", j, k, j * k);
		        if (k < 9) {
		            System.out.print(" || ");
		        }
		        }
		        System.out.println();
		        }        
	}
		        }   
	     


