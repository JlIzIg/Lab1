import java.util.Random;
import java.util.Scanner;

    public class Main {
        /*Дано натуральное число n. Вычислить произведение первых n сомножителей P=2/3*4/5*...*2*n/2*n+1.*/
        private static void task1() {
            Scanner in = new Scanner(System.in);
            System.out.print("\n Input the quantity of multiplies :");
            int n = in.nextInt();
            double prod_up = 1;
            double prod_down = 1;
            for (int i = 1; i <= n; i++) {
                prod_up *= (i * 2);
                prod_down *= ((i * 2) + 1);
            }
            System.out.print("\nThe prod of  " + n + " elements is " + (prod_up / prod_down));
        }

        /* Дано натуральное число n. Найти сумму n^2+(n+1)^2+...+(2*n)^2.*/
        private static void task2() {
            Scanner in = new Scanner(System.in);
            System.out.print("\n n^2+(n+1)^2+...+(2*n)^2");
            System.out.print("\n Input the number n :");
            int n = in.nextInt();
            int sum = 0;
            for (int b = 0; b <= n; b++) {
                sum += ((n + b) * (n + b));
            }
            System.out.print("\n The sum of squares is  " + sum);
        }

        /*Дано натуральное число n, вычислить: a) 1/sin(1)+1/(sin(1)+sin(2))+...+1/(sin(1)+sin(2)+...+sin(n)).
        б) cos(1)/sin(1)+(cos(1)+cos(2))/(sin(1)+sin(2))+...+(cos(1)+cos(2)+...+cos(n))/(sin(1)+sin(2)+...+sin(n)).
         */
        private static void task3() {
            Scanner in = new Scanner(System.in);
            System.out.print("\n Input the number n :");
            int n = in.nextInt();
            double sum = 0, sin = 0;
            for (int i = 0; i < n; i++) {
                sin += Math.sin(i + 1);
                sum += 1.0 / sin;
            }
            System.out.print("\n The sum  1/sin(1)+1/(sin(1)+sin(2))+...+1/(sin(1)+sin(2)+...+sin(n)) is  " + sum);
            System.out.print("\n Input the number n :");
            int n2 = in.nextInt();
            double sum2 = 0, sin2 = 0, cos2 = 0;
            for (int i = 0; i < n; i++) {
                cos2 += Math.cos(i + 1);
                sin2 += Math.sin(i + 1);
                sum2 += cos2 / sin2;
            }
            System.out.print("\n The sum of cos(1)/sin(1)+(cos(1)+cos(2))/(sin(1)+sin(2))+...+(cos(1)+cos(2)+...+cos(n))/(sin(1)+sin(2)+...+sin(n)) is  " + sum2);
        }

    /*Известны оценки за контрольную работу по физике каждого ученика двух классов.
    Определить, сколько оценок «отлично», «хорошо», «удовлетворительно» и «неудовлетворительно» было
    выставлено в каждом классе. Количество учащихся в каждом классе одинаковое.
     */
        public static void task4()
        {
            int mark_best = 0, mark_good = 0, mark_done = 0, mark_bad = 0; //10-12
            System.out.print("\n Input the number of students in first/second class");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            Random rnd = new Random();
            for (int i = 0; i < n; i++) {
                int mark = rnd.nextInt(13);
                switch (mark) {
                    case 0: case 1: case 2: case 3: mark_bad++; break;
                    case 4: case 5: case 6: case 7: mark_done++; break;
                    case 8: case 9: case 10: mark_good++; break;
                    default: mark_best++; break;} }
            System.out.print("\n The result in first class");
            System.out.print("\nThe  best " + mark_best + "\nThe bad " + mark_bad + "\nThe good " + mark_good + "\nThe done " + mark_done);
            int mark_best2 = 0, mark_good2 = 0, mark_done2 = 0, mark_bad2 = 0;
            for (int i = 0; i < n; i++) {
                int mark = rnd.nextInt(13);
                switch (mark) {
                    case 0: case 1: case 2: case 3: mark_bad2++; break;
                    case 4: case 5: case 6: case 7: mark_done2++; break;
                    case 8: case 9: case 10: mark_good2++; break;
                    default: mark_best2++; break;
                }
            }
            System.out.print("\n The result in second class");
            System.out.print("\nThe  best " + mark_best2 + "\nThe bad " + mark_bad2 + "\nThe good " + mark_good2 + "\nThe done " + mark_done2);
        }

        /*Вывести на экран календарь на текущий год.*/

        private  static void task5()
        {
            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            String[] weeks = {"Sn", "Mn", "Tu", "Wd", "Th", "Fr", "St"};
            int year = 2022;
            int week = (year + (year - 1) / 4 + 6) % 7;
            if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
                days[1] = 28;}
            else {days[1] = 29;}
            for (int month = 0; month < months.length; month++) {
                System.out.println("\n\n      " + months[month]);
                for (int j = 1; j < weeks.length; j++) {
                    System.out.print(weeks[j] + " ");
                }
                System.out.println(weeks[0]);
                for (int j = 0; j < week - 1; j++) {
                    System.out.print("   ");
                }
                int day = 1;
                for (; day <= days[month]; day++) {
                    System.out.print(day + " ");
                    if (day < 10) {
                        System.out.print(" ");
                    }
                    week++;
                    if (week == 7) {
                        week = 0;
                    } else if (week == 1) {
                        System.out.println();
                    }
                }
            }
        }

        public  static  void  main (String[] args)
        {
            System.out.print("\n Task 1");
            task1();
            System.out.print("\n Task 2");
            task2();
            System.out.print("\n Task 3");
            task3();
            System.out.print("\n Task 4");
            task4();
            System.out.print("\n Task 5");
            task5();

        }


    }


