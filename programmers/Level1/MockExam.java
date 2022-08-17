package programmers;

import java.util.ArrayList;

public class MockExam {
	public int[] solution(int[] answers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //수포자 3명의 반복 패턴 5, 8, 10개씩
        int[] a = {1,2,3,4,5}; 
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        int answer1=0, answer2 =0, answer3 =0;
        
        for(int i = 0; i<answers.length; i++) {
        	if(a[i%a.length] == answers[i]) answer1++;
        	if(b[i%b.length] == answers[i]) answer2++;
        	if(c[i%c.length] == answers[i]) answer3++;
        }
        
        // 최대값 구하기
        int max = Math.max(Math.max(answer1, answer2),answer3);
        
        //최대값이랑 같을 경우 추가
        if(max == answer1) list.add(1); 
        if(max == answer2) list.add(2); 
        if(max == answer3) list.add(3); 
        
        answer = new int[list.size()];
        
        for(int i = 0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
	}
}
