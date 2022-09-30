package elementary.array;

import java.util.ArrayList;
import java.util.List;

public class YangHuiTriangle {
    public List<List<Integer>> generate(int numRows) {
        if(numRows < 1)
            return null;
        List<List<Integer>> tri = new ArrayList<List<Integer>>();
        for(int i = 0; i < numRows; ++i){
            List<Integer> row = new ArrayList<Integer>();
            for(int j = 0; j <= i; ++j){
                if(j == 0 || i == j){
                    row.add(1);
                }else{
                    row.add(tri.get(i-1).get(j-1)+tri.get(i-1).get(j));
                }
            }
            tri.add(row);
        }
        return tri;
    }

}
