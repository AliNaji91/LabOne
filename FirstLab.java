import java.util.Scanner;
public class FirstLab {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


//        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input

        System.out.println("Question 1");
        System.out.println("Input first number:");
        int fnum = input.nextInt();
        System.out.println("Input second number:");
        int snum = input.nextInt();

        System.out.println(fnum +" + "+snum+" = "+(fnum+snum));
        System.out.println(fnum +" - "+snum+" = "+(fnum-snum));
        System.out.println(fnum +" * "+snum+" = "+(fnum*snum));
        System.out.println(fnum +" / "+snum+" = "+(fnum/snum));
        System.out.println(fnum +" mod "+snum+" = "+(fnum%snum));

//        2. Write a Java program that takes a number as input and prints its multiplication table up to
//        10.

        System.out.println("Question 2");
        System.out.println("Input number:");
        int mulnum = input.nextInt();
        for (int m=1;m<=10;m++){
            System.out.println(mulnum+" * "+ m + " = "+ (mulnum*m));
        }




//        3. Write a Java program to print the area and perimeter of a circle.

        System.out.println("Question 3");
        System.out.println("input radius:");
        double rad = input.nextDouble();
        double t = 3.14;
        double per = 2*rad*t;
        double are = t*(rad*rad);
        System.out.println("Area is = "+are);
        System.out.println("Perimeter is = "+per);



//        4. Java program to find out the average of a set of integers

        System.out.println("Question 4");
        System.out.println("How many numbers:");
        double mannum = input.nextDouble();
        int i = 1;
        double subnum = 0;
        while (i<=mannum){
            System.out.println("Enter integer number:");
            double intnum = input.nextDouble();
            if (intnum<1){
                System.out.println("not integer number");
                continue;
            }else {
                subnum = subnum+intnum;
            }

            i++;
        }
        System.out.println("Average =" + (subnum/mannum));


//       5- Write a Java program that accepts three integers as input, adds the first two integers
//        together, and then determines whether the sum is equal to the third integer.

        System.out.println("Question 5");
        System.out.println("Enter three integers numbers:");
        int frnum = input.nextInt();
        int secnum = input.nextInt();
        int thernum = input.nextInt();

        boolean resu = false;

        if (frnum<1 || secnum<1 || thernum<1){
            System.out.println("not integer number");
        }else {
            if ((frnum+secnum)==thernum){
                resu = true;
            }else {
                resu = false;
            }
            System.out.println("The result : " +resu);

        }


//        6. Write a Java program to reverse a word.

        System.out.println("Question 6");
        System.out.println("Enter any word:");
        String clean1 = input.nextLine();
        String word = input.nextLine();
        int lenword = word.length();

        for (int re=lenword-1;re>=0;re--){
            System.out.print(word.charAt(re));
        }
        System.out.println();


//        7 - Java program to check whether the given number is even or odd

        System.out.println("Question 7");
        System.out.println("Enter number:");
        int eonum = input.nextInt();
        if (eonum%2==0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");

        }


//        8 - Java program to convert the temperature in Centigrade to Fahrenheit

        System.out.println("Question 8");
        System.out.println("Enter temperature in Centigrade:");
        double centem = input.nextDouble();
        double fahtem = (centem*1.8)+32;
        System.out.println("Temperature in Fahrenheit is:"+fahtem);


//        9.Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.

        System.out.println("Question 9");
        System.out.println("Input a string:");
        String clean2 = input.nextLine();
        String str = input.nextLine();
        System.out.println("Enter a number:");
        int carnum = input.nextInt();
        if (carnum>=str.length()){
            System.out.println("Sorry the number is greater than the number of letters");
        }else {
            System.out.println(str.charAt(carnum));
        }

//        10. Write a Java program to print the area and perimeter of a rectangle.

        System.out.println("Question 10");
        System.out.println("Enter the width of rectangle:");
        double width = input.nextDouble();
        System.out.println("Enter the height:");
        double height = input.nextDouble();
        System.out.println("Area is "+width+"*"+height+"="+width*height);
        System.out.println("Perimeter is 2*("+width+"+"+height+")="+ 2*(width+height));



//        11. Write a Java program to compare two numbers.

