package AssignmentFive.FlyWeight;

public class Main {
    public static final int NO_OF_SHELVES = 6, NO_OF_BAYS = 10;

    public static void main(String[] args) {
        Factory factory = new Factory(NO_OF_SHELVES);
        for (int index_i = 1; index_i <= NO_OF_SHELVES; index_i++) {
            for (int index_j = 1; index_j <= NO_OF_BAYS; index_j++)
                factory.getShelf(index_i).printIndex(index_j);
            System.out.println();
        }
    }
}
