package programmers;

public class LottoRank {
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int win = 0; // ���� ��ȣ
        int ukn = 0; // �� ���� ���� ��ȣ
        
        for(int i : lottos){
            if(i == 0){
                ukn++;
            }else{
                for(int j : win_nums){
                    if(i == j){
                        win++;
                        break; // �׸�
                    }
                }
            }
        }
        
        answer[0] = (win+ukn) > 1 ? 7-(win+ukn) : 6;
        answer[1] = win > 1 ? 7-win : 6;
        return answer;
    }
}
