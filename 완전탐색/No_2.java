package ����Ž��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class No_2 {
	public static void main(String arg[]) {
		// �������� ���� combination(n,i,0) // �̶� n�� �ڸ����̰�, i�� �����ϴ� ���� ex ) n=3, i=2��� 3C2
		String numbers;
		BufferedReader n = new BufferedReader(new InputStreamReader(System.in)); // �Է��� �ޱ�

		try {
			numbers = n.readLine(); // ���ڿ� 17
			LinkedList<Integer> list = new LinkedList<>();
			ArrayList<int[]> arrList = new ArrayList<int[]>();

			for (int j = 0; j < numbers.length(); j++) { // �ܾ��� ���¼ҷ� �ɰ���
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
		int cnt = 0; // �̵� ���ﲨ��
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

		int[] arr = new int[cnt]; // cnt�� nCr

		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}

		return arr;
		// ���⼭ �迭�� �־��ֱ� ���ݾ�...
		// ���� ������ �ؾ� �Ǵ� �� ������...
		// ļ��!!
	}

}
