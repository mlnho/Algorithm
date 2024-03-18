class Solution {
    public int solution(int chicken) {
        int service = 0; // 서비스 치킨의 수 
        
        

        while(chicken>=10){
            service += chicken / 10;
            chicken = (chicken/10) + (chicken%10);
        }        
        
     
        
        return service;
    }
}
