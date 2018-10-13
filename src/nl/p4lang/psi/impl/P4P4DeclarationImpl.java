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

public class P4P4DeclarationImpl extends ASTWrapperPsiElement implements P4P4Declaration {

  public P4P4DeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull P4Visitor visitor) {
    visitor.visitP4Declaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof P4Visitor) accept((P4Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public P4ActionFunctionDeclaration getActionFunctionDeclaration() {
    return findChildByClass(P4ActionFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public P4ActionProfileDeclaration getActionProfileDeclaration() {
    return findChildByClass(P4ActionProfileDeclaration.class);
  }

  @Override
  @Nullable
  public P4ActionSelectorDeclaration getActionSelectorDeclaration() {
    return findChildByClass(P4ActionSelectorDeclaration.class);
  }

  @Override
  @Nullable
  public P4CalculatedFieldDeclaration getCalculatedFieldDeclaration() {
    return findChildByClass(P4CalculatedFieldDeclaration.class);
  }

  @Override
  @Nullable
  public P4ControlFunctionDeclaration getControlFunctionDeclaration() {
    return findChildByClass(P4ControlFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public P4CounterDeclaration getCounterDeclaration() {
    return findChildByClass(P4CounterDeclaration.class);
  }

  @Override
  @Nullable
  public P4FieldListCalculationDeclaration getFieldListCalculationDeclaration() {
    return findChildByClass(P4FieldListCalculationDeclaration.class);
  }

  @Override
  @Nullable
  public P4FieldListDeclaration getFieldListDeclaration() {
    return findChildByClass(P4FieldListDeclaration.class);
  }

  @Override
  @Nullable
  public P4HeaderTypeDeclaration getHeaderTypeDeclaration() {
    return findChildByClass(P4HeaderTypeDeclaration.class);
  }

  @Override
  @Nullable
  public P4InstanceDeclaration getInstanceDeclaration() {
    return findChildByClass(P4InstanceDeclaration.class);
  }

  @Override
  @Nullable
  public P4MeterDeclaration getMeterDeclaration() {
    return findChildByClass(P4MeterDeclaration.class);
  }

  @Override
  @Nullable
  public P4ParserExceptionDeclaration getParserExceptionDeclaration() {
    return findChildByClass(P4ParserExceptionDeclaration.class);
  }

  @Override
  @Nullable
  public P4ParserFunctionDeclaration getParserFunctionDeclaration() {
    return findChildByClass(P4ParserFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public P4RegisterDeclaration getRegisterDeclaration() {
    return findChildByClass(P4RegisterDeclaration.class);
  }

  @Override
  @Nullable
  public P4TableDeclaration getTableDeclaration() {
    return findChildByClass(P4TableDeclaration.class);
  }

  @Override
  @Nullable
  public P4ValueSetDeclaration getValueSetDeclaration() {
    return findChildByClass(P4ValueSetDeclaration.class);
  }

}
