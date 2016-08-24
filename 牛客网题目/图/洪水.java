import java.util.*;

//ʹ��BFS�����
public class Flood {
    public int floodFill(int[][] map, int n, int m) {
        // write code here
        if(m==0||map[0].length==0){
            return 0;
        }
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0,0));
        Point p;
        int x,y;
        while(!queue.isEmpty()){//QUEUE�д洢����һ������ڽӵ�
            p = queue.poll();
            x = p.x;
            y = p.y;
           		
            if (x == n - 1 && y == m - 1){//����õ������ֱ�ӷ���
                return map[x][y];
			}
			if (x + 1 < n&&map[x+1][y]==0){//�ұߵĽڵ�����ߣ�
				queue.add(new Point(x+1,y));//���ұ߽ڵ�������
				map[x + 1][y] = map[x][y] + 1;//��ʼ���ұ߽ڵ㡣ע�⣬���������жϵ�������map[x+1][y]==0��Ҳ����˵·��ͨ�ġ���һ�㺬�����������0��˵���߹��˻������ϰ�����1��
			}
            
            			
            if (y + 1 < m&&map[x][y+1]==0){//����Ľڵ㣬����˳���ܱ䣬��Ϊ����ʱ�䣬�϶��Ǵ��ұ߻��������ߣ�ֻ���߲�ͨ��ʱ�������ߺ�����
				queue.add(new Point(x,y+1));
				map[x][y + 1] = map[x][y] + 1;
			}

			if (x - 1 >= 0&&map[x-1][y]==0){//ͬ����߽ڵ�
				queue.add(new Point(x - 1, y));
				map[x - 1][y] = map[x][y] + 1;
			}

			if (y - 1 >= 0&&map[x][y-1]==0){//����Ľڵ�
				queue.add(new Point(x, y - 1));
				map[x][y - 1] = map[x][y] + 1;
			}
        }
        
        return 0;
    }
}
    
     
class Point{
    int x;
    int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
        }
    }