package py_to_j;

public class arrays {
    public static void main(String[] args) {
        int[] age; // initialize
        age = new int[5]; // memory allocation
        // initialization
        age[0] = 100;
        age[1] = 80;
        age[2] = 60;
        age[3] = 40;
        age[4] = 20;

        // Declaration, memory allocation and initialization together
        //        int [] marks = {98, 45, 79, 99, 80};

        for(int i =0; i<age.length ; i++) {
            System.out.println(i);
            System.out.println(age[i]);
        }

        for (int element: age){
            System.out.println(element);
        }
        /*
        For multidimensional array:
        say 2d than, [][] first representing row and second representing columns
         */
        int[][] coordinates = {{1,2},{3,4},{5,6}};
        System.out.println(coordinates[0][1]);

    }
}
