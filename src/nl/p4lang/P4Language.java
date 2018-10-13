package nl.p4lang;

import com.intellij.lang.Language;

public class P4Language extends Language {
    public static final P4Language INSTANCE = new P4Language();

    private P4Language() {
        super("P4Language");
    }
}
