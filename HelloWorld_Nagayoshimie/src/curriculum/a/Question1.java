package curriculum.a;

public class Question1 {
	public static void main(String[] args) {ln
	byteNum = 10;    // 値（初期値）を代入
	short shortNum = 0;  // short型の変数 shortNum を宣言
	shortNum=100;
	int intNum=0;       // int型の変数 intNum を宣言
	intNum=1000;
	long longNum=0;     // long型の変数 longNum を宣言
	longNum=10000;
	float floatNum=0.0f; // float型の変数 floatNum を宣言
	floatNum=9.5f;
	double doubleNum=0.0; // double型の変数 doubleNum を宣言
	doubleNum=10.5;
	char letter=' ';      // char型の変数 letter を宣言
	letter='a';
	String letters=" ";   // String型の変数 letters を宣言
	letters="ハロー";
	boolean isBoolean=false; // boolean型の変数 isBoolean を宣言
	isBoolean=true;
	
	
	
	// 追加：各変数の中身を表示する
    System.out.println(byteNum);
    System.out.println(shortNum);
    System.out.println(intNum);
    System.out.println(longNum);
    System.out.println(floatNum);
    System.out.println(doubleNum);
    System.out.println(letter);
    System.out.println(letters);
    System.out.println(isBoolean);
    
 //  ここから QuestionQ3 の回答
    System.out.println(byteNum + shortNum + intNum + longNum); // 11110を出力 (10 + 100 + 1000 + 10000)
    System.out.println(byteNum + byteNum);// 20を出力 (10 + 10)
    System.out.println(letter + letters + isBoolean);//a ハロー trueを出力
    System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);// 11130を出力 (すべての数字を足す)
	System.out.println(doubleNum / 100); //0.105を出力（0.5/100）
	System.out.println(byteNum - shortNum); //-90を出力(90-100)
	
	//ここからQuestion4の回答
	String name = "山田太郎";    //string型変数 name宣言
	System.out.println("こんにちは、" + name + "さん！");
	
	//ここからQuestion5の回答
	int age = 25;
	System.out.println("年齢：" + age + "歳");
	
	//ここからQuestiom6の回答
	int num1=10;
	int num2=5;
	
	int sum= num1 + num2;
	System.out.println(sum);
	
	//ここからQuestion7の回答
	int score=80;
	score= 20 + score;
	System.out.println("最終スコア：" + score);
	}
	}
