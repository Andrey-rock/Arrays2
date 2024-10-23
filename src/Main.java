public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int[] salaries = {750_589, 800_000, 812_145, 780_500, 699_123};
        int sum = 0;
        for (int salary : salaries) {
            sum += salary;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int salary : salaries) {
            if (salary > max) {
                max = salary;
            }
            if (salary < min) {
                min = salary;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        int[] salaries1 = {750_801, 820_100, 812_400, 780_300, 699_990};
        sum = 0;
        for (int salary : salaries1) {
            sum += salary;
        }
        float averageSum = (float) sum / salaries1.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //Варианс с перезаписью массива
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(reverseFullName);
        System.out.println();

        /*
        Варианс без перезаписью массива
        char[] reverseFullName1= { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName1.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName1[i]);
        }
        */
    }
}