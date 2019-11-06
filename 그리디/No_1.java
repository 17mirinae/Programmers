package �׸���;

class No_1 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		// n = ��ü �л��� ��
		// lost = ü������ �Ҿ���� �л����� ��ȣ
		// reserve = ������ ü������ ������ �л����� ��ȣ

		int[] clothes = new int[n];
		for (int i = 0; i < clothes.length; i++) {
			clothes[i] = 1;
		}

		for (int i : reserve) {
			clothes[i - 1] += 1;
		}

		for (int i : lost) {
			clothes[i - 1] -= 1;
		}

		if (clothes[0] == 0 && clothes[1] == 2) {
			clothes[0] = 1;
			clothes[1] = 1;
		}

		if (clothes[n - 1] == 0 && clothes[n - 2] == 2) {
			clothes[n - 1] = 1;
			clothes[n - 2] = 1;
		}

		for (int i = 1; i < clothes.length - 1; i++) {
			if (clothes[i] == 0 && clothes[i - 1] == 2) {
				clothes[i] = 1;
				clothes[i - 1] = 1;
			} else if (clothes[i] == 0 && clothes[i + 1] == 2) {
				clothes[i] = 1;
				clothes[i + 1] = 1;
			}
		}

		for (int i = 0; i < clothes.length; i++) {
			if (clothes[i] >= 1) {
				answer++;
			}
		}

		return answer;
	}
}