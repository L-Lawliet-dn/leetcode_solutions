// my code, 2ms

class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int ans = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i<stones.length();i++){

            map.put(stones.charAt(i),map.getOrDefault(stones.charAt(i),0)+1);

        }
        
        for(int i = 0;i<jewels.length();i++){
            ans+=map.getOrDefault(jewels.charAt(i),0);
        }

    return ans;
    }
}

// top code, 0ms

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}

// Analysis

// - the user has used the concept that if the char in stones exists in jewels, then +1. If not, that condition is checked by keeping the check 
// - "if jewels.charAt(stones.charAt(i)) !=-1".
// - since the get char function will return -1, so that char will be skipped.
// // Note
// • I used hashmap and got 2ms. Unnecessary data structure used.
// • Should have sought to seek some pattern and writet the code accordingly
