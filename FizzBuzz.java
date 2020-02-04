public class FizzBuzz {
    public String fizzBuzz(int number) {
        String result="";
        if( number % 3 == 0){
            System.out.println("Fizz");
            result="Fizz";
            
        }
        else if( number % 5 == 0){
            System.out.println("Buzz");
            result="Buzz";
        }
        else if(( number % 3 == 0) && ( number % 5 == 0)) {
            System.out.println("FizzBuzz");
            result="FizzBuzz";
            
        }else{
            System.out.println(number);
            result=Integer.toString(number);
        }
         return result;
    }
}