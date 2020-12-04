public class FizzBuzz {
   static final String[] arr = {"","Một","Hai","Ba","Bốn","Năm","Sáu","Bảy","Tám","Chín"};
    public static String FizzBuzz(int number){
       if (number <= 0) {
           return "invalid";
       }

        boolean buzz = number % 5 == 0;
        boolean fizz = number % 3 == 0;

        if(fizz && buzz) return "Fizz Buzz";
        if(fizz) return "Fizz";
        if(buzz) return "Buzz";
       return ""+number;
    }

    public static String WriteNum(int number){
        int firstnum = number / 10;
        int secondnum = number % 10;

        if(firstnum == 1){
            return "mươi";
        }
        return arr[firstnum] + " " + (secondnum==0 ? "mươi" : arr[secondnum]);
    }
}
