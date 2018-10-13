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

public class P4HeaderDecBodyImpl extends ASTWrapperPsiElement implements P4HeaderDecBody {

  public P4HeaderDecBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull P4Visitor visitor) {
    visitor.visitHeaderDecBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof P4Visitor) accept((P4Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public P4ConstValue getConstValue() {
    return findChildByClass(P4ConstValue.class);
  }

  @Override
  @NotNull
  public P4FieldDec getFieldDec() {
    return findNotNullChildByClass(P4FieldDec.class);
  }

  @Override
  @Nullable
  public P4LengthExp getLengthExp() {
    return findChildByClass(P4LengthExp.class);
  }

}
