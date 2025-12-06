public class Main {

    public static void main(String[] args) {
        Main obj = new Main();

        boolean result = obj.palindrome("dummud");
        System.out.println(result);
    }

    public boolean palindrome(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }
}