class Solution
{
    /* Returns level of given data value */
    int getLevel(Node node, int data)  
    { 
        // Write your code here
        if(node== null){
            return 0;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        int count=0;
        while(!q.isEmpty()){
            count++;
            int c=q.size();
            for(int i=0;i<c;i++){
                Node temp=q.poll();
                if(temp.data==data){
                    return count;
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
        return 0;
    } 

}