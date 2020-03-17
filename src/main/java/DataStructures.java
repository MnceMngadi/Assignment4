import java.util.*;

public class DataStructures {

    String name = "";
    String key = "";


    Map map1 = new HashMap();
    Set set = new HashSet();
    List listA = new ArrayList();

    public DataStructures(){}

    public DataStructures(String key,String name){

        this.name = name;
        this.key = key;

     }

    public void setName(String name) {
        this.name = name;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }


    public void map(DataStructures d){


        map1.put(d.key, d.name);




    }

    public void displayMap(String k){

        String element1 = (String) map1.get(k);

        System.out.println(element1);


    }

    public void deleteMap(String k){

        map1.remove(k);

        System.out.println("After deleting "+k +"it will be empty");
        String element2 = (String) map1.get(k);
        System.out.println(element2);


    }


    public void set(String name){

        set.add(name);





    }

    public void displaySet(){

        System.out.println(set);



    }

    public void removeSet(){

        set.remove(0);
        System.out.println("After removing...");
        System.out.println(set);

    }

    public void list(int b){

        listA.add(b);
        System.out.println(listA);

    }

    public void removeList(){

        listA.remove(0);

    }

    public void displayList(){

        System.out.println(listA);


    }


}
