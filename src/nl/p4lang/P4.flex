package nl.p4lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static nl.p4lang.psi.P4Types.*;

%%

%{
  public _P4Lexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _P4Lexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "last"             { return LAST; }
  "current"          { return CURRENT; }
  "value"            { return VALUE; }


}

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return P4Types.COMMENT; }

[^] { return BAD_CHARACTER; }
