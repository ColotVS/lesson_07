public class lesson_07_03 {
        //Передача параметров в метод
        public static void printLines(String text, int count)//Объявили метод printLines с параметрами: String text, int count
        {
            for (int i = 0; i < count; i++) //Метод выводит на экран count раз строку text
                System.out.println(text);
        }

        public static void main(String[] args)
        {
            printLines("Привет", 10); //Вызываем метод printLines с разными параметрами
            printLines("Пока", 20);
        }
}

