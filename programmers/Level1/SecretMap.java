package programmers;

public class SecretMap {
	public String[] solution(int n, int[] b, int[] c) {
        String[] answer = new String[n];

        int [] a = new int[n];

        for (int i = 0 ; i < n ; i++) {
            a[i] = b[i] | c[i];
            answer[i] = Integer.toString(a[i], 2);

            while(answer[i].length() < n) {
                answer[i] = "0" + answer[i];
            }

            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");
            System.out.println(answer[i]);
        }

        return answer;
  }
}