        System.out.println("Question 11");
        System.out.println("Enter first integer:");
        int fint = input.nextInt();
        System.out.println("Enter second integer:");
        int sint = input.nextInt();

        if (fint==sint){
            System.out.println(fint+"=="+sint);
        }
        if (fint>sint) {
            System.out.println(fint+">"+sint);
        }
        if (fint<sint) {
            System.out.println(fint+">"+sint);
        }
        if (fint>=sint) {
            System.out.println(fint+">="+sint);
        }
        if (fint<=sint) {
            System.out.println(fint+"<="+sint);
        }
        if(fint!=sint) {
            System.out.println(fint+"!="+sint);
        }

//        12. Write a Java program to convert seconds to hours, minutes and seconds.

        System.out.println("Question 12");
        System.out.println("Input Seconds:");
        int seconds = input.nextInt();
        int hrs = seconds/3600;
        int mint = (seconds%3600)/60;
        int secnd = mint%60;
        System.out.println(hrs+":"+mint+":"+secnd);



//        13. Write a Java program that accepts four integers from the user and prints equal if all
//        four are equal, and not equal otherwise.

        System.out.println("Question 13");
        System.out.println("Enter first number:");
        int firstn = input.nextInt();
        System.out.println("Enter second number:");
        int secondn = input.nextInt();
        System.out.println("Enter third number:");
        int thirdn = input.nextInt();
        System.out.println("Enter fourth number:");
        int fourthn = input.nextInt();
        if (firstn==secondn && firstn==secondn && firstn==thirdn && firstn==fourthn){
            System.out.println("Numbers are equal");
        }else {
            System.out.println("Numbers are not equal");
        }


//        14. Write a Java program that reads an integer and check whether it is negative, zero, or
//        positive.

        System.out.println("Question 14");
        System.out.println("Input number:");
        int checknum = input.nextInt();

        if (checknum<0){
            System.out.println("Number is negative");
        } else if (checknum==0) {
            System.out.println("Number is Zero");
        }else {
            System.out.println("Number is positive");
        }


//        15.Write a program to enter the numbers till the user wants and at the end it
//        should display the count of positive, negative and zeros entered (End loop use -1 ,
//                Don’t count -1).

        System.out.println("Question 15");
        System.out.println("Enter numbers or -1 to end:");
        int tnum = input.nextInt();
        int posnum = 0;
        int negnum = 0;
        int zernum = 0;
        while (tnum != -1){
            if (tnum>0){
                posnum++;
            } else if (tnum<0) {
                negnum++;
            }else {
                zernum++;
            }
            tnum= input.nextInt();
        }
        System.out.println(posnum+" Positive");
        System.out.println(negnum+" Negative");
        System.out.println(zernum+" Zero");


//        16 - Write a program that prompts the user to input an integer and then outputs the
//        number with the digits reversed.

        System.out.println("Question 16");
        System.out.println("Enter any integer:");
        int revnum = input.nextInt();
        String changeToStr = String.valueOf(revnum);
        int lennum = changeToStr.length();

        for (int r=lennum-1;r>=0;r--){
            System.out.print(changeToStr.charAt(r));
        }
        System.out.println();


//        17 - Write a program to enter the numbers till the user wants and at the end the
//        program should display the largest and smallest numbers entered.

        System.out.println("Question 17");
        System.out.println("Input numbers ; to stop enter 0:");
        int slnum = input.nextInt();
        int largnum = slnum;
        int smalnum = slnum;
        while (slnum!=0){
            slnum = input.nextInt();
            if (slnum>largnum){
                largnum = slnum;
            }
            if (slnum<smalnum && slnum!=0){
                smalnum = slnum;
            }
        }
        System.out.println("Largest is "+largnum);
        System.out.println("Smallest is "+smalnum);

//        18 - Determine and print the number of times the character ‘a’ appears in the input
//        entered by the user.

        System.out.println("Question 18");
        System.out.println("Enter any String:");
        String clean3 = input.nextLine();
        String strtimes = input.nextLine();
        int times = 0;

        for (int ti=0;ti<strtimes.length();ti++){
            if (strtimes.charAt(ti)=='a'){
                times++;
            }
        }
        System.out.println("Number of a is:"+times);

    }
}
