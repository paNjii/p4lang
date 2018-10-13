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

public class P4BoolExprImpl extends ASTWrapperPsiElement implements P4BoolExpr {

  public P4BoolExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull P4Visitor visitor) {
    visitor.visitBoolExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof P4Visitor) accept((P4Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<P4BoolExpr> getBoolExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, P4BoolExpr.class);
  }

  @Override
  @Nullable
  public P4BoolOp getBoolOp() {
    return findChildByClass(P4BoolOp.class);
  }

  @Override
  @NotNull
  public List<P4Exp> getExpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, P4Exp.class);
  }

  @Override
  @Nullable
  public P4HeaderRef getHeaderRef() {
    return findChildByClass(P4HeaderRef.class);
  }

  @Override
  @Nullable
  public P4RelOp getRelOp() {
    return findChildByClass(P4RelOp.class);
  }

}
