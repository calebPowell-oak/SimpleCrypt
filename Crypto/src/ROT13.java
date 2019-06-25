import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return "";
    }

    public String encrypt(String text) {
        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        char[] result = new char[chars.length];
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == c){
                for(int j = i; j < chars.length; j++){
                    result[j - i] = chars[j];
                }
                for(int j = chars.length - i; j < result.length; j++){
                    result[j] = chars[j-i];
                }
                break;
            }
        }
        stringBuilder.append(result);
        return stringBuilder.toString();
    }

}
