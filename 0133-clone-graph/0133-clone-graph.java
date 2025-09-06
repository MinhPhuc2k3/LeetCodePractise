/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return node;
        Map<Integer, Node> nodeMap = new HashMap<>(); 
        Node root = new Node(node.val, new ArrayList<>());
        nodeMap.put(root.val, root);
        buildGraph(root, node,nodeMap);
        return root;        
    }

    private void buildGraph(Node node, Node source, Map<Integer, Node> nodeMap){
        for(Node neighbor: source.neighbors){
            if(!nodeMap.containsKey(neighbor.val)){
                nodeMap.put(neighbor.val, new Node(neighbor.val, new ArrayList<>()));
               // node.neighbors.add(nodeMap.get(neighbor.val));
                buildGraph(nodeMap.get(neighbor.val), neighbor, nodeMap);
            }
            node.neighbors.add(nodeMap.get(neighbor.val));
        }
    }
}