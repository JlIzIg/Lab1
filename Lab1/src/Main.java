
import java.util.Scanner;

    public class Main {

        /*Дано натуральное число n. Вычислить произведение первых n сомножителей P=2/3*4/5*...*2*n/2*n+1.*/

        private static void task1 ()
        {
            Scanner in = new Scanner(System.in);
            System.out.print("\n Input the quantity of multiplies :");
            int n = in.nextInt();
            double prod_up=1;
            double prod_down=1;
            int i=1;
            for (i=1; i<=n; i++)
            {
                prod_up *= (i*2);
                prod_down *=((i*2)+1);
            }
            System.out.print("\nThe prod of  "+ n + " elements is " + (prod_up/prod_down) );
        }

        /* Дано натуральное число n. Найти сумму n^2+(n+1)^2+...+(2*n)^2.*/
        private static void task2 ()
        {
            Scanner in = new Scanner(System.in);
            System.out.print("\n n^2+(n+1)^2+...+(2*n)^2");
            System.out.print("\n Input the number n :");
            int n = in.nextInt();
            int sum=0;
            int b=0;
            for (b=0; b<=n; b++)
            {  sum+= Math.pow(n+b,2);
            }
            System.out.print("\n The sum of squares is  "+ sum);
        }

        /*Дано натуральное число n, вычислить: a) 1/sin(1)+1/(sin(1)+sin(2))+...+1/(sin(1)+sin(2)+...+sin(n)).
        б) cos(1)/sin(1)+(cos(1)+cos(2))/(sin(1)+sin(2))+...+(cos(1)+cos(2)+...+cos(n))/(sin(1)+sin(2)+...+sin(n)).
         */
        private static void task3()
        {
            Scanner in = new Scanner(System.in);
            System.out.print("\n Input the number n :");
            int n = in.nextInt();

            double sum =0;
            double [] sin_arr = new  double [n];
            sin_arr[0] = Math.sin(1);
            //System.out.print(sin_arr[0]);
            for (int i=1; i<n; i++)
            {
                sin_arr[i] = Math.sin(i+1)+sin_arr[i-1];
                //System.out.print("\n" + sin_arr[i]);
            }
            for (int i=0; i<n; i++)
            {
                sin_arr[i] = 1.0/(sin_arr[i]);
                sum += sin_arr[i];
                //System.out.print("\n" + sin_arr[i]);
            }
            System.out.print("\n The sum is  " + sum);
            System.out.print("\n Input the number n :");
            int n2 = in.nextInt();
            double sum2=0;
            double [] sin_arr2 = new double[n2];
            double [] cos_arr2 = new double[n2];
            double [] elements = new double[n2];
            sin_arr2[0] = Math.sin(1);
            cos_arr2[0] = Math.cos(1);

            for (int i2=1; i2<n2; i2++)
            {
                sin_arr2[i2] = Math.sin(i2+1)+sin_arr2[i2-1];

                cos_arr2[i2] = Math.cos(i2+1)+cos_arr2[i2-1];
            }
            for (int i2=0; i2<n2; i2++)
            {
                elements[i2] = cos_arr2[i2]/sin_arr2[i2];
                sum2+=elements[i2];
            }
            System.out.print("\n The sum is  " + sum2);
        }

    /*Известны оценки за контрольную работу по физике каждого ученика двух классов.
    Определить, сколько оценок «отлично», «хорошо», «удовлетворительно» и «неудовлетворительно» было
    выставлено в каждом классе. Количество учащихся в каждом классе одинаковое.
     */

        public static void task4()
        {
            int mark_best = 0; //10-12
            int mark_good = 0; //8-10
            int mark_done = 0; //3-8
            int mark_bad =  0; //0-3

            System.out.print("\n Input the number of students in first/second class");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int i=0;
            int [] arr = new int [n];
            while(i<n)
            {
                System.out.print("\n Input the mark of "+ (i+1) + " student");
                int mark = in.nextInt();
                if (mark<0 || mark>12)
                {
                    System.out.print("\n Please input correct mark under 0 and 12 include");
                    System.out.print("\n Input the mark of "+ (i+1) + " student");
                    mark = in.nextInt();
                }
                else
                {   arr[i]=mark;
                    i++;
                }
            }
            for (int j=0; j<n; j++)
            {
                System.out.print("\n  The mark of "+ (j+1) + " student is "+arr[j]);

                if (arr[j] >= 10 && arr[j]<= 12)
                {
                    mark_best++;
                }
                else if
                (arr[j]<10 && arr[j]>= 8)
                {
                    mark_good++;
                }
                else if (arr[j] <8 && arr[j]>= 3)
                {
                    mark_done++;
                }
                else if (arr[j]<3 && arr[j]>= 0)
                {
                    mark_bad++;
                }
            }

            System.out.print("\nThe  best " + mark_best);
            System.out.print("\nThe bad " + mark_bad);
            System.out.print("\nThe good "+ mark_good);
            System.out.print("\nThe done "+ mark_done);

            System.out.print("\n Let's do it for other class  " + mark_best);
            i=0;
            int [] arr2 = new int [n];
            while(i<n)
            {
                System.out.print("\n Input the mark of "+ (i+1) + " student");
                int mark = in.nextInt();
                if (mark<0 || mark>12)
                {
                    System.out.print("\n Please input correct mark under 0 and 12 include");
                    System.out.print("\n Input the mark of "+ (i+1) + " student");
                    mark = in.nextInt();
                }
                else
                {   arr2[i]=mark;
                    i++;
                }
            }
            int mark_best2 = 0; //10-12
            int mark_good2 = 0; //8-10
            int mark_done2 = 0; //3-8
            int mark_bad2 =  0; //0-3
            for (int j=0; j<n; j++)
            {
                System.out.print("\n  The mark of "+ (j+1) + " student is "+arr2[j]);

                if (arr2[j] >= 10 && arr2[j]<= 12)
                {
                    mark_best2++;
                }
                else if
                (arr2[j]<10 && arr2[j]>= 8)
                {
                    mark_good2++;
                }
                else if (arr2[j] <8 && arr2[j]>= 3)
                {
                    mark_done2++;
                }
                else if (arr2[j]<3 && arr2[j]>= 0)
                {
                    mark_bad2++;
                }
            }
            System.out.print("\nThe  best " + mark_best2);
            System.out.print("\nThe bad " + mark_bad2);
            System.out.print("\nThe good "+ mark_good2);
            System.out.print("\nThe done "+ mark_done2);
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
                days[1] = 28;
            }
            else {
                days[1] = 29;
            }

            for (int month = 0; month < months.length; month++) {
                // Месяц
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


