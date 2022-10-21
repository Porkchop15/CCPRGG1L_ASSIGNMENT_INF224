public class assignment2 {
    
    public static void main(String[] args) throws Exception {
        // 1. Use a while loop to print your FIRSTNAME three times.
        int count = 3;
        while (count != 0) {
            System.out.println("Zachary");
            count --;
        }


        // 2. Use a do-while loop to print your MIDDLENAME four times.
        int count1 = 4;
        do {
            System.out.println("Agustin");
            count1--;
        } while (count1 != 0);


        //3. Use a for loop to print your SURNAME five times.
         for (int i = 5; i != 0; i--) {
            System.out.println("Reyes");
        }


        //4. Create a char array that consists all of the characters of your FIRSTNAME and use a for loop to print each character of your FIRSTNAME.
       // char array
       char[] myFirstName = {'Z','A', 'C', 'H', 'A', 'R', 'Y'};

       for (int counter2 = 0; counter2 < myFirstName.length; counter2++) {
           System.out.println(myFirstName[counter2]);
       }

       //5. Use a for loop to print the char array of your FIRSTNAME in REVERSE order
       

       for (int z = 6; z >= 0; z--) {
           System.out.println(myFirstName[z]);
        }

    }
}

