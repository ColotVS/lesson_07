public class lesson_07_03 {
        //Передача параметров в метод
        public static void printLines(String text, int count)
        {
            for (int i = 0; i < count; i++)
                System.out.println(text);
        }

        public static void main(String[] args)
        {
            printLines("Привет", 10);
            printLines("Пока", 20);
        }
}

