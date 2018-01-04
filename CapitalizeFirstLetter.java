import java.util.StringTokenizer;
public class CapitalizeFirstLetter {
    public String toUpper(String phrase) {
        String token = null;
        String[] tokenArray = null;
        StringBuffer stringBuffer = new StringBuffer();
        StringTokenizer stringTokenizer = new StringTokenizer( phrase );
        while (stringTokenizer.hasMoreTokens()) {
            token = stringTokenizer.nextToken();
            tokenArray = new String[token.length()];
            for (int i = 0; i < token.length(); i++) {
                if (i == 0) {
                    tokenArray[i] = String.valueOf( token.charAt( i ) ).toUpperCase();
                } else {

                    tokenArray[i] = String.valueOf( token.charAt( i ) );

                }
                stringBuffer.append( tokenArray[i] );
            }
            stringBuffer.append( " " );
        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        CapitalizeFirstLetter test = new CapitalizeFirstLetter();
        System.out.println( test.toUpper( "a cow " +
                "jumped over the moon" ) );
    }
}

