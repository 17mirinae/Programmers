package �׸���;

import java.util.Random;

public class No_3 {
	public static void main(String[] args) {
		System.out.println(solution("1924", 2));
	}
	
	public static String solution(String number, int k) {
        String answer = "";
        Random rand = new Random();
        
        char numToArr[] = number.toCharArray();
        char pickNumber[] = new char[k];
        int randNum;
        
        // k�� ������ŭ ���ڸ� ���� �Ѵ�. (���� ���ڴ� �� ����. �� �ٵ� ���� ���ڰ� ���� ���� �����?)
        for(int i = 0;i < k;i++) {
        	randNum = rand.nextInt(number.length()); // ���� ���ڸ� ����.
        	pickNumber[i] = number.charAt(randNum); // pickNumber�迭�� �ִ´�.
        	for(int j = 0;j < i;j++) {
        		if(j == randNum) { // �̹� ���� ���ڶ� ���� ���ڰ� �����ٸ� i--�� ���ְ� �ٽ� �ݺ�
        			i--;
        			break;
        		}
        	}
        }
        
        System.out.println("answer = " + answer);
        
        return answer;
    }
}
