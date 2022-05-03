package hello.upload.controller;

public class 수박 {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        System.out.println(solution(n2));
    }

    public static String solution(int n){
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                builder.append("수");
            } else {
                builder.append("박");
            }
        }
        return builder.toString();
    }
}
