import java.util.*;

public class Joseph {
    public int getResult(int n, int m) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            list.add(i+1);
        }
        int flag = 0;//�����ж��Ƿ���Ҫ����
        int index = 0;//list������
        while(list.size()!=1){
            
            flag++;
            if(flag == m){
                list.remove(index);
                index--;
                flag = 0;//���ü�����
            }
            
            if(index==(list.size()-1)){//�������һλ����ô����index
                index = 0;
            }else{
                index++;
            }
            
        }
        
        return list.get(0);
    }
}