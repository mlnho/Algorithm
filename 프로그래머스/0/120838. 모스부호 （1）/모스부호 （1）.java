class Solution {
    public String solution(String letter) {
        String answer = "";
        
        
        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."
        };

        String[] arrayLetter = letter.split(" ");

        for (int i = 0; i < arrayLetter.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (arrayLetter[i].equals(morse[j])) {
                    answer += (char)(j+97);

                }
            }
        }
        
        
        return answer;
    }
}