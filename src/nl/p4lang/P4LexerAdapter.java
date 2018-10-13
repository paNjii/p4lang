package nl.p4lang;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class P4LexerAdapter extends FlexAdapter {
    public P4LexerAdapter() {
        super(new _P4Lexer((Reader) null));
    }
}

