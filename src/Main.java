import common.input.Input;

import static common.input.Input.inputInt;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
        System.out.println("진료 예약 프로그램입니다!!");

        while (true){
            System.out.println("로그인 하시려면 1번을 입력하세요.");
            System.out.println("계정 생성 하시려면 2번을 입력하세요.");
            int num = inputInt();
            System.out.println(num);
            break;
        }
    }
}
