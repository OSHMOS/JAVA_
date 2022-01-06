public class Variable {
    public static void main(String[] args){
        int inum;
        String Str;
        long lnum = 123L; // 소문자 l은 1과 헷갈릴 위험이 있으니 대문자 L을 쓰는 것을 권장합니다.
        double dnum = 3.0;
        float fnum = 3.0f; // 1이랑 헷갈릴 위험이 없으니 소문자로 써도 됩니다.

        inum = 25;
        Str = "OSHMOS";

        System.out.print("age: " + inum + ", ");
        System.out.println("name: " + Str);
        System.out.println(lnum);
        System.out.println(dnum);
        System.out.println(fnum);
    }
}
