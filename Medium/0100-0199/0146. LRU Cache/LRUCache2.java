class LRUCache2 {
    //0 <= key <= 10000
    public int cap,n;//容量，总量
    public DoubleLinkedList phead,ptail;//双链表
    public DoubleLinkedList hash[];//哈希表

    public LRUCache2(int capacity) {
        this.cap=capacity;
        this.n=0;
        hash=new DoubleLinkedList[10001];// //0 <= key <= 10000
        phead=new DoubleLinkedList(-1,0);
        ptail=new DoubleLinkedList(-2,0);
        phead.next=ptail;
        ptail.prev=phead;//双链表头尾相连

    }

    public int get(int key) {
        DoubleLinkedList node=hash[key];
        if(node==null){
            return -1;//返回-1
        }
        movefront(node);//往前增加一次
        return node.val;//返回数据
    }

    public void put(int key, int value) {
        DoubleLinkedList node=hash[key];
        if(node==null){
            if(n==cap){
                node=ptail.prev;
                hash[node.key]=null;
                hash[key]=node;//保存节点
                node.key=key;
                node.val=value;
                movefront(node);//删除节点


            }else{
                node=new DoubleLinkedList(key,value);//构造节点
                hash[key]=node;//标记
                addfront(node);//增加节点
                n++;//节点计数

            }


        }else{
            node.val=value;//赋值操作
            movefront(node);//往后移动
        }

    }
    public void movefront(DoubleLinkedList  node){//删除节点
        node.prev.next=node.next;//删除node,跳过node
        node.next.prev=node.prev;//删除node，跳过node
        addfront(node);//新增

    }
    public void addfront(DoubleLinkedList  node){//追加节点
        node.prev=phead;
        node.next=phead.next;
        phead.next.prev=node;
        phead.next=node;//前后关联

    }

    public class DoubleLinkedList{
        int key;
        int val;
        DoubleLinkedList prev;//指向上一个
        DoubleLinkedList next;//指向下一个
        public DoubleLinkedList(int key,int val){
            this.key=key;
            this.val=val;
            this.prev=null;//上一个
            this.next=null;//下一个
        }
    }
}
