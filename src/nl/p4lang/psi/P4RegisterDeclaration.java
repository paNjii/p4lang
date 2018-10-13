// This is a generated file. Not intended for manual editing.
package nl.p4lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface P4RegisterDeclaration extends PsiElement {

  @Nullable
  P4AttributeList getAttributeList();

  @Nullable
  P4ConstValue getConstValue();

  @Nullable
  P4DirectOrStatic getDirectOrStatic();

  @NotNull
  P4RegisterName getRegisterName();

  @NotNull
  P4WidthDeclaration getWidthDeclaration();

}
