// 문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/17682?language=java

package programmers;

public class DartGame {
	public int solution(String dartResult) {
	      int answer = 0;
	      int len = dartResult.length();
	        int lenPos = 0;
	        int scoreIdx = 0;
	        int step = 1;
	        int[] scores = new int[] {-1, -1, -1};
	        while(lenPos < len) {
	            String target = dartResult.substring(lenPos, lenPos + 1);
	            System.out.println("target :" + target);
	            if(step == 1) {
	                System.out.println("step :" + step);
	                try {
	                    int score = Integer.valueOf(target);
	                    if(score == 0 && scores[scoreIdx] != -1) {
	                        score = 10;
	                    }
	                    scores[scoreIdx] = score;
	                    lenPos++;
	                } catch (Exception e) {
	                    step = 2;
	                }
	            }else if(step == 2) {
	                System.out.println("step :" + step);
	                if("S".equalsIgnoreCase(target)) {
	                    lenPos++;
	                }else if("D".equalsIgnoreCase(target)) {
	                    scores[scoreIdx] = scores[scoreIdx] * scores[scoreIdx];
	                    lenPos++;
	                }else if("T".equalsIgnoreCase(target)) {
	                    scores[scoreIdx] = scores[scoreIdx] * scores[scoreIdx] * scores[scoreIdx];
	                    lenPos++;
	                }else {
	                    System.out.println("잘못된 값이에요.");
	                    return 0;
	                }
	                step = 3;
	            }else if(step == 3) {
	                System.out.println("step :" + step);
	                if("*".equals(target)) {
	                    if(scoreIdx != 0) {
	                        scores[scoreIdx-1] = scores[scoreIdx-1] * 2;
	                    }
	                    scores[scoreIdx] = scores[scoreIdx] * 2;
	                    lenPos++;
	                }else if("#".equals(target)) {
	                    scores[scoreIdx] = scores[scoreIdx] * -1;
	                    lenPos++;
	                }
	                step = 1;
	                scoreIdx++;
	            }
	        }
	        int sum = 0;
	        for(int temp : scores) {
	            sum += temp;
	        }
	      answer = sum;
	        System.out.println("totalScore :" + sum);
	      return answer;
	  }
}
