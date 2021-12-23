public class Variable {
    public static void main(String[] args){
        int a;
        String s;
        long b = 123L; // 소문자 l은 1과 헷갈릴 위험이 있으니 대문자 L을 쓰는 것을 권장합니다.
        double c = 3.0;
        float d = 3.0f; // 1이랑 헷갈릴 위험이 없으니 소문자로 써도 됩니다.

        a = 25;
        s = "OSHMOS";

        System.out.print("age: " + a + ", ");
        System.out.println("name: " + s);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
