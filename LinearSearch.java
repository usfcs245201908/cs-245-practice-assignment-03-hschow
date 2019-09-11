public class LinearSearch implements Practice03Search{

    public int search(int[] array, int item){
        for (int i=0;i<array.length;i++){
            if (array[i]==item){
                return i;
            }
        }
        return -1;
    }
    public String searchName(){
        return "Linear Search!";
    }

}
