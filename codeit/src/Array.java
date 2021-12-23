public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[5]; // 선언과 동시에 크기가 5인 빈 배열 생성
        float[] floatArray = new float[3];
        // 자료형에 따라서 요소가 자료형에 맞게 저장됩니다.

        floatArray[0] = 4;
        floatArray[1] = 24;
        floatArray[2] = 56;

        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 5;
        intArray[3] = 7;
        intArray[4] = 11;

        // System.out.println(intArray); 배열 자체를 어떻게 출력하는지?
        System.out.println(intArray[2]);
        System.out.println(intArray[2] + intArray[4]);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        for (int i = 0; i < floatArray.length; i++) {
            System.out.println(floatArray[i]);
        }

        int[] arr1 = {1,2,3,4,5}; // 값의 이름은 arr1
        int[] arr2 = arr1; // 값의 또 다른 이름은 arr2
        arr1[0] = 100;
        System.out.println(arr2[0]);

        int[] arr3 = {1,2,3,4,5}; // 값의 이름은 arr3
        int[] arr4 = arr3.clone(); // 복사 값의 이름은 arr4
        arr3[0] = 100;
        System.out.println(arr3[0]);
        System.out.println(arr4[0]);

        for (int i : intArray) {
            System.out.println(i);
        }  // i는 intArray 요소가 차례대로 대입됩니다.

    }
}
