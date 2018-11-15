public class Main {

    public static void main(String[] args) {

//task 1
        int[] m = {0,1,1,0,1,1,0,1,0,0};

        for (int i = 0; i < m.length; i++) {
            if (m[i] == 1)
                m[i] = 0;
            else
                m[i] = 1;
        }

//task 2

        int[] m2 = new int[8];

        for (int i = 0; i <m2.length ; i++) {
            m2[i] = i*3;
        }

//task 3
        int[] m3 = {1,5,3,2,11,4,5,2,4,8,9,1};

        for (int i = 0; i <m3.length ; i++) {
            if (m3[i] < 6)
                m3[i] *= 2;
            //System.out.println(m3[i]);
        }
//task 4
        int [][] m4 = new int[5][5];
        for (int i = 0; i <m4.length ; i++) {
            for (int j = 0; j < m4[i].length; j++) {
                if (i==j)
                {
                    m4[i][j] = 1;
                    //break;

                }
              //  System.out.print(m4[i][j]);
            }
         //   System.out.println();
        }


//task 5
        int[] m5 = {0,5,3,2,11,4,5,2,7,8,9,1,15,3,6,4,-1};
        int max=0;
        int min=0;

        for (int i = 0; i < m5.length; i++) {
            if (m5[i] > max)
                max = m5[i];
            if (m5[i] < min)
                min = m5[i];
        }
        //System.out.println(max);
       // System.out.println(min);


//task 6
        int[] m6 = {1,1,1,2,10,-1,-2,-2};
        task6(m6);

//task 7
        int[] m7 = {1,5,3,2,11,4,5,2,7,8,9,1,15,3,6,4,-1};
        task7(m7,-8);
    }

     static boolean task6(int[] m6)
    {
        int sum_left=0;
        int sum_right=0;
        for (int i = 0; i <m6.length ; i++) {

             sum_left=0;
             sum_right=0;

            for (int j = 0; j <i; j++) {
                sum_left +=m6[j];
            }

            for (int j = i; j <m6.length ; j++) {
                sum_right +=m6[j];
            }

            if (sum_left == sum_right)
            {
              //  System.out.println("index " + i);
                return true;
            }

        }
        return false;

    }

    static void task7(int[] m7, int n)
    {
        if (n>0)
        {
            for (int i = m7.length-1; i >=0; i--) {
                if (i >= n)
                    m7[i] = m7[i-n];
                else
                    m7[i] = 0;
            }
        }
        else
        { int tm = Math.abs(n);
            for (int i = 0; i < m7.length; i++) {
                if (i<(m7.length-tm))
                    m7[i] = m7[i+tm];
                else
                    m7[i] = 0;
            }
        }

        for (int i = 0; i < m7.length; i++) {
            System.out.print(m7[i]+",");
        }


    }

}




