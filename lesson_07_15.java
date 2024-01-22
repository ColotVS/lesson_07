public class lesson_07_15 {
    //Ключевое слово static
    //Ключевое слово static превращает метод в статический.

    //Факт 1. Статический метод не привязан ни к какому объекту, но относится к классу, в котором объявлен.
    //Чтобы вызвать статический метод, нужно написать:
    //ИмяКласса.имяМетода()

    //Примеры статических методов:
    //Thread.sleep();
    //Math.abs();
    //Arrays.sort();

    //Имя класса перед именем статического метода можно не писать, если вы вызываете статический метод изнутри — из того же класса.
    //Именно поэтому вам не нужно каждый раз писать Solution перед именами вызываемых статических методов.

    //Факт 2. Статический метод не может обращаться к нестатическим методам его же класса.
    //Статический метод может обращаться только к статическим методам.
    //Поэтому все методы, которые мы хотим вызвать из метода main, мы объявляем статическими.

    //Данная программа должна выводить информацию о созданном массиве.
    //Но из-за неправильно расставленных модификаторов static она не компилируется.
    //Исправь эти ошибки. Добавь модификатор static там, где это необходимо.
    public static void main(String[] args) {
        int[] array = {123, 7, -14, 67, 16, 98, 75, 576};
        System.out.println("В массиве: ");
        printArray(array);
        System.out.println("Минимальное число: " + getMinValue(array));
        System.out.println("Максимальное число: " + getMaxValue(array));

    }

    public static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
