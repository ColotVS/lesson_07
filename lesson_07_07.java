public class lesson_07_07 {
    //cобственный метод, который заполняет двумерный массив одинаковыми значениями
    public static void fill(int[][] data, int value)  //Метод fill проходится по всем ячейкам переданного двумерного массива и присваивает им значение value.
    {
        for (int i = 0; i < data.length; i++)
        {
            for (int j = 0; j < data[i].length; j++)
                data[i][j] = value;
        }
    }

    public static void main(String[] args)
    {
        int[][] months = {{31, 28}, {31, 30, 31}, {30, 31, 31}}; //Создаем двумерный массив.
        fill (months, 8); //Заполняем весь массив числом 8.
    }
}
