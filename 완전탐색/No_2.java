package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class No_2 {
	public static void main(String arg[]) {
		// 조합으로 접근 combination(n,i,0) // 이때 n은 자리수이고, i는 조합하는 갯수 ex ) n=3, i=2라면 3C2
		String numbers;
		BufferedReader n = new BufferedReader(new InputStreamReader(System.in)); // 입력을 받기

		try {
			numbers = n.readLine(); // 문자열 17
			LinkedList<Integer> list = new LinkedList<>();
			ArrayList<int[]> arrList = new ArrayList<int[]>();

			for (int j = 0; j < numbers.length(); j++) { // 단어의 형태소로 쪼개기
				list.add(Integer.parseInt(String.valueOf(numbers.charAt(j))));
			}

			for (int i = 0; i < numbers.length(); i++) {
				arrList.add(reCombination(list, numbers.length(), i, 0));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static int[] reCombination(LinkedList<Integer> list, int n, int r, int index) {
		int cnt = 0; // 이따 지울꺼임
		if (r == 0) {
			for (int i : list) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		list.add(index);
		reCombination(list, n, r - 1, index);
		list.removeLast();
		reCombination(list, n, r, index + 1);

		int[] arr = new int[cnt]; // cnt는 nCr

		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}

		return arr;
		// 여기서 배열로 넣어주긴 하잖아...
		// 이제 조합을 해야 되는 거 같은데...
		// 캬하!!
	}

}
