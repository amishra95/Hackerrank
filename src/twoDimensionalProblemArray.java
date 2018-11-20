public class Solution { public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[][] a = new int[6][6];
    for(int i =0; i<6; i++){
        for(int j=0; j<6; j++){
            a[i][j] = sc.nextInt();
        }

    }

    int sum =Integer.MIN_VALUE;
     for(int i =0; i<4; i++){
        for(int j=0; j<4; j++){
           int temp = a[i][j] + a[i][j+1] +a[i][j+2] +a[i+1][j+1] +a[i+2][j] +a[i+2][j+1] + a[i+2][j+2];
            if(temp>sum){
                sum = temp;
            }
        }

    }

    System.out.println(sum);

    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
}
