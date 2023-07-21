import java.util.ArrayList;

public class no {

//    public static void swap(int[] arr,int index1, int index2){
//        int temp = arr[index1];
//        arr[index1]=arr[index2];
//        arr[index2] = temp;
//    }
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        //add Method = Add an element at the end of the arraylist
        num.add(10);
        num.add(20);

        //get Method = it works like returing element at index which we insert
//        System.out.println(num.get(1));

        //addAll() = it works like copyinh element from one list to another
        ArrayList<Integer> Addnum = new ArrayList<>();
        Addnum.addAll(num);
        System.out.println(Addnum);

        //clear() = it simply removes aal the elemnts from  entire ArrayList
        Addnum.clear();
        System.out.println(Addnum);

        //clone() = It is work like it's name it simply colne the whole Arraylist
        ArrayList<Integer> clone = (ArrayList<Integer>)num.clone();
        System.out.println(clone);

        //contain() = This method is similar to searching method it simply returns Ture Or False for searching element in that present ARraylist
        System.out.println(clone.contains(10));
        System.out.println(clone.contains(1010));

        //How to declae a 2D ArrayList 
        ArrayList<ArrayList<Integer>> array_2D = new ArrayList<>();
        

    }
}
