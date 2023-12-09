package Class11;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Task5 {
    public static void main(String[] args) {
        String stc="Today is Saturday";

        for (int i=0; i <stc.length();i++){
            if (stc.charAt(i)=='a'){
                System.out.println(i);
            }
        }
    }
}
