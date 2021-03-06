package nl.gmta.btrfs.structure.stream;

public abstract class BtrfsDeviceCommand extends BtrfsInodeCommand {
    protected final long rdev;
    protected final long mode;

    BtrfsDeviceCommand(BtrfsCommandHeader header, String path, long inode, long rdev, long mode) {
        super(header, path, inode);

        this.rdev = rdev;
        this.mode = mode;
    }

    public long getRdev() {
        return this.rdev;
    }

    public long getMode() {
        return this.mode;
    }

    @Override
    public String toString() {
        return String.format(
            "%s{header=%s path='%s' inode=%d rdev=%d mode=%d}",
            this.getClass().getSimpleName(),
            this.header,
            this.path,
            this.inode,
            this.rdev,
            this.mode
        );
    }
}
