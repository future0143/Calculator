import java.io.IOException;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) throws IOException {
        Scanner console=new Scanner (System.in);
        System.out.println("Input:");
        String input = console.nextLine();

        calc(input);
        System.out.println("Output");
        System.out.println(calc(input));

    }
    public static String calc(String input) throws IOException {
        String [] str = new String[3];    //создаю массив из 3 переменных
        str = input.split(" ");     //в массив помещаю введенную строку, разделенную на элементы пробелами

        if (str.length>3)                //проверка на количество введенных переменных (2 переменные и 1 оператор)
            throw new IOException();

        int a = Integer.parseInt(str[0]);   //преобразование элемента массива (типа String) в число
        String operator = str[1];
        int b = Integer.parseInt(str[2]);
        int result = 0;

        if ((a < 1) && (a > 10) && (b < 1) && (b > 10)) {    //проверка на диапазон от 1 до 10
            throw new IOException();
        }
        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            throw new IOException();         // проверка на введенный оператор (разрешен ввод только 4-х)
        }
        switch (operator) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
            }
        String output = "" + result;
        return output;
        }
    }
