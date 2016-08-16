import java.util.*;

/*
public class UndirectedGraphNode {
    int label = 0;
    UndirectedGraphNode left = null;
    UndirectedGraphNode right = null;
    ArrayList<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();

    public UndirectedGraphNode(int label) {
        this.label = label;
    }
}*/
public class Path {
    public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
        // write code here
        
			return check(a,b)||check(b,a);
    }
    
    public boolean check(UndirectedGraphNode a ,UndirectedGraphNode b)
        {
                if(a==b)
            {
            return true;
        }
        
        if(a==null||b==null)
            return false;
        
        Stack<UndirectedGraphNode> stack = new Stack<>();
        HashMap<UndirectedGraphNode,Boolean> map = new HashMap<>();
        
        stack.push(a);//��a��ʼ
        map.put(a,true);//��a��Ϊ�ѱ���״̬��
        
        while(!stack.empty())
            {
            UndirectedGraphNode currentnode = stack.pop();

			//������ڽӱ�����
            if(currentnode.neighbors!=null){
            for(int i = 0;i<currentnode.neighbors.size();i++)
                {
                UndirectedGraphNode node = currentnode.neighbors.get(i);
                
                if(node!=null)
                    {
                    if(node==b)
                        {
                        return true;
                    }
                    //���ջ��û�иõ��õ�û�б�����
                    if(map.get(node)==null||!map.get(node))
                        {
                        stack.push(node);
                        map.put(node,true);
                    }
                }
            }
            }
            
            
            
        }
        return false;
    }
}