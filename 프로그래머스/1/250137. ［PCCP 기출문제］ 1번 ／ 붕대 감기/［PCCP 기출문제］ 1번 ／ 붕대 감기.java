// bandage[시전시간, 초당회복량, 추가회복량] attacks[공격시간(누적)][피해량] 
class Solution {
    
    public int solution(int[] bandage, int health, int[][] attacks) {
       
        int currentTime = 0;
        int lastAttackTime = attacks[attacks.length - 1][0];
        int currentAttack = 0;
        int maxHP = health;
        int sequence = 0;
        
        while(currentTime <= lastAttackTime) {
            
            
            if(currentTime == attacks[currentAttack][0]) {
                
                health -= attacks[currentAttack][1];
                currentAttack++;
                sequence = 0;
                
                if(health <= 0) return -1;
                
            } else {
                
                sequence++;
                health = checkHP(health, bandage[1], maxHP);
                
                if(bandage[0] == sequence) {
                    health = checkHP(health, bandage[2], maxHP);
                    sequence = 0;
                }
                    
            }
            
            currentTime++;
        }
       
        return health;
    }
    
    static int checkHP(int currentHP, int healing, int max) {
        return (currentHP + healing >= max) ? max : (currentHP + healing);
    }
    
}


