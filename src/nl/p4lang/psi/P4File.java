package nl.p4lang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import nl.p4lang.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class P4File extends PsiFileBase {
    public P4File(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, P4Language.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return P4FileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "P4 File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}