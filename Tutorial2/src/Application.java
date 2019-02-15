public class Application {

    public static void main(String[] args) {
        int myInt = 18;
        int value = 0;
        boolean myBoolean = value < 20;

        while(value < 10){
            System.out.println("Hello " + value);
            value = value + 1;
        }

        // A convenience method to write a formatted string to this output stream
        // using the specified format string and arguments. \n is the line break
        for(int i = 0; i < 5; i++){
            System.out.printf("The value of i is: %d\n", i);}

        //Capital String is the class
        String text = "Hello";

        String blank = " ";

        String name = "Renae";

        String greeting = text + blank + name;

        System.out.println(greeting + " your favourite number is " + myInt);
        System.out.println(myBoolean);

    }
}
