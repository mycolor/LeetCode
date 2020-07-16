package 链表操作.q138_复制带随机指针的链表.f1;

import java.util.HashMap;

/**
 * 用Map存储遍历过的节点，时间o(n)，额外空间o(n)
 */
public class Solution {

    HashMap<Node, Node> visitedHash = new HashMap<Node, Node>();

    public Node copyRandomList(Node head) {

        if(head == null){
            return null;
        }
        if(this.visitedHash.containKey(head)){
            return visitedHash.get(head);
        }
        Node node = Node(head.val);
        visitedHash.put(head,node);
        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);
        return node;
    }


}