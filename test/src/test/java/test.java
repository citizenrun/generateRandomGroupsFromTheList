import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class test {

    @Test
    public void givenListOfString_thenPartiotionWithGroupsOfSelectedSize(){
        List<String> names = Arrays.asList("BrGale", "Gustavo", "Hank", "Hector", "Holly", "Jane", "Jesse", "Lydia", "Marie", "Mike","Pete", "Saul", "Skyler", "Todd", "Walter");
        final int size = 3;
        Collection<List<String>> result1 = Util.pickGroups(names, size);
        Collection<List<String>> result2 = Util.pickGroups(names, size);
        assertNotEquals(result1, result2);
        System.out.println(result1);
        System.out.println(result2);
    }
}
