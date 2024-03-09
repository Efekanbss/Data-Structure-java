public class StackOperation {



    //This method searches a given value in a given stack
    public static boolean search(Stack stk, int val){
        Stack tempStack=new Stack(stk.count());
        return true;
    }

    public static boolean isEqual(Stack s1, Stack s2){
        if(s1.count()!=s2.count())
            return false;
        Stack tempStack1=new Stack(s1.count());
        Stack tempStack2=new Stack(s1.count());
        boolean result=true;
        while(!s1.isEmpty()){
            int val1=s1.pop();
            int val2=s2.pop();
            tempStack1.push(val1);
            tempStack2.push(val2);
            if(val1!=val2) {
                result = false;
                break;
            }
        }
        while(!tempStack1.isEmpty()){
            s1.push(tempStack1.pop());
            s2.push(tempStack2.pop());
        }
        return result;
    }
    //write a remove method that will remove a specific element from a given stack
}