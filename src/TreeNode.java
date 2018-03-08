
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcin on 08.03.2018.
 */
public class TreeNode {
    private String name;
    private List<TreeNode> children = new ArrayList<>();
    private List<TreeItem> items = new ArrayList<>();

    public String getName() {
        return name;
    }

    public TreeNode(String name) {

        this.name = name;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public List<TreeItem> getItems() {
        return items;
    }

    public void addChildNode(TreeNode node) {
        children.add(node);
    }

    public void addItem(TreeItem item) {
        items.add(item);
    }
}