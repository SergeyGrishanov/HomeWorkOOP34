package work3;

// Напишите обобщенную функцию getMax, которая принимает два параметра типа T и возвращает максимальное значение из них.

// В этом примере мы объявляем обобщенную функцию getMax, которая принимает два параметра типа T, 
//ограниченных интерфейсом Comparable. 
//Мы используем метод compareTo для сравнения значений и возвращаем максимальное значение из двух.

// В методе main мы вызываем getMax с разными типами данных: целое число (Integer), число с плавающей запятой (Double) и 
//строку (String). В результате мы получаем максимальные значения из каждой пары и выводим их на консоль.

// Обобщения позволяют нам писать универсальный код, который может работать с разными типами данных, 
// сохраняя при этом безопасность типов.

public class Main {
    public static void main(String[] args) {
        System.out.println(getMax(123, 129));
        System.out.println(getMax("home", "cat"));
        System.out.println(getMax(45.7, 23.3));
     }
 
     public static <T extends Comparable<T>> T getMax(T parametr1, T parametr2){
         return parametr1.compareTo(parametr2) >= 0 ? parametr1 : parametr2;
     }

    }

