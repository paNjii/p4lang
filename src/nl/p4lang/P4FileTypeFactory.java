package nl.p4lang;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class P4ileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(P4FileType.INSTANCE);
    }
}
