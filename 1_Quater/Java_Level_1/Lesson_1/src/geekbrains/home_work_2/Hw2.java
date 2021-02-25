package geekbrains.home_work_2;

public class Hw2 {

    public static void main(String[] args) {

        // Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1. С помощью цикла
        //     * и условия заменить 0 на 1, 1 на 0;

        int[] arr_1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("1. Задание:");
        for (int i = 0; i < arr_1.length; i++) {
            if (arr_1[i] == 0) {
                arr_1[i] = 1;
            } else {
                arr_1[i] = 0;
            }
            System.out.print(arr_1[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Задание 2. Задать пустой целочисленный массив размером 8. С помощью цикла
        //     * заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] arr_2 = new int[8];
        System.out.println("2. Задание:");
        int num_1 = 0;
        for (int i = 0; i < arr_2.length; i++) {
            arr_2[i] = num_1;
            num_1 += 3;
            System.out.print(arr_2[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти
        //     * по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arr_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("3. Задание:");
        for (int i : arr_3) {
            if (arr_3[i] < 6) {
                arr_3[i] = arr_3[i] * 2;
            } else {
                arr_3[i] = arr_3[i];
            }
            System.out.print(arr_3[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
        //     * одинаковое) и с помощьюцикла(-ов) заполнить его диагональные элементы единицами;

        int[][] arr_4 = new int[9][9];
        System.out.print("4. Задание:");
        for (int i = 0; i < arr_4.length; i++) {
            for (int j = 0; j < arr_4[i].length; j++) {
                if (i == j) {
                    arr_4[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr_4.length; i++) {
            for (int j = arr_4[i].length - 1; j >= 0; j--) {
                if ((j + i) == arr_4.length - 1) {
                    arr_4[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr_4.length; i++) {
            System.out.println();
            for (int j = 0; j < arr_4[i].length; j++) {
                System.out.print(arr_4[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println();

        // Задание 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы

        int[] arr_5 = {50, 5, 13, 25, 11, 4, 5, 2, 400, 83, 91, 111};
        System.out.println("5. Задание:");
        int min = arr_5[0];
        int max = arr_5[0];
        for (int i = 0; i < arr_5.length; i++) {
            if (arr_5[i] < min) {
                min = arr_5[i];
            }
            if (arr_5[i] > max) {
                max = arr_5[i];
            }
        }
        System.out.println("Минимальное значение массива = " + min);
        System.out.println("Максимальное значение массива = " + max);
        System.out.println();


        // Задание 6. Написать метод, в который передается не пустой одномерный целочисленный массив,
        //     * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой
        //     * части массива равны;

        System.out.println("6. Задание:");

        int[] arr_6 = {5, 5, 5, 5, 5, 15, 10};
        checkBalance(arr_6);

        System.out.println();


        // Задание 7. Написать метод, которому на вход подается одномерный массив и число n,
        //     * при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
        // !!!!Работает с положительной n, при отрицательной не смог добиться правильного вывода в консль, хотя
        // данные в массивы считаются правильно(((((

        System.out.println("7. Задание:");

        int[] arr_7 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 4;
        offsetMethod(arr_7, n);

    }

    public static void checkBalance(int[] a){
        int summa = 0;
        int half = 0;
        boolean r = false;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        half = summa / 2;
        if (summa % 2 == 0) {
            summa = 0;
            for (int i = 0; i < a.length; i++) {
                summa += a[i];
                if (summa == half && summa % half == 0) r = true;
            }
            if (r) {
                System.out.print(r + " - ");
                summa = 0;
                for (int i = 0; i < a.length; i++) {
                    summa += a[i];
                    if (summa % half == 0 && summa == half) {
                        System.out.print(a[i] + " || ");
                    } else if (summa != half) {
                        System.out.print(a[i] + " ");
                    }
                }
            } else System.out.println(r + " - Нет совпадений");
        } else System.out.println(r + " - Нет совпадений (массив не четный)");
    }

    public static void offsetMethod(int[] a, int n){

        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < a.length; j++) {
                    int num = a[j];
                    if (j + 1 == a.length) {
                        a[j] = num;
                    } else {
                        int tmp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = tmp;
                    }
                    if (i == n) System.out.print(a[j] + " ");
                }
            }
        }
        if (n < 0){
            for (int i = -1; i >= n; i--) {
                for (int j = a.length - 1; j >= 0; j--) {
                    int num = a[j];
                    if (j == 0) {
                        a[j] = num;
                    } else {
                        int tmp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = tmp;
                    }
                    if (i == n) System.out.print(a[j] + " ");
                }
            }
        }


    }
}
