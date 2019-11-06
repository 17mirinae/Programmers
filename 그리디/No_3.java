package 그리디;

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
        
        // k의 개수만큼 숫자를 골라야 한다. (같은 숫자는 안 고른다. 아 근데 같은 숫자가 여러 개면 어떡하지?)
        for(int i = 0;i < k;i++) {
        	randNum = rand.nextInt(number.length()); // 랜덤 숫자를 고른다.
        	pickNumber[i] = number.charAt(randNum); // pickNumber배열에 넣는다.
        	for(int j = 0;j < i;j++) {
        		if(j == randNum) { // 이미 뽑힌 숫자랑 같은 숫자가 뽑혔다면 i--를 해주고 다시 반복
        			i--;
        			break;
        		}
        	}
        }
        
        System.out.println("answer = " + answer);
        
        return answer;
    }
}
