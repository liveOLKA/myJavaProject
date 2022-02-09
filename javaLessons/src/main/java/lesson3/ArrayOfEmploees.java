package lesson3;

public class ArrayOfEmploees {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Stephen Curry", "xirurg", "curry30@gmail.com", 891223586, 5000.99, 33);
        emplArray[1] = new Employee("Kawhi Leonard", "travmotolog", "leonard2@gmail.com", 897777777, 2500.25, 39);
        emplArray[2] = new Employee("Lebron James", "terapevt", "lebron23@gmail.com", 892568771, 1000.15, 41);
        emplArray[3] = new Employee("Luca Doncic", "nevrolog", "doncic77@gmail.com", 894561232, 2000.00, 52);
        emplArray[4] = new Employee("Rudy Gobert", "urolog", "cobert27@gmail.com", 891161241, 2500.57, 29);

        for (Employee e : emplArray) {
            if (e.getAge() > 40) {
                e.showInfo();
            }
        }
    }
}
