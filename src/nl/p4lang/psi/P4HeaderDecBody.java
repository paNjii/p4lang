// This is a generated file. Not intended for manual editing.
package nl.p4lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface P4HeaderDecBody extends PsiElement {

  @Nullable
  P4ConstValue getConstValue();

  @NotNull
  List<P4FieldDec> getFieldDecList();

  @Nullable
  P4LengthExp getLengthExp();

}
