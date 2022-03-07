package lesson8.task2;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Anderson", "+7 918 1111111");
        phoneDirectory.add("Patterson", "+7 914 2222222");
        phoneDirectory.add("Miller", "+7 917 3333333");
        phoneDirectory.add("Johnson", "+7 920 4444444");
        phoneDirectory.add("Harrison", "+7 920 5555555");
        phoneDirectory.add("Miller", "+7 918 6666666");
        phoneDirectory.add("Carter", "+7 913 7777777");
        phoneDirectory.add("Anderson", "+7 921 8888888");
        phoneDirectory.add("Miller", "+7 918 9999999");
        phoneDirectory.add("Smith", "+7 918 1010101");
        phoneDirectory.add("Watson", "+7 918 2020202");
        System.out.println(phoneDirectory);
        System.out.println(phoneDirectory.get("Miller"));
    }
}