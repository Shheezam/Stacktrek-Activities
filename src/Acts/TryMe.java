package Acts;

public class TryMe {
    public static void main(String[] args) {



        try {
            int[] numbers = {1,2};
            System.out.println(numbers[2]);

            } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
          System.out.println("Exception occured");
            e.printStackTrace();
        }
    }
}
