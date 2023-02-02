package array;

public class MyArray implements MyArrayUtil{
    @Override
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        int sum = 0;
        for(int i = 0; i < arr1.length; i++){
            sum = sum + arr1[i];
        }
        for (int i = 0; i <arr2.length; i++){
            sum = sum + arr2[i];
        }
        return sum / (arr1.length + arr2.length);
    }

    @Override
    public boolean isEvenArray(int[] array) {
        boolean a = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                a = false;
            }
        }
    return a;
    }
}
