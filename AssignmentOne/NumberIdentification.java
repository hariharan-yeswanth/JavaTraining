package AssignmentOne;
import java.util.Scanner;

public class NumberIdentification {
	static void sieveAlgorithm(int N){
        int[] array = new int[N+1];
        array[0]=array[1]=1;
        for(int i=2;i<Math.sqrt(N);i++){
            if(array[i]==0){
                for(int j=2;j*i<=N;j++){
                    array[j*i]=1;
                }
            }
        }
        for(int i=0;i<N+1;i++){
            if(array[i]==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }

    static void isArmstrong(int N){
        int len=0,temp = N;
        while(temp>0){
            len++;
            temp/=10;
        }
        int sum=0;
        temp=N;
        while(N>0){
            sum+=Math.pow(N%10, len);
            N/=10;

        }
        System.out.println(sum==temp?"It is an Armstrong Number":"It is not an Armstrong Number");

    }
    
    static void isPerfect(int N){
        int sum=0;
        for(int i=1;i<N/2 +1;i++){
            if(N%i==0){
                sum+=i;
            }
        }
        System.out.println(sum==N?"It is an Perfect Number":"It is not an Perfect Number");

    }

    static void isPalindrome(int N){
        int num=0,temp=N;
        while(temp>0){
            num=num*10 + temp%10;
            temp/=10;
        }
        System.out.println(num+" "+N);
        System.out.println(num==N?"It is an Palindrome Number":"It is not an Palindrome Number");


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a upper limit number: ");
        int N = sc.nextInt();
        sieveAlgorithm(N);
        System.out.println("Enter a specific Number N : ");
        N = sc.nextInt();
        isArmstrong(N);
        isPerfect(N);
        isPalindrome(N);
        sc.close();

    }
}
