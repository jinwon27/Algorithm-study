// 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12922
// 제목 : 수박수박수박수박수박수?

package programmers;

public class Watermelon {
	
	class Solution {
		  public String solution(int n) {
		    String answer = "";
		 
		    for(int i=1; i<=n; i++) {
		    	answer += i%2!=0 ? "수" : "박";
		    }
		 
		    return answer;
		  }
		}
	
}
