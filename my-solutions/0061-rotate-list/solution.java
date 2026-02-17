class Solution 
{
    public ListNode rotateRight(ListNode head, int k)
    {
       ListNode cur = head;
        int cnt = 0;
        while(cur!=null){cnt++;cur=cur.next;}
        int[] arr = new int[cnt];
        cur=head;
        for(int i=0;i<cnt;i++){
            arr[(i+k)%cnt]=cur.val;cur=cur.next;
        }
        int i=0;
        cur=head;
        while(cur!=null){
            cur.val=arr[i++];cur=cur.next;
        }
        return head; 
    }
}
