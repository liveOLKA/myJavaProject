package lesson8.task2;

import java.util.*;

public class PhoneDirectory {
    private Map<String, HashSet<String>> map;

    public PhoneDirectory() {
        this.map = new HashMap<>();
    }

    public void add(String surname, String phone) {
        HashSet<String> numbers;
        if (map.containsKey(surname)) {
            numbers = map.get(surname);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        map.put(surname, numbers);
    }

    public HashSet<String> get(String surname) {
        return map.get(surname);
    }

    @Override
    public String toString() {
        return "PhoneDirectory{" +
                "map=" + map +
                '}';
    }
}





