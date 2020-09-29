public class Main {

    public static void main(String[] args) {
        for(var floor = 1; floor <= 220; floor++){
            System.out.print("floor: " + floor);
            var fakeFloor = LuckySkyscraper.toFakeFloor(floor);
            System.out.print(" fake floor: " + fakeFloor);
            var backToRealFloor = LuckySkyscraper.toRealFloor(fakeFloor);
            System.out.println("   back to real: " + backToRealFloor);
        }

    }
}
