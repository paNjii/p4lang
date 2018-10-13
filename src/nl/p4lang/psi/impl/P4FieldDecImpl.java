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

public class P4FieldDecImpl extends ASTWrapperPsiElement implements P4FieldDec {

  public P4FieldDecImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull P4Visitor visitor) {
    visitor.visitFieldDec(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof P4Visitor) accept((P4Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public P4BitWidth getBitWidth() {
    return findNotNullChildByClass(P4BitWidth.class);
  }

  @Override
  @Nullable
  public P4FieldMod getFieldMod() {
    return findChildByClass(P4FieldMod.class);
  }

  @Override
  @NotNull
  public P4FieldName getFieldName() {
    return findNotNullChildByClass(P4FieldName.class);
  }

}
