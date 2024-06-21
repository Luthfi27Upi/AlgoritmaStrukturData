    public class Main {
        static int myMethod(int i, int j){
        if (i==0)
        return 0;
        else
        return myMethod(i/j, j);
        }
        public static void main(String[] args) { System.out.println(myMethod(6,3));
        }
        }