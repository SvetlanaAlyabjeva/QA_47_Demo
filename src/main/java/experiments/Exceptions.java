package experiments;

public class Exceptions {
    public static void main(String[] args) {
        String[] strArray = {"str1", "str2", "str3"};
        uncheckedException(strArray);
    }

    private static void uncheckedException(String[] strArray) {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(strArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("create exception");
        }
        System.out.println("program is working");

    }
               private static void pause(){
        Thread.sleep(millis:3000);

    }
}
