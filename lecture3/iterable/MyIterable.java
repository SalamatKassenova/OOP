package lecture3.iterable;

import java.util.*;


// An example of a custom class that implements the Iterable interface 
class MyIterable implements Iterable<Integer>{
    private List<Integer> data = new ArrayList<>();

    public void add(int value) {
        data.add(value);
    }

    // iterator() method returns iterator for data collection
    public Iterator<Integer> iterator(){
        return data.iterator();
    }
}


