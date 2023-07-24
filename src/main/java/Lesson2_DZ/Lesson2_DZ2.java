package Lesson2_DZ;
//Если необходимо, исправьте данный код
//(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
//Задание 2
//        try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }

public class Lesson2_DZ2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,45};
        Task2(array);
    }

private static void Task2(int[] intArray){
    try {
        int d = 0;
//        double catchedRes1 =(double) intArray[1] / d;
        double catchedRes1 = intArray[9] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Catching exception: " + e);
    }
}

}
