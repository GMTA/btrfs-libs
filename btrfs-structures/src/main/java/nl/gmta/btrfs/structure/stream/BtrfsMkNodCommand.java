package nl.gmta.btrfs.structure.stream;

public class BtrfsMkNodCommand extends BtrfsDeviceCommand {
    public BtrfsMkNodCommand(BtrfsCommandHeader header, String path, long inode, long rdev, long mode) {
        super(header, path, inode, rdev, mode);
    }
}
