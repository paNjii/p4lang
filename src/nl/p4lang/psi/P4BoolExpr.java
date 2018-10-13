// This is a generated file. Not intended for manual editing.
package nl.p4lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface P4BoolExpr extends PsiElement {

  @NotNull
  List<P4BoolExpr> getBoolExprList();

  @Nullable
  P4BoolOp getBoolOp();

  @NotNull
  List<P4Exp> getExpList();

  @Nullable
  P4HeaderRef getHeaderRef();

  @Nullable
  P4RelOp getRelOp();

}
