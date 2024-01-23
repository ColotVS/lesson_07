public class lesson_07_20 {
    //Переменные класса
    //Переменные класса — это переменные, объявленные не в методе, а в классе.
    //Переменные класса — это общие переменные для всех методов класса.
        public int count = 0;       //count
        public int sum = 0;         //count, sum
        public void add (int data)  //count, sum
        {                           //count, sum, data
            sum = sum + data;       //count, sum, data
            count++;                //count, sum, data
        }                           //count, sum
        public void remove(int data)//count, sum
        {                           //count, sum, data
            sum = sum - data;       //count, sum, data
            count--;                //count, sum, data
        }                           //count, sum
    }

