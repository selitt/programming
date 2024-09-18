public class Main {
    public static void main(String[] args) {
        int a = 111;
        String str = "";
        while (a > 0){
            str = a % 2 + str;
            a /= 2;

        }
        System.out.println(str);
    }
}