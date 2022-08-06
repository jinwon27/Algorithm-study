// 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/42587
// 제목 : 프린터

package programmers;

import java.util.*;

public class Printer {
	class Solution {
		public int solution(int[] priorities, int location) {
			int answer = 0;
			Queue<Integer> queue = new LinkedList<>();

			for (int priority : priorities)
				queue.add(priority);

			while (true) {

				int first = queue.remove();
				location -= 1;

				boolean isFirstBig = true;

				for (int priority : queue) {
					if (first < priority) {
						isFirstBig = false;
						break;
					}
				}

				if (isFirstBig) {
					answer += 1;
				} else {
					queue.add(first);
					if (location == -1) {
						location += queue.size();
					}
				}
				if (location == -1)
					break;
			}
			return answer;
		}
	}
}
