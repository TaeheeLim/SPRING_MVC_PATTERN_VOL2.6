package hello.upload.controller;

import java.util.Arrays;

public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};

        System.out.println(solution(seoul));
    }

    public static String solution(String[] seoul){
        int temp = 0;
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                temp = i;
                break;
            }
        }
        return findLocation(temp);
    }

    public static String findLocation(int index){
        return "김서방은 " + index + "에 있다.";
    }
}
