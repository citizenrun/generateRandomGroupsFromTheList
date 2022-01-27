import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Util {
    public static Collection<List<String>> pickGroups(List<String> list, int size){
        final AtomicInteger count = new AtomicInteger();
        Collections.shuffle(list);
        return list.stream().collect(Collectors.groupingBy(it -> count.getAndIncrement()/size)).values();

    }

}
