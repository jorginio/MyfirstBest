public class Problem6 {

    public static void main(String[] args) {

        System.out.print("Number \t" + "Cube\n"  );

        for (int a = 1; a <= 15; a++) {

            System.out.println(a );
            System.out.println(cube(a));


        }
    }

        public static int cube(int a){

            int b = a * a * a;
            a++;

            return b;


        }



}

