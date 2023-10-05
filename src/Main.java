

public class Main {
    public static void main(String[] args) {
        test(23, 10);
        test(75, 10);
        test(30, 35);
        test(50, 20);
        test(15, 5);
        System.out.println("");
        test(randomAge(), 33);
        test(randomAge(), 50);
        test(randomAge(), 45);
        test(randomAge(), 25);
    }


    public static String blueCar(int age, int temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "Можно идти гулять";
        } else if ((age <= 20) && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять";
        } else if ((age >= 45) && (temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }


    }

    public static int randomAge() {
        int generate = (int) (Math.random() * 100);
        return generate;
    }

    public static void test(int age, int temperature) {
        String result = blueCar(age, temperature);
        System.out.println("Возраст: " + age + ",Температура: " + temperature + " = " + result);
    }

}