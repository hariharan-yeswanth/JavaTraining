package AssignmentFive.FlyWeight;

public class Factory {
    private Shelf[] shelf;

    public Factory(int noOfShelves) {
        shelf = new Shelf[noOfShelves];
    }

    public Shelf getShelf(int shelfNumber) {
        if (shelf[shelfNumber] == null) {
            shelf[shelfNumber] = new Shelf(shelfNumber);
        }
        return shelf[shelfNumber];
    }
}
