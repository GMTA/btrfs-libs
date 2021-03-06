package nl.gmta.btrfs.structure.stream;

import java.util.Objects;

public class BtrfsWriteCommand extends BtrfsStreamCommand {
    private final String path;
    private final long fileOffset;
    private final byte[] data;

    public BtrfsWriteCommand(BtrfsCommandHeader header, String path, long fileOffset, byte[] data) {
        super(header);

        this.path = Objects.requireNonNull(path);
        this.fileOffset = fileOffset;
        this.data = Objects.requireNonNull(data);
    }

    public String getPath() {
        return this.path;
    }

    public long getFileOffset() {
        return this.fileOffset;
    }

    public byte[] getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return String.format(
            "%s{header=%s path='%s' fileOffset=%d data=[%d bytes]}",
            this.getClass().getSimpleName(),
            this.header,
            this.path,
            this.fileOffset,
            this.data.length
        );
    }
}
