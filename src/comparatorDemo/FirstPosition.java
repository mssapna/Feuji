package comparatorDemo;

public class FirstPosition {

    public static int FirstPosition(int[] stream) {
        int less = 0;
        int high = stream.length - 1;
        int result = -1;

        while (less <= high) {
            int mid = less + (high - less) / 2;

            if (stream[mid] == 1) {
              
                result = mid + 1;
                high = mid - 1;
            } else {
                
                less = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] value1 = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1};
        int[] value2 = {0, 1, 1, 1, 1, 1, 1};
        int[] value3 = {1, 1, 1, 1, 1, 1, 1};

        System.out.println("Position of first '1' in stream1: " + FirstPosition(value1));
        System.out.println("Position of first '1' in stream2: " + FirstPosition(value2));
        System.out.println("Position of first '1' in stream3: " + FirstPosition(value3));
    }
}