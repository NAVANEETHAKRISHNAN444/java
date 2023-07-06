import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of persons ");
        int person=sc.nextInt();
        System.out.println("enter the number of accounts ");
        int account=sc.nextInt();
        int[][] accounts=new int[person][account];
        for(int i=0;i<accounts.length;i++) {
            for(int j=0;j<accounts.length;j++) {
                accounts[i][j]=sc.nextInt();
                //System.out.println(accounts[i][j]);
            }
        }
        System.out.print(Findmax(accounts));

    }
    static int Findmax(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++) {
            int sum=0;
            for(int account=0;account<accounts.length;account++) {
                sum+=accounts[person][account];
            }
            if(sum>max) max=sum;
        }
        return max;
    }
}