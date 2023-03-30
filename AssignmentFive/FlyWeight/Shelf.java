package AssignmentFive.FlyWeight;

public class Shelf {
    private int shelfNumber;

    public Shelf(int shelfNumber) {
        this.shelfNumber = shelfNumber;
        System.out.println("Shelf Number: " + this.shelfNumber);
    }

    void printIndex(int bayNumber) {
        System.out.print("Shelf:" + shelfNumber + " Bay:" + bayNumber + "\n");
    }
}
