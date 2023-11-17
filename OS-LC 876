class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode list = new ListNode();

        ListNode temp = head;
        int length = 0;

        while(temp!= null){
            length++;
            temp = temp.next;
        }

        temp = head;

        if(length%2==0){

            int index = length/2+1;

            int travel = 0;

            while(temp!=null){

                travel++;
                temp = temp.next;
                if(travel != index-1){
                    continue;    
                }else{
                    return temp;
                }
            }
        }else{
            int index = length/2;
            int travel = 0;

            while(temp!= null){
                travel++;
                temp = temp.next;
                if(travel!= index) continue;
                else return temp;
            }
        }
        
    
    return new ListNode(1);
    }
}
