package day1;

public class TrebuchetCalibrator {

    public static Integer parseStringInput(String lineInput) {
        String digit1 = String.valueOf(findFirstDigitInString(lineInput));
        String digit2 = String.valueOf(findLastDigitInString(lineInput));

        return Integer.parseInt(digit1 + digit2);
    }

     public static Integer findFirstDigitInString(String s) {
        int i = 0;
        while (i < s.length() && !Character.isDigit(s.charAt(i))) {
            if (Character.isDigit(s.charAt(i))) break;
            i++;
        }
        int j = i;
        while (j < s.length() && Character.isDigit(s.charAt(j))) {
            j++;
        }
        return Integer.parseInt(s.substring(i, i+1));
    }

     public static Integer findLastDigitInString(String s) {
        int i = s.length()-1;
        while (i >= 0 && !Character.isDigit(s.charAt(i))) {
            if (Character.isDigit(s.charAt(i))) break;
            i--;
        }
        int j = i;
        while (j >= 0 && Character.isDigit(s.charAt(j))) {
            if (Character.isDigit(s.charAt(j))) break;
            j--;
        }

        return Integer.parseInt(s.substring(j, i+1));
    }
}
