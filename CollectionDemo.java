import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(4);
        nums.add(4);

        for(Object n : nums)
        {
            int num = (Integer)n;
        System.out.println(nums);
        }

    }
}
