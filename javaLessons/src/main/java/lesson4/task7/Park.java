package lesson4.task7;

public class Park {
    private Attraction[] attractArray;
    private final String name;

    public Park(String name) {
        this.name = name;
    }

    public void parkInfo() {
        System.out.println(name + " has following attractions: ");
        Park.Attraction[] attractArray = new Attraction[4];
        attractArray[0] = new Attraction("Raketa", "Tu - Su, 10.00 am - 7.00 pm", 11.5f);
        attractArray[1] = new Attraction("Gorki", "Tu - Sa, 9.00 am-6.00 pm", 9.5f);
        attractArray[2] = new Attraction("Batut", "Tu - Su, 10.00 am-7.00 pm", 5.5f);
        attractArray[3] = new Attraction("Koleso", "Tu - Su, 9.00 am-8.00 pm", 6.5f);
        for (Attraction attraction : attractArray) {
            attraction.attractionInfo();
        }
    }

    public class Attraction {
        private String name;
        private String workTime;
        private float price;

        public Attraction(String name, String workTime, float price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }

        void attractionInfo() {
            System.out.print("Attraction: " + name + ", work time: " + workTime + ", price: " + price + "\n");
        }
    }
}







