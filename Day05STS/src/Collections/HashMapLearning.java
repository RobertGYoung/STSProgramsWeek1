package Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;

public class HashMapLearning {
	public static void main(String[] args) {

Map<Integer,String> map = new HashMap<Integer,String>();

map.put(001, "Rob");
map.put(002,"Rahb");
map.merge(001, " Young", String::concat);

for(Map.Entry m:map.entrySet())
	System.out.println(m.getKey()+": " + m.getValue());


	}

}
