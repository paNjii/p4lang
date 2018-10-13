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

public class P4FieldListCalculationDeclarationImpl extends ASTWrapperPsiElement implements P4FieldListCalculationDeclaration {

  public P4FieldListCalculationDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull P4Visitor visitor) {
    visitor.visitFieldListCalculationDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof P4Visitor) accept((P4Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public P4ConstValue getConstValue() {
    return findNotNullChildByClass(P4ConstValue.class);
  }

  @Override
  @NotNull
  public P4FieldListCalculationName getFieldListCalculationName() {
    return findNotNullChildByClass(P4FieldListCalculationName.class);
  }

  @Override
  @Nullable
  public P4FieldListName getFieldListName() {
    return findChildByClass(P4FieldListName.class);
  }

  @Override
  @NotNull
  public P4StreamFunctionAlgorithmName getStreamFunctionAlgorithmName() {
    return findNotNullChildByClass(P4StreamFunctionAlgorithmName.class);
  }

}
