// ��ó : https://school.programmers.co.kr/learn/courses/30/lessons/12922
// ���� : ���ڼ��ڼ��ڼ��ڼ��ڼ�?

package programmers;

public class Watermelon {
	
	class Solution {
		  public String solution(int n) {
		    String answer = "";
		 
		    for(int i=1; i<=n; i++) {
		    	answer += i%2!=0 ? "��" : "��";
		    }
		 
		    return answer;
		  }
		}
	
}
