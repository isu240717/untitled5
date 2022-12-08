public class Main {


    public static void main(String[] args) {

        double[] fractionalNums =

                {-1.3, 1.5, -5.3, 8.3, -9.4, 12.3, 20.0, -19.5, 13.2, 31.1, -1.4, 13.5, -15.1, -56.9, 18.4};
        double average = 0.0;
        int count = 0;



        //внешний цикл, в нем перебираем числа, пока не дойдем до

        //первого отрицательного числа

        for (int a1 = 0; a1 < fractionalNums.length; a1++) {


            //если во внешнем цикле достигли первого отрицательного числа,

            //переходим во внутренний цикл,

            //перебираем во внутреннем цикле оставшиеся числа массива

            //и складываем только положительные числа

            if (fractionalNums[a1] < 0) {

                for (int a2 = a1 + 1; a2 < fractionalNums.length; a2++) {



                    if (fractionalNums[a2] > 0) {

                        average = average + fractionalNums[a2];

                        //тоже самое:

                        //average += fractionalNums[a2];

                        count++;

                    }

                }

                //после завершения внутреннего цикла

                // дальше внешний цикл не нужен, выход

                break;

            }

        }

        //сумма положительных чисел массива

        System.out.println("average  " + average);

        //количество положительных чисел массива

        System.out.println("count  " + count);

        //подсчет среднего значения положительных чисел массива

        System.out.println("average/count " + average / count);

    }

}