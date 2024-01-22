public class lesson_07_10 {
    //метод fill, который заполняет переданный в него массив значением value, причем заполняет не весь массив,
    //а его часть, заданную индексами from и to.
    //
    //В начале метода fill проверяется, корректно ли переданы в него значения.
    //Если from меньше 0, или to больше длины массива, то метод fill тут же завершается (вызывает команду return).
        public static void fill(int[] data, int from, int to, int value) //Метод fill заполняет часть переданного массива значением value.
        //Часть массива определяется индексами from и to.
        {
            if (from < 0 || to > data.length) //Если from меньше 0 или to больше длины массива, метод тут же завершается.
                return;

            for (int i = from; i < to; i++)
            {
                data[i] = value;
            }
        }

        public static void main(String[] args)
        {
            int[] months = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10, 11, 12};
            fill(months, 2, 10, 8);
        }
    }
