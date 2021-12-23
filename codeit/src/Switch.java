public class Switch {
    public static void main(String[] args){
        int scoreIf = 97;
        String gradeIf;


        // if 문으로 출력하기
        if (scoreIf >= 100){
            gradeIf="A+";
            System.out.println(gradeIf);
        } else if (scoreIf >= 90){
            gradeIf="A";
            System.out.println(gradeIf);
        } else if (scoreIf >= 80){
            gradeIf="B";
            System.out.println(gradeIf);
        } else if (scoreIf >= 70){
            gradeIf="C";
            System.out.println(gradeIf);
        } else if (scoreIf >= 60){
            gradeIf="D";
            System.out.println(gradeIf);
        } else {
            gradeIf="F";
            System.out.println(gradeIf);
        }

        int scoreSwitch = 75;
        String gradeSwitch;

        // switch 문으로 출력하기
        switch (scoreSwitch / 10) {
            case 10: // switch 문에서 case 에 요구되는 자료형은 int 형입니다.
                gradeSwitch="A+";
                break;
            case 9:
                gradeSwitch="A";
                break;
            case 8:
                gradeSwitch="B";
                break;
            case 7:
                gradeSwitch="C";
                break;
            case 6:
                gradeSwitch="D";
                break;
            default :
                gradeSwitch="F";
                break;
        }

        System.out.println(gradeSwitch);
        // 여러 개의 동등한 조건의 나열에는 switch 문이 더 편리합니다.

        // switch 는 위에서 아래로의 순차 구조가 강한 특별한 명령어 입니다:)
        // 맨 마지막 default 뒤엔  break 가 없어도 switch 문은 끝이나게 됩니다
    }
}
