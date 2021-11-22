public class HelloNumbers {

    public static void main(String[] args) {
        /*int x = 0, temp = 0;
        while (x < 10) {
            temp = temp + x;
            x++;
            System.out.print(temp + " ");
        }*/
        //drawTriangle();

        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a,n);
    }


    public static void drawTriangle() {
        for (int i = 1; i < 6; i++) {
            int temp = i;
            while (temp > 0) {
                System.out.print("*");
                temp--;
            }
            System.out.println("");
        }
    }

    public static int[] windowPosSum(int[] a, int n) {
        if (a == null || a .length == 0 || n <= 0) {return null;}
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {continue;}
            int sum = 0;
            for (int j = 0; j <= n; j++) {
                if (i+j < a.length) {
                    sum += a[i + j];
                }
            }
            a[i] = sum;
        }
        return a;
    }
}
