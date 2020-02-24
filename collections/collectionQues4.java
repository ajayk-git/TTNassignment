import java.util.*;

public class collectionQues4 {


        public static void main(String[] args)
        {
            HashMap<String, Integer> list= new HashMap<String, Integer>();
            list.put("Ajay", 45);
            list.put("Sam", 2);
            list.put("Ram", 22);
            list.put("Neha", 44);
            list.put("Manish jain", 56);
            list.put("John", 5);
            Map<String, Integer> hm1 = sortByValue(list);
            for (Map.Entry<String, Integer> en : hm1.entrySet()) {
                System.out.println("Key = " + en.getKey() +
                        ", Value = " + en.getValue());
            }
        }

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    }