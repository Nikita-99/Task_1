public class Zad5 {
    public static void main(String[]args){
        System.out.println(operation(24,15,9));
    }

    private static String operation(int N, int a, int b){
        if (a+b==N){
            return "added";
        }
        else if (a-b==N){
            return "subtracted";
        }
        else if (a*b==N){
            return "multiply";
        }
        else if (a/b==N){
            return "share";
        }
        else {
            return "none";
        }
    }
}
