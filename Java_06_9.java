package TextBook;

import java.util.Arrays;

/**
 質問９︓メソッドの呼び出す練習。
1. 質問６-１を⽤い、２つ配列をマージします。
2. 質問８を⽤い、ステップ１のマージした配列をソートする。
3. 注意︓コードを１⾏にしてください
 */
public class Java_06_9 {

	public static void main(String[] args) {

		int[] lefts = new int[] { 1, 2, 3, 4, 99 };
		int[] rights = new int[] { 76, 6, 7, 8, 9 };
		Matome matome = new Matome(); 
		System.out.println(Arrays.toString(matome.bubbleSort(Java_06_6_1.megerArray(lefts, rights))));
		
		//System.out.print(Arrays.toString(matome.bubbleSort(Java_06_6_1.megerArray(lefts, rights))));
		

	}

}
