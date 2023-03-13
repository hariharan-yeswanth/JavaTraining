package AssignmentOne;
import java.util.Arrays;
class Chocolate{
    String flavour = "Dark";
}
public class PbvAndPbr {
	 public static void passByValue(int a){
	        a=20;
	        System.out.println("Primitive num in method = "+a);
	    }
	    
	    
	    public static void passByReference(int[] array){
	        array[0]=99;
	        System.out.println("Array after passing "+Arrays.toString(array));
	    }
	    public static void changeFlavour(Chocolate b){
	        b.flavour= "light";
	    }

	public static void main(String[] args) {
		int num = 10;
        System.out.println("Primitive num ="+num);
        passByValue(num);
        
        int[] array = {1,2,3,4,5};
        System.out.println("Array before passing = "+Arrays.toString(array));
        passByReference(array);
        
        Chocolate choc = new Chocolate();
        System.out.println("Chocolate current flavour is "+choc.flavour);
        changeFlavour(choc);
        System.out.println("Chocolate new flavour is "+choc.flavour);
	}
}
