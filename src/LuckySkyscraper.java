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

    static public int toRealFloor(int fakeFloorGoal){
        var fakeFloor = 1;
        for (var realFloor = 1; realFloor <= fakeFloorGoal; realFloor++){
            if (fakeFloorGoal == fakeFloor){
                return realFloor;
            }
            do{
                fakeFloor++;
            }while (fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
        return -1; // could not find real floor number
    }
    static public int toFakeFloor(int realFloorGoal){
        var fakeFloor = 1;
        for (var realFloor = 1; realFloor < realFloorGoal; realFloor++){
            do{
                fakeFloor++;
            }while (fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
        return fakeFloor;
    }
}
