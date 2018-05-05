package fanshetest;

public class TestInt {
    static int[] arr1 =new int[10];
    static int[] arr2= new int[30];

    public static void main(String[] args) {
        System.out.println(arr1.getClass().hashCode());
        System.out.println(arr2.getClass().hashCode());
    }
}
