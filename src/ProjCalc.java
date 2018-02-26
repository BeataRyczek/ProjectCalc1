import java.util.Arrays;
import java.util.Scanner;

public class ProjCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String calculateLogin = "c";
        String calculatePass = "b";
        System.out.println("Podaj login");
        String login = sc.nextLine();

        if (calculateLogin.equals(login)) {
            System.out.println("Podaj haslo");
            String password = sc.nextLine();

            if (calculatePass.equals(password)) {
                System.out.print("Zalogowales sie poprawnie " +
                        "\n\nWybierz opcje kalkulatora");

                System.out.print(
                        " \n\n1. Dodawanie " +
                        " \n2. Odejmowanie" +
                        " \n3. Mnozenie" +
                        " \n4. Dzielenie" +
                        " \n5. Pierwiastek" +
                        " \n6. Potegowanie" +
                        " \n7. Zmiana systemu liczbowego" +
                        " \n8. Mediana" +
                        " \n9. Srednia" +
                        " \n\nWprowadz liczbe z menu ");
            }else
                System.out.println("Uruchom ponownie kalkulator i wprowadz poprawny login i haslo");

                int menuCalc = sc.nextInt();

                switch (menuCalc) {

                    case 1:
                        System.out.println("Dodawanie");
                        System.out.println("Podaj liczby");
                        ProjCalc intsum = new ProjCalc();
                        int sum = intsum.min();
                        System.out.println(sum);
                        break;

                    case 2:
                        System.out.println("Odejmowanie");
                        System.out.println("Podaj liczby");
                        ProjCalc intmin = new ProjCalc();
                        int min = intmin.min();
                        System.out.println(min);
                        break;

                    case 3:
                        System.out.println("Mnozenie");
                        System.out.println("Podaj liczby");
                        ProjCalc intmul = new ProjCalc();
                        int multi = intmul.mul();
                        System.out.println(multi);

                        break;

                    case 4:
                        System.out.println("Dzielenie");
                        System.out.println("Podaj liczby");
                        ProjCalc indiv = new ProjCalc();
                        int divide = indiv.div();
                        System.out.println(divide);
                        break;

                    case 5:
                        System.out.println("Pierwiastek");
                        System.out.println("Wprowadź liczbę do pierwiastkowania i stopien jej pierwiastka");
                        ProjCalc intpow = new ProjCalc();
                        double element = intpow.element();
                        System.out.println(element);
                        break;

                    case 6:
                        System.out.println("Potegowanie");
                        System.out.println("Wprowadź liczbę do potęgowania i jej potege");
                        ProjCalc doubpow = new ProjCalc();
                        double power = doubpow.power();
                        System.out.println(power);
                        break;

                    case 7:
                        System.out.println("Zmiana systemu liczbowego");
                        System.out.println("Podaj liczbę ktora chcesz zmienic");
                        int a = sc.nextInt();
                        System.out.println(Integer.toBinaryString(a));
                        System.out.println(Integer.toOctalString(a));
                        System.out.println(Integer.toHexString(a).toUpperCase());
                        break;

                    case 8:
                        System.out.println("Mediana");
                        System.out.println("Podaj liczby dla ktorych chcesz obliczyc mediane");
                        ProjCalc doublemed = new ProjCalc();
                        double median = doublemed.median();
                        System.out.println(median);
                        break;

                    case 9:
                        System.out.println("Srednia");
                        System.out.println("Podaj liczby dla ktorych chcesz obliczyc średnia");
                        ProjCalc doubleaverage = new ProjCalc();
                        double average = doubleaverage.average();
                        System.out.println(average);
                        break;

                    default:
                        System.out.println("Default");
                        break;
                }
            }
        }

    int sum() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String test = sc.nextLine();
        String[] array = test.split(" ");
        int[] number = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            number[i] = Integer.parseInt(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            sum += number[i];
        }
        return sum;

    }

    int min() {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        String testMin = sc.nextLine();
        String[] array = testMin.split(" ");
        int[] numberMin = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            numberMin[i] = Integer.parseInt(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if( i==0){
                min = numberMin[i];
            } else
                min =   min - numberMin[i];
        }
        return min;
    }

    int mul() {
        Scanner sc = new Scanner(System.in);
        int multi = 1;
        String testMulti = sc.nextLine();
        String[] array = testMulti.split(" ");
        int[] numberMulti = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            numberMulti[i] = Integer.parseInt(array[i]);
        }
        for (int i = 0; i < array.length; i++) {

            multi = numberMulti[i] * multi;
        }
        return multi;
    }

    int div() {
        int divide = 1;
        Scanner sc = new Scanner(System.in);
        String testDivide = sc.nextLine();
        String[] arrayDivide = testDivide.split(" ");
        int[] numberDivide = new int[arrayDivide.length];
        for (int i = 0; i < arrayDivide.length; i++) {
            numberDivide[i] = Integer.parseInt(arrayDivide[i]);
        }
        for (int i = 0; i < arrayDivide.length; i++) {
            if (i == 0) {
                divide = numberDivide[i];
            } else
                divide = divide / numberDivide[i];
        }
        return divide;
    }

     double element() {
        Scanner sc = new Scanner(System.in);
        double sqrt = sc.nextInt();
        double root = sc.nextInt();
        double element = Math.pow(sqrt, 1.0/root);
        return  element;
    }

     int power(){
        Scanner scanner = new Scanner(System.in);
        int pow= scanner.nextInt();
        int pow1 =scanner.nextInt();
        int power=pow;
        for (int i = 1; i < pow1; i++) {
            power *=pow;
        }
        return power;
    }

     double median(){
        Scanner sc = new Scanner(System.in);
        double median;
        String test = sc.nextLine();
        String[] array = test.split(" ");
        int[] arrayMedian = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayMedian[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(arrayMedian);
        if (arrayMedian.length % 2 == 0)
            median = (arrayMedian[arrayMedian.length / 2] + arrayMedian[arrayMedian.length / 2] - 1);
        else
            median = arrayMedian[arrayMedian.length / 2];
        return median;
    }

      double average() {
        Scanner sc = new Scanner(System.in);
        double average = 0;
        String testAverage = sc.nextLine();
        String[] array = testAverage.split(" ");
        int[] arrayAverage = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayAverage[i] = Integer.parseInt(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            average = (arrayAverage[i] + average);
        }
        average = (average/ array.length);
        return average;
    }

    }

