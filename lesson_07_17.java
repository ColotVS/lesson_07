public class lesson_07_17 {
    //Локальные переменные
    //Локальная переменная существует только в том блоке кода, в котором она объявлена.
    public static void main(String[] args) //Доступность переменных
    {
        int a = 5;                         //a
        if (a < 10)                        //a
        {                                  //a
            int b = 10;                    //a, b
            while (b == 10)                //a, b
            {                              //a, b
                int x = a + b;             //a, b, x
                System.out.println(x);     //a, b, x
            }                              //a, b
            System.out.println(b);         //a, b
        }                                  //a
    }                                      //a
}                                          //a
