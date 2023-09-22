package arrayProgram;

public class AccountCalculator {
    public static void main(String[] args) {
        int[][] account = {
                {10 , 20 , 50 , 70 , 10, 10},
                {100 , 50 , -60 , 70  },
                {80 , -50 , 100 , -10}
        };
        int maxSum = 0 ; int frd = 0 ;

        for (int i =0 ; i<account.length ; i++)
        {
            int sum = 0 ;
            for (int j =0 ; j<account[i].length ; j++)
            {
                sum += account[i][j] ;
            }
            if (sum>maxSum)
            {
                maxSum = sum ;
                frd = i+1 ;
            }
        }

        System.out.println("frd "+frd +" --> "+maxSum);
    }
}
