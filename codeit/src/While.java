public class While {
    public static void main(String[] args){
        int sum = 0, i = 1;

        while (sum < 10000){
            sum += i;
            i++;
        }

        System.out.println(sum);
        System.out.println(i - 1);
        // 마지막으로 while 이 실행될 때 i가 무의미하게 증가하기 때문이다.
    }
}
