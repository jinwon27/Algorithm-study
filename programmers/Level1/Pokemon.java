// √‚√≥ : https://school.programmers.co.kr/learn/courses/30/lessons/1845
package programmers;

import java.util.*;

public class Pokemon {
	public int solution(int[] nums) {
        int answer = 0;
        int pickNums = nums.length / 2;			
        
        Set<Integer> set = new HashSet<Integer>();

        for(int num : nums) {
            set.add(num);
        }
		
        if(pickNums < set.size()) {
            answer = pickNums;
        }else {
            answer = set.size();
        }
        return answer;
    }
}
