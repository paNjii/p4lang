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

public class P4ActionProfileDeclarationImpl extends ASTWrapperPsiElement implements P4ActionProfileDeclaration {

  public P4ActionProfileDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull P4Visitor visitor) {
    visitor.visitActionProfileDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof P4Visitor) accept((P4Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public P4ActionProfileName getActionProfileName() {
    return findNotNullChildByClass(P4ActionProfileName.class);
  }

  @Override
  @NotNull
  public P4ActionSpecification getActionSpecification() {
    return findNotNullChildByClass(P4ActionSpecification.class);
  }

  @Override
  @Nullable
  public P4ConstValue getConstValue() {
    return findChildByClass(P4ConstValue.class);
  }

  @Override
  @Nullable
  public P4SelectorName getSelectorName() {
    return findChildByClass(P4SelectorName.class);
  }

}
