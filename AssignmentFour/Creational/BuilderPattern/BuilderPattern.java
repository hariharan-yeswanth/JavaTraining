package AssignmentFour.Creational.BuilderPattern;

public class BuilderPattern {
    public static void main(String args[]) {
        CDBuilder cdBuilder = new CDBuilder();
        CDType cdType1 = cdBuilder.buildSonyCD();
        cdType1.showItems();

        CDType cdType2 = cdBuilder.buildSamsungCD();
        cdType2.showItems();
    }
}
// Implementation:
// Create Packing interface
// Create 2 abstract classes CD and Company
// Create 2 implementation classes of Company: Sony and Samsung
// Create the CDType class
// Create the CDBuilder class
// Create the BuilderDemo class
