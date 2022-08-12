package programmers;

public class NewID {
	public String solution(String new_id) {
        String id = new_id.toLowerCase(); // 소문자
        id = id.replaceAll("[^-_.a-z0-9]",""); //-_. = 영문자 숫자만 남기기
        id = id.replaceAll("[.]{2,}", "."); // . 2개 이상 .으로
        id = id.replaceAll("^[.]|[.]$", ""); // 처음과 끝 제거
        
        if(id.equals("")) // 만약 빈 문자일 경우 a 추가함
        	id += "a";
        
        if(id.length() >= 16) { // 16자 이상이면 15자로 나오기
        	id = id.substring(0, 15);
        	id = id.replaceAll("^[.]|[.]$", ""); // 끝 , 제거  	
        }
        if(id.length() <= 2) //2글자 이하라면 3글자까지 문자 추가하기
        	while(id.length() < 3)
        		id += id.charAt(id.length() -1);
        return id;
        
    }
}
