public class _707_Design_Linked_List {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);
        linkedList.get(1);
        linkedList.deleteAtIndex(1);
        linkedList.get(1);
        System.out.println("DEBUG");
    }

    static class MyLinkedList {
        public static class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
            }
        }

        Node head;

        /** Initialize your data structure here. */
        public MyLinkedList() {

        }

        /**
         * Get the value of the index-th node in the linked list. If the index is
         * invalid, return -1.
         */
        public int get(int index) {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                if (count == index) {
                    return temp.value;
                }
                count++;
                temp = temp.next;
            }
            return -1;
        }

        /**
         * Add a node of value val before the first element of the linked list. After
         * the insertion, the new node will be the first node of the linked list.
         */
        public void addAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                temp.next = head;
                head = temp;
            }

        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            }
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = temp;

        }

        /**
         * Add a node of value val before the index-th node in the linked list. If index
         * equals to the length of linked list, the node will be appended to the end of
         * linked list. If index is greater than the length, the node will not be
         * inserted.
         */
        public void addAtIndex(int index, int val) {
            Node newNode = new Node(val);
            Node tempPrev = head;
            Node temp = head;
            int count = 0;
            if (index == 0) {
                newNode.next = head;
                head = newNode;
                temp = null;
            }

            while (temp != null) {
                if (count == index) {

                    tempPrev.next = newNode;
                    newNode.next = temp;
                    break;
                } else if (temp.next == null && count == (index - 1)) {
                    temp.next = newNode;
                } else {
                    tempPrev = temp;
                    temp = temp.next;
                    count++;
                }

            }

            if (head == null && index == 0) {
                head = newNode;
            }

        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {

            if (index == 0) {
                head = head.next;
            } else {

                Node tempPrev = head;
                Node temp = head;
                int count = 0;
                while (temp != null) {

                    if (count == index) {
                        tempPrev.next = temp.next;
                        break;
                    } else {
                        tempPrev = temp;
                        temp = temp.next;
                        count++;
                    }

                }
            }

        }
    }

    /**
     * Your MyLinkedList object will be instantiated and called as such:
     * MyLinkedList obj = new MyLinkedList(); int param_1 = obj.get(index);
     * obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val);
     * obj.deleteAtIndex(index);
     */
}