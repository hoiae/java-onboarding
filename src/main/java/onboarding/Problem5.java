package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        //50000,10000,5000,1000,500,100,50,10,1
        //List<Integer> answer = Collections.emptyList();
        List<Integer> answer = new ArrayList<>();
        int[] bill = {50000,10000,5000,1000,500,100,50,10,1};
        int cnt = 0;
        for(int i = 0; i < bill.length; i++){
            cnt = money/bill[i];
            money %= bill[i];
            answer.add(cnt);
        }
        return answer;
    }
}
