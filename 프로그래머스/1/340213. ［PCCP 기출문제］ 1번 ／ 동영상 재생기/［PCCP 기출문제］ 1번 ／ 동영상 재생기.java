// "prev", "next"를 수행하기 전과 후에 현재 위치가 오프닝 구간에 속해있다면 무조건 오프닝 종료 지점으로 이동

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLen_S = toS(video_len);
        int pos_S = toS(pos);
        int op_start_S = toS(op_start);
        int op_end_S = toS(op_end);
        
        
        for(String c : commands) {
            pos_S = checkOp(pos_S,op_start_S,op_end_S)? op_end_S : pos_S;
            
            pos_S = (c.equals("next"))? Math.min(pos_S + 10, videoLen_S)
                                        : Math.max(pos_S - 10, 0); 
            
            pos_S = checkOp(pos_S,op_start_S,op_end_S)? op_end_S : pos_S;
        }
        
        return toTime(pos_S);
    }
    
    static boolean checkOp(int pos_S, int start, int end) {
        return (pos_S <= end && pos_S >= start);
    }
    
    // String 문자 형식을 s단위로 변환
    static int toS(String time) {
        String[] tmp = time.split(":");
        return Integer.parseInt(tmp[0]) * 60 + Integer.parseInt(tmp[1]);
    }
    
    // s단위를 return 할 시간 형식(String)으로 변환
    static String toTime(int time) {
        int m = time / 60;
        int s = time % 60;
        
        return String.format("%02d:%02d", m, s);
    }
}

