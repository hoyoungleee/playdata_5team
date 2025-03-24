package common.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    //정수형 입력받기
    public static int inputInt(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(">>>> ");
        int num = -1;// 입력예외로 인하여 입력값으로 재할당 되지않으면 -1 그대로 리턴. 호출부에서 -1 받으면 오류로 판단.
        try {
            String str = br.readLine();
            num = Integer.parseInt(str);
            br.close();
        } catch (IOException e) {
            System.out.println("올바른 숫자 값을 입력해주세요.");
        }
        return num;
    }

    //문자열 입력받기
    public static String inputString(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(">>>> ");
        String str = "";// 입력예외로 인하여 입력값으로 재할당 되지않으면 빈문자열 그대로 리턴. 호출부에서 빈문자열 받으면 오류로 판단.
        try {
            str = br.readLine();
            br.close();
        } catch (IOException e) {
            System.out.println("올바른 문자 값을 입력해주세요.");
        }
        return str;
    }
}
