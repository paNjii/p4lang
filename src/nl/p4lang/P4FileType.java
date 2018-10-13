package nl.p4lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class P4FileType extends LanguageFileType {
    public static final P4FileType INSTANCE = new P4FileType();

    private P4FileType() {
        super(P4Language.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "P4 file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "P4 language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "p4";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return P4Icons.FILE;
    }
}