import java.util.Scanner;

public class LotoSasedinPatruzesinonua {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static double SansaCastig(int n, int k){
        if(n<k){
            return 0;
        }
        return (double)factorial(n)/(factorial(k)*factorial(n-k));
        //hmmm, nu stiu cum sa reprezint in virgula asta.
    }

    public static void IntroducereNumere(int n,int k){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Introduceti"+n+" numerele:");
        int[] ArrayNr=new int[n];
        int[] ArrayCastig=new int[n];
        for(int i=0;i<n;i++){
            ArrayNr[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            double NewRand=Math.random();
            ArrayCastig[i]=(int)(NewRand*k);
        }
        for(int i=0;i<n;i++){
            System.out.print(ArrayCastig[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("introduceti categorial la care vrei sa jucati:");
        int n=scanner.nextInt();
        int k=scanner.nextInt();

        double sansa=SansaCastig(n,k);
        System.out.println("sansa dumneavoastra este de:"+sansa);
        System.out.println("doriti sa continuati?");
        System.out.println("1-continui");
        System.out.println("2-renunt");
        System.out.print("Raspuns:");
        int raspuns=scanner.nextInt();

        if(raspuns==1){
            IntroducereNumere(n,k);
        }else{
            System.out.println("Multumim");
        }

        scanner.close();
    }

}
