public class lesson_07_22 {
    //Программа должна выводить количество населения самых крупных городов мира и сравнивать их с самым большим городом — Токио.
    //Но алгоритм программы немного нарушен. Для исправления ошибки тебе необходимо сделать так,
    //чтобы в строке с выводом информации о самом крупном городе мира использовались статические переменные класса
    //вместо локальных аргументов метода.
    public static String city = "Токио";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Джакарта", 25.3);
        printCityPopulation("Сеул", 25.2);
        printCityPopulation("Дели", 23.1);
        printCityPopulation("Нью-Йорк", 21.6);
    }

    public static void printCityPopulation(String city, double population){
        System.out.println("Население города " + city + " составляет " + population + " млн человек.");
        System.out.println("В то время как в самом густонаселенном городе " + lesson_07_22.city + " население составляет " + lesson_07_22.population + " млн человек.");
    }
}
