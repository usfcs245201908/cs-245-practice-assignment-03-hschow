public class BinaryIterativeSearch implements Practice03Search{

    public int search(int[] array, int item){
        int start = array[0];
        int end = array[array.length-1];
        int s = start;
        int e = end;
        int m = (s+e)/2;
        while (m>=s & m<=e){
            m = (s+e)/2;
            if (array[m]==item){
                return m;
            }
            else if (array[m]>item&&array[m]<=array[end]){
                s=m+1;
            }
            else if (array[m]<item&&array[m]>=array[start]){
                e=m-1;
            }
            else {
                return -1;
            }
        }
        return -1;
    }
    public String searchName(){
        return "Binary Iterative Search!";
    }

}
