public class Arrays {

    public static void main(String[] args)
    {
        System.out.println("=====================2d Arrays=================");
        // 2d arrays  --> Multidimenstional array
        int[][] my2darray = new int[][]
                {
                        {10,12,43,22},
                        {20,56,58,96},
                        {40,565,66,8},
                        {15,58,79,52},
                        {58,96,36,74},
                        {58,96,36,74,25}
                };

        for(int i = 0; i < my2darray.length; i++) {
            for(int j = 0; j < my2darray[i].length; j++ ) {
                System.out.println(my2darray[i][j] +",");
                System.out.println(my2darray[1][3]);
                System.out.println(my2darray[2][3]);
            }
        }

        System.out.println(my2darray.length);
         System.out.println(my2darray[0].length);
  System.out.println(my2darray[1].length);
         System.out.println(my2darray[2].length);
         System.out.println(my2darray[3].length);
         System.out.println(my2darray[4].length);
         System.out.println(my2darray[5].length);
    }
}
