//Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]  необходимо написать программу, которая выведет в консоль все чётные числа.
public class thirdTask {
    public static void main(String[] args) {
    int[] newArray = new int[10];
        newArray[0] = 1;
        newArray[1] = 2;
        newArray[2] = 3;
        newArray[3] = 4;
        newArray[4] = 5;
        newArray[5] = 6;
        newArray[6] = 7;
        newArray[7] = 8;
        newArray[8] = 9;
        newArray[9] = 10;
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i]%2==0){
            System.out.print(" " + newArray[i]);
        }
        }


    }
}
