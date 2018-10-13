// This is a generated file. Not intended for manual editing.
package nl.p4lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface P4ActionProfileDeclaration extends PsiElement {

  @NotNull
  P4ActionProfileName getActionProfileName();

  @NotNull
  P4ActionSpecification getActionSpecification();

  @Nullable
  P4ConstValue getConstValue();

  @Nullable
  P4SelectorName getSelectorName();

}
