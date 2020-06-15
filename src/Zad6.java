public class Zad6 {
    public static void main(String[]args){
        System.out.println(ctoa("A"));
    }
    public static int ctoa(String i){
        int str = i.codePointAt(0);
        return  str;
    }
}
