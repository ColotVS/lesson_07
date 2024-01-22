public class lesson_07_06 {
    //Передача ссылок в методы
    public static void printArraySum(int[] data) //Метод printArraySum считает сумму чисел переданного массива и выводит ее на экран
    {
        int sum = 0;
        for (int i = 0; i < data.length; i++)
            sum = sum + data[i];
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30};
        printArraySum(months);
    }
}
