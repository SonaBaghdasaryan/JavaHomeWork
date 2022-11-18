// Реализовать таблицу истинности т е у нас есть p = false и q = true .
// Чему будет ранво p & q == ? , ? - вынести в таблицу.
// /**
// * HomeWork1
// */
// public class HomeWork1 {

// public static void main(String[] args) {
// System.out.println("R = !(!x && y) || (x && !z)");
// System.out.println("Truth table");
// System.out.println("X Y Z R");
// out(false, false, false);
// out(false, false, true);
// out(false, true, false);
// out(false, true, true);
// out(true, false, false);
// out(true, false, true);
// out(true, true, false);
// out(true, true, true);
// }
// public static void out(boolean x, boolean y, boolean z) {
// System.out.println(
// (x ? "1 " : "0 ") + (y ? "1 " : "0 ") + (z ? "1 " : "0 ") + (!(!x && y) || (x
// && !z) ? " 1" : " 0"));
// }
// }

// Сила тяжести на Луне составляет около 17% земной. Напишите программу, которая
// вычислила бы ваш вес на Луне.
// /**
// * HomeWork1
// */
// import java.util.Scanner;

// public class HomeWork1 {

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.println("Input your weight:");
// System.out.println("Your weight on the Moon is: " + scanner.nextDouble() *
// 0.17);
// }
// }

// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя
// количество выполняемых действий к минимуму.
// public class HomeWork1 {
// static int power(int a, int b) {
// int result = 1;
// for (int i = 1; i <= b; i++) {
// result = result * a;
// }
// return result;
// }

// public static void main(String[] args) {
// System.out.println(power(3, 2));
// }
// }