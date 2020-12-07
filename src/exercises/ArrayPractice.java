package exercises;

public class ArrayPractice {
    public static void main(String[] args){

        int[] newArr = {1, 1, 2, 3, 5, 8};
        for (int oneInt : newArr) {
            System.out.println(oneInt);
        }

        for (int i = 1; i <= newArr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }



    }
}
