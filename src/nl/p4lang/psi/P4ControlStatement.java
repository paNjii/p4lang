// This is a generated file. Not intended for manual editing.
package nl.p4lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface P4ControlStatement extends PsiElement {

  @Nullable
  P4ApplyAndSelectBlock getApplyAndSelectBlock();

  @Nullable
  P4ApplyTableCall getApplyTableCall();

  @Nullable
  P4ControlFnName getControlFnName();

  @Nullable
  P4IfElseStatement getIfElseStatement();

}
