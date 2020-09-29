public class LuckySkyscraper {


    static public void floorList(int totalRealFloors){
        // loop through real floor numbers
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor <= totalRealFloors; realFloor++){
            System.out.println("realFloor: " + realFloor + " fakeFloor: " + fakeFloor);
            do {
                fakeFloor++;
            }while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
    }
}
