package nl.p4lang.psi;

import com.intellij.psi.tree.IElementType;
import nl.p4lang.P4Language;
import org.jetbrains.annotations.*;

public class P4TokenType extends IElementType {
    public P4TokenType(@NotNull @NonNls String debugName) {
        super(debugName, P4Language.INSTANCE);
    }

    @Override
    public String toString() {
        return "P4TokenType." + super.toString();
    }
}
