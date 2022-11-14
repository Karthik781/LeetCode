class Solution {
    public boolean isValidSerialization(String preorder) {
    String[] nodes = preorder.split(",");
    int diff = -1;
        
    for (String node: nodes) {
        if (++diff > 0) return false; //inbound is 1 for all nodes(root adjusted to -1)
        if (!node.equals("#")) diff -= 2;// outbound is 2 for all non-leafs
        }
    return diff == 0; 
    }
}