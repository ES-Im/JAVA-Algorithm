import java.util.*;

class Solution {
    public int solution(int[] money) {

        int len = money.length;
        
        
        int[] dpF = new int[len]; // 첫번째집(0)을 털경우 누적
        dpF[0] = money[0];
        dpF[1] = dpF[0];
        
        int[] dpS = new int[len]; // 두번째집(1)을 털경우 누적
        dpS[0] = 0;
        dpS[1] = money[1];
        
        for(int i = 2; i < len; i++) {

            dpS[i] = Math.max(dpS[i-1], dpS[i-2] + money[i]);
            
            if(i == len - 1) continue;             // 첫번째 집 털때는 마지막집 못텀
            dpF[i] = Math.max(dpF[i-1], dpF[i-2] + money[i]);   // i 번째 집을 털때 이득 vs 아닐때의 이득
            
        }

        
        return (dpF[len-2] > dpS[len-1])? dpF[len-2] : dpS[len-1];
    }
}
