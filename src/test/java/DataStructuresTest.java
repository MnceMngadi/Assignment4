import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class DataStructuresTest {

    DataStructures n = new DataStructures();

    @Before
    public void setUp() throws Exception {

        DataStructures n = new DataStructures();

    }

    @Test
    public void map() {//Testing the Map data structure

        DataStructures map1 = new DataStructures("key1","Mncedisi");
        DataStructures map2 = new DataStructures("key2","Mngadi");

        n.map(map1);
        n.map(map2);





       n.displayMap("key1");
       n.displayMap("key2");

       n.deleteMap("key2");


    }

    @Test
    public void set() {

        n.set("Mncedisi");
        n.set("Mngadi");
        n.set("5");

        n.displaySet();

    }

    @Test
    public void removeSet() {

        n.set("Mncedisi");
        n.set("Mngadi");
        n.set("5");


        n.removeSet();

    }


    @Test
    public void list() {

        n.list(4);
        n.list(32);
        n.list(39);

        n.displayList();

        n.removeList();
        n.displayList();

    }


}