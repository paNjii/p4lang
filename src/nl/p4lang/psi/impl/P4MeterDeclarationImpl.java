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

public class P4MeterDeclarationImpl extends ASTWrapperPsiElement implements P4MeterDeclaration {

  public P4MeterDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull P4Visitor visitor) {
    visitor.visitMeterDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof P4Visitor) accept((P4Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public P4DirectOrStatic getDirectOrStatic() {
    return findChildByClass(P4DirectOrStatic.class);
  }

  @Override
  @Nullable
  public P4FieldRef getFieldRef() {
    return findChildByClass(P4FieldRef.class);
  }

  @Override
  @NotNull
  public P4MeterName getMeterName() {
    return findNotNullChildByClass(P4MeterName.class);
  }

  @Override
  @NotNull
  public P4MeterType getMeterType() {
    return findNotNullChildByClass(P4MeterType.class);
  }

}
