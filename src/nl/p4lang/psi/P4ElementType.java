package nl.p4lang.psi;

import com.intellij.psi.tree.IElementType;
import nl.p4lang.P4Language;
import org.jetbrains.annotations.*;

public class P4ElementType extends IElementType {
    public P4ElementType(@NotNull @NonNls String debugName) {
        super(debugName, P4Language.INSTANCE);
    }
}
