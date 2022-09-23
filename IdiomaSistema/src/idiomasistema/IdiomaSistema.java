package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) throws Exception {
        Locale loc = Locale.getDefault();
        System.out.print("Seu sistema está em ");
        System.out.println(loc.getDisplayLanguage());
    }
}
