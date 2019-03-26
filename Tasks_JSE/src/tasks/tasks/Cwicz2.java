package tasks.tasks;

public class Cwicz2 {
    public void run() {
        int temp;
        int[ ] bubble = new int[] {4, 3, 2, 5, 7, 1};
        System.out.println("Numbers in this array: ");

        for ( int i=0; i<bubble.length; i++) {
            System.out.println(bubble[i] + " ");
        }
            for (int i=0; i<bubble.length -1; i++) {
                for (int j=0; j<bubble.length -1; j++) {
                    if ( bubble[j] > bubble[j + 1]) {
                        temp = bubble[j];
                        bubble[j] = bubble[j +1];
                        bubble[j +1] = temp;
                    }
                }
            }
            System.out.println("Array after bubble sorting: ");
            for ( int i=0; i<bubble.length; i++) {
                System.out.println(bubble[i] + " ");
            }
        }





//        public static void bubbleSort ( int[] bubble) {
//            int n = bubble.length;
//            int temp = 0;
//
//            for (int i = 0; i < n; i++) {
//                for (int j = 1; j < (n - 1); j++) {
//
//                    if (bubble[j - 1] > bubble[j]) {
//                        temp = bubble[j - 1];
//                        bubble[j - 1] = bubble[j];
//                        bubble[j] = temp;
//                    }
//                }
//            }
//        }
    }
