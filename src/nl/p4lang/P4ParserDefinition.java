package nl.p4lang;

import com.intellij.lang.*;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.psi.tree.*;
import nl.p4lang.parser.P4Parser;
import nl.p4lang.psi.*;
import nl.p4lang.psi.P4File
import org.apache.xmlbeans.XmlCursor;
import org.jetbrains.annotations.NotNull;

public class P4ParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(P4Types.COMMENT);

    public static final IFileElementType FILE = new IFileElementType(P4Language.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new P4LexerAdapter();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new P4Parser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new P4File(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return P4Types.Factory.createElement(node);
    }
}
