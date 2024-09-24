public class Lab3 {
    public static void main(String[] args) {

        nozzle();
        Seperator();
        bodyUP();
        bodyDOWN();
        Seperator();
        bodyDOWN();
        bodyUP();
        Seperator();
        nozzle();
        System.out.println();

        System.out.println("One of my initials:");
        test();
    }


    public static void nozzle(){
        for(int j = 0; j < 5; j++) {
            for(int i =8; i >= 5 + j; i--){
                System.out.print(" ");
            }
            System.out.print(" ");
            for (int i = 0; i < 1 + j; i++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int i = 0; i < 1 + j; i++) {
                System.out.print("\\");
            }

            System.out.println();
        }
    }

    public static void Seperator(){
        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }
    public static void bodyUP(){
        for(int j = 0; j < 3; j++) {
            System.out.print("|");
            for (int i = 3; i >= 2 + j; i--) {
                System.out.print(".");
            }
            for (int i = 0; i < 1 + j; i++) {
                System.out.print("/\\");
            }
            for (int i = 3; i >= 2 + j; i--) {
                System.out.print(".");
            }
            for (int i = 3; i >= 2 + j; i--) {
                System.out.print(".");
            }
            for (int i = 0; i < 1 + j; i++) {
                System.out.print("/\\");
            }
            for (int i = 3; i >= 2 + j; i--) {
                System.out.print(".");
            }

            System.out.println("|");
        }

    }


    public static void bodyDOWN() {
        for (int j = 0; j < 3; j++) {
            System.out.print("|");
            for (int i = 0; i <= -1 + j; i++) {
                System.out.print(".");
            }
            for (int i = 4; i > 1 + j; i--) {
                System.out.print("\\/");
            }
            for (int i = 0; i <= -1 + j; i++) {
                System.out.print(".");
            }
            for (int i = 0; i <= -1 + j; i++) {
                System.out.print(".");
            }
            for (int i = 4; i > 1 + j; i--) {
                System.out.print("\\/");
            }
            for (int i = 0; i <= -1 + j; i++) {
                System.out.print(".");
            }
            System.out.println("|");
        }
    }

    public static void test() {
        for (int j = 0; j < 5; j++) {
            System.out.print("*****");
            System.out.print("        ");
            System.out.print("*****");
            System.out.println();
        }
        for (int j = 0; j < 2; j++) {
            System.out.print("******************");
            System.out.println();
        }
        for (int j = 0; j < 5; j++) {
            System.out.print("*****");
            System.out.print("        ");
            System.out.print("*****");
            System.out.println();


        }

    }

}

