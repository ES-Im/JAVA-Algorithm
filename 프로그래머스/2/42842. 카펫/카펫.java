// yellow = 가로 - 2 세로 - 2
// 세로 최소 = 3 / 가로 최소 = 3
// yellow 영역 = x(가로) * x(세로) 또는  x*(x+1)
// height로 반복문 시작 : (brown + yellow) / height == width로 설정하여 탐색
// if문으로 width > height이고 (yello.width = width - 2)(yellow.height = height - 2) 일 경우 return

class Solution {
    
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];  // [width, height]
        
        for(int height = 3; height < (brown + yellow); height++) {
            int width = (brown + yellow) / height;
            
            if(width >= height && (width - 2) * (height - 2) == yellow) {
                answer[0] = width;
                answer[1] = height;
                
                return answer;
            }
        }
        
        return null;
    }
}

