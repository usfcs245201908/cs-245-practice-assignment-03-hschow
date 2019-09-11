public class BinaryRecursiveSearch implements Practice03Search{

    public int search(int[] array, int item){
        int start = array[0];
        int end = array[array.length-1];
        if (array[(start+end)/2]==item){
            return (start+end)/2;
        }
        else if (array[(start+end)/2]>item&&array[(start+end)/2]<=array[end]){
            int size = array.length/2;
            int[] a = new int[size];
            for (int i = size, j=0; j<size;i++, j++){
                a[j]=array[i];
            }
            return search(a,item);
        }
        else if (array[(start+end)/2]<item&&array[(start+end)/2]>=array[start]){
            int size = array.length/2;
            int[] a = new int[size];
            for (int j=0; j<size;j++){
                a[j]=array[j];
            }
            return search(a,item);
        }
        else {
            return -1;
        }
    }
    public String searchName(){
        return "Binary Recursive Search!";
    }

}
