// This is a generated file. Not intended for manual editing.
package nl.p4lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface P4ParserFunctionBody extends PsiElement {

  @NotNull
  List<P4ExtractOrSetStatement> getExtractOrSetStatementList();

  @NotNull
  P4ReturnStatement getReturnStatement();

}
