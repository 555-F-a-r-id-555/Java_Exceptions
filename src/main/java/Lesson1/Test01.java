package Lesson1;

public class Test01 {
    public static void main(String[] args) {
        int x = 0;
        if(x > 0 ){
            System.out.println("x>0");
        }else {
            RuntimeException error = new RuntimeException("X<=0");
            System.err.println(error.toString());
            System.err.println(error.getMessage());
            System.err.println(error.getCause());
            error.printStackTrace(System.out);
        }
    }
}
