 class Marathon {
     public static int rank(int[] inputs) {
         int minimum = inputs[0];
         int index = 0;
         for (int i = 0; i < inputs.length; i++){
             if (inputs[i] < minimum) {
                 minimum = inputs[i];
                 index = i;
             }
         }
         System.out.println("The minimum is: " + minimum);
         System.out.println("The index is: " + index);
         return index;
     }


     public static void main(String[] args) {
         String[] names = {"Elena", "Thomas", "Hamilton", "Suzie",
                 "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane",
                 "Emily", "Daniel", "Neda", "Aaron", "Kate"};
         int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243,
                 334, 412, 393, 299, 343, 317, 265};
         int result = rank(times);
         System.out.println("The fastest Runner is " + names[result] + " and his time is: " + times[result] + " minutes.");
     }
 }
