import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    Integer offset;

    ROT13(Character cs, Character cf) {
        offset = cf - cs;
    }

    ROT13() {
        offset = 0;
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return "";
    }

    public String encrypt(String text) {
        char[] chars = text.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(char x : chars){
            if(Character.isLetter(x)){
                if(Character.isUpperCase(x)){
                    x += offset;
                    if(x > 'Z') x -= 26;
                    stringBuilder.append(x);
                } else {
                    x += offset;
                    if(x > 'z') x -= 26;
                    stringBuilder.append(x);
                }
            } else {
                stringBuilder.append(x);
            }
        }
        return stringBuilder.toString();
    }

    public String decrypt(String text) {
        Integer holdOffeset = offset;
        offset = 26 - offset;
        String answer = encrypt(text);
        offset = holdOffeset;
        return answer;
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
