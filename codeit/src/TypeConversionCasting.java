public class TypeConversionCasting {
    public static void main(String[] args){
        double x = 3.14;
        double z = 314d; // 3.14일 줄 알았는데 314.0 이네,,
        int y = (int) x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        int a = 9;
        int b = 5;
        System.out.println((double) a / b);
        // System.out.println((string / String) b);
        // int형은 String으로 형변환이 되지 않는다.
        // double로 형변환해서 정수형끼리 나눗셈했지만 결과는 소수형이 나옵니다.
    }
}
