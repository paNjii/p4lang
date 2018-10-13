// This is a generated file. Not intended for manual editing.
package nl.p4lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.p4lang.psi.P4Types.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.p4lang.psi.*;

public class P4ParserExceptionDeclarationImpl extends ASTWrapperPsiElement implements P4ParserExceptionDeclaration {

  public P4ParserExceptionDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull P4Visitor visitor) {
    visitor.visitParserExceptionDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof P4Visitor) accept((P4Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public P4ParserExceptionName getParserExceptionName() {
    return findNotNullChildByClass(P4ParserExceptionName.class);
  }

  @Override
  @NotNull
  public P4ReturnOrDrop getReturnOrDrop() {
    return findNotNullChildByClass(P4ReturnOrDrop.class);
  }

  @Override
  @NotNull
  public List<P4SetStatement> getSetStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, P4SetStatement.class);
  }

}
