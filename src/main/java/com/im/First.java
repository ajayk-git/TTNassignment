package com.im;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class First {

    public static void main(String[] args) {

        First first = new First();
        //System.out.println(first.replaceSubString("This is my main string text", "main", "modified"));
        //System.out.println(first.filterEvenElements(IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toList())));
    }

    /**
     * This method is used to replace the part of string with new string.
     * @param mainString string which needs to be modified
     * @param subString string which needs to be replaced
     * @param  replacementString string to be replaced with
     * @return updated string if mainString contains substring, else original string
     */
    public String replaceSubString(String mainString, String subString, String replacementString) {
        if(!mainString.isEmpty() && subString != null && replacementString != null && mainString.contains(subString)) {
            return mainString.replaceAll(subString, replacementString);
        }else {
            return mainString;
        }
    }

    /**
     * This method is used to filter even elements from list.
     * @param list list of integer
     * @return list
     */
    public List<Integer> filterEvenElements(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            if(it.next() % 2 == 0) {
                it.remove();
            }
        }
        return list;
    }

}
