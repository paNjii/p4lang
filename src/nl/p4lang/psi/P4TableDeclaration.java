// This is a generated file. Not intended for manual editing.
package nl.p4lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface P4TableDeclaration extends PsiElement {

  @NotNull
  List<P4ConstValue> getConstValueList();

  @NotNull
  List<P4FieldMatch> getFieldMatchList();

  @NotNull
  P4TableActions getTableActions();

  @NotNull
  P4TableName getTableName();

}
