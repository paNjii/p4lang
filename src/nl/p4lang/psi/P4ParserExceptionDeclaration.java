// This is a generated file. Not intended for manual editing.
package nl.p4lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface P4ParserExceptionDeclaration extends PsiElement {

  @NotNull
  P4ParserExceptionName getParserExceptionName();

  @NotNull
  P4ReturnOrDrop getReturnOrDrop();

  @NotNull
  List<P4SetStatement> getSetStatementList();

}
