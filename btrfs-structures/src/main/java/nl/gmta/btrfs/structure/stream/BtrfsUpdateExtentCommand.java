package nl.gmta.btrfs.structure.stream;

public class BtrfsUpdateExtentCommand extends BtrfsStreamCommand {
    private final String path;
    private final long fileOffset;
    private final long size;

    public BtrfsUpdateExtentCommand(BtrfsStreamCommandHeader header, String path, long fileOffset, long size) {
        super(header);

        this.path = path;
        this.fileOffset = fileOffset;
        this.size = size;
    }

    public String getPath() {
        return this.path;
    }

    public long getFileOffset() {
        return this.fileOffset;
    }

    public long getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return String.format(
            "%s{header=%s path='%s' fileOffset=%d size=%d}",
            this.getClass().getSimpleName(),
            this.header,
            this.path,
            this.fileOffset,
            this.size
        );
    }
}