import java.util.regex.*;
import java.util.Arrays;

import java.util.io.*;
import java.util.Scanner.*;


class linearSearch{
    private static java.lang.Object System;

    static int search(int arr[], int n, int x){
        for(int i=0;i<n; i++){
            if(arr[i]==x)
                return i;
        }
        return -1;
        //return -1 if the element is not found
    }

    public static void main(String[] args){
        int[] arr = {3,1,4,5,6};
        int n=arr.length;

        int x =4;
        int index=search(arr, n, x);
        if(index==-1)
            System.out.println("element is not present ");
        else
            System.out.println("element found at position "+ index);
    }
}


class GFG {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 10, -1};
        System.out.println("normal array is");
        for (int x : arr) {
            System.out.println(x + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is ");
        for (int x : arr) {
            System.out.println(x + " ");
        }  //print in ascending order
        for (int x : arr) {
            System.out.println("ascending order " + Arrays.toString(arr));

        }
    }
}

//STRINGS
//program to reverse a word

class WORD{
    public static void main(String[] args){
        String str="Geeks", nstr="";
        char ch;
        System.out.println("original word:");
        System.out.println("Geeks");

        for(int i=0; i<str.length();i++){
            ch=str.charAt(i); //extracting each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("reversed word : " + nstr);
    }

}
//sort a string
//1st we change ther string to character array then we sort it using array
class HHH{
    public static String sortString(String inputString){
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);

    }
    public static void main(String[] arr){
        String inputString="feyinfgggfg";
        String outputString=sortString(inputString);

        System.out.println("input string : " + inputString);
        System.out.println("output string : " + outputString);

    }
}

//implementation of abstract class
//you cannot create an instance of an abstract class you can only create a reference or type to the class
//you can also apply static and final methods
//final method means the method cannot be overriden
//we can also have a class that contains no abstract method example below


//example of abstract class using shape

abstract  class  Shape{
    String color;
    //these are abstract methods
    abstract  double area();
     public abstract  String toString();
    //abstract class constructor
    Shape(String color)
    {
        System.out.println("shape constructor called");
        this.color=color;
    }
    //this is a concrete method so its not an avstract method
   public String getColor(){ return  color;}

}

class circle extends  Shape{
    double radius;
    public circle(String color, double radius){
        //calling shape constructor
        super(color);
        System.out.println("circle constructor called");
        this.radius=radius;
    }
    @Override double area(){
        return  Math.PI * Math.pow(radius,2);
    }
    @Override  public String toString(){
        return  "circle color is " + super.getColor() + " and area  is " + area();
    }
}
class Test{
    public  static  void  main(String[] args){
        Shape s1= new circle("red ", 2.2);
        System.out.println(s1.toString());
    }
}

//PROGRAM TO SHOW POLYMORPHISM
//compile time polymorphism is also known as static polymorphism and is achieved by function overloading
//or operator overloading

//METHOD OVERLOADING
class MO{
    static double multiply(int a, int b){
        return (double) a/b;
    }
    static int multiply(int a, int b, int c){
        return a*b*c;
    }
}
class MODEMO{
    public static void main(String[] args){
      System.out.println(MO.multiply(2,3));
        MO.multiply(1,3,4);

    }
}
//there is method overriding also also known as RUNTIME POLYMORPHISM
//it occurs using inheritance
//method is overriden at runtime by creating a type of the superclass and pointing it to a subclass
class parent{
    void say(){
        System.out.println("nothing");
    }
}
class child extends  parent{
    void say(){
        System.out.println("nothing");
    }
}

class parentdemo{
    public static void main(String[] args){
        parent a;
        a=new child();
        a.say();
    }
}

//INTERFACE IN JAVA
//an interface is described as an abstract type used to specify the behaviour of a class.
//a java interface contains static constants and abstract methods
//interface is a mechanism to achieve abstraction in java there can only be abstract methods in java interface
//not method body
//you can say interface have abstract method and variable it also represents is-a relationship
//for example a player may be an interface and any class implementing player must implement move()
//so it specifies a set of methods a class has to implements
//difference between interface and abstraction is that abstract class may contain non-final variables, whereas
//variables in the interface are final,public and static
//while implementing an interface all classes implemening it must declare the methods public

//EXAMPLE LETS TAKE A REALL WORLD EXAMPLE

interface Vehicle{
    //all are abstract methods
    void changegear(int a);
    void speedup(int a);
    void applybrakes(int a);
}

class bicycle implements Vehicle{
    int speed;
    int gear;
//we are overriding the changegear method here
    @Override
    public void changegear(int newgear){
        gear = newgear;
    }
    //to increase speed
    @Override public void speedup(int increament){
        speed=speed+increament;
    }
    // overriding to decrease speed
    @Override public void applybrakes(int decrement){
        speed=speed-decrement;
    }
    public void  printstates(){
        System.out.println("speed " + speed + "gear " + gear);
    }
}

class vehicledemo{
    public static void  main(String[] args){
        bicycle b=new bicycle();
        b.changegear(2);
        b.speedup(3);
        b.applybrakes(4);
    System.out.println("bicycle present states");
    b.printstates();
    }
}
//WE CAN ADD DEFAULT BODY TO AN INTERFACE NOW with the help of default keyword
//e.g

interface  in1{
    final  int a=10;
    //notice the default keyword here it must be used to specify it has a defaukt body
    default void display() {
        System.out.println("hello");
    }
    static void nothing(){
        System.out.println("nothing");
    }
}
class Testdemo implements  in1{
    public static void main(String[] args){
        Testdemo t =new Testdemo();
        t.display();
        in1.nothing();
        //it is going to display a default statement
    }
}
//we can also declare staticmethods in interface now that can be called without an object
//all the methods in  an interface are public and abstracts and all the fields must be public,static and finals
//
//COMPOSITION/AGGREGATION EXAMPLE
//COMPOSITION REPRESENTS A PART-OF
//AGGRGATION REPRESENTS A HAS-A
//https://www.google.com/amp/s/www.geeksforgeeks.org/association-composition-aggregation-java/amp/

//INHERITANCE EXAMPLE

    //    https://www.geeksforgeeks.org/inheritance-in-java/amp/

//LAMBDA EXPRESSIONS AND FUNCTIONAL INTERFACE
////FI IS AN INTERFACE THAT HAS ONLY ONE ABSTRACT METHOD
//THEY ARE INCLUDED WITH LAMBDA EXPRESSIONS
//FI IS THE WAY JAVA IMPLEMENTS FUNCTIONAL PROGRAMMING

interface  Square{
    int add(int x,int y );
}
class squaredemo{
    public static void main(String[] args){
        //creating a type of the FI
      Square s;
      //LAMBDA EXPRESSION TO DEFINE THE FI
        s=( int x, int y)-> x+y;
        int a=5;
        int b=7;


        //so this following program is just like function calling
        int ans=s.add(a,b);
        System.out.println(ans);
    }
}
//SOME JAVA BUILT IN FUNCTIONAL INTERFACES ARE
//RUNNABLE
//COMPARABLE
//ACTIONLISTENER
//CALLABLE



//JAVA EXCEPTIONS
//JAVA PROGRAM TO SHOW RUNTIME EXCEPTIONS
//ALL EXCEPTIONS ARE SUBCLASSES OF CLASS THROWABLE
//CHECKED EXCEPTIONS ARE IO OR COMPILE TIME EXCEPTIONS
//UNCHECKED EXCEPTIONS ARE RUNTIME EXCEPTIONS
//CHECKED EXCEPTIONS
//CLASSNOTFOUNDEXCEPTION
//INTERRUPTEDEXCEPTIONS
//IOEXCEPTIONS
//INSTANTIATIONEXCEPTION

//UNCHECKED EXCEPTIONS
//ARITHMETIC EXCEPTION
//CLASSCAST EXCEPTION
//NULLPOINTEREXCEPTION
//ARRAYINDEXOUTOFBOUNDEXCEPTION
//

//USER DEFINED EXCEPTIONS
//SOMETIMES THE BUILT EXCEPTION CANNOT DEFINED CERTAIN SITUATION
//METHOD TO PRINT THE EXCEPTION INFO
//1. printStackTrace()
//tostring
//getmessage

class ggg{
    public static void main(String[] args){
        int a=6;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
//try{
//block of code to monitor errors
//the  code you think can raise error
//}
//catch(ExceptionType1 exob){
//exception handler for exceptiontype1
//}
//catch(exceptiontype2){
//handler
//}
//finally{block of  code to be executed if there is no exception or ther is exception}

   //     https://www.geeksforgeeks.org/exceptions-in-java/amp/


//GENERICS IN JAVA

//https://www.google.com/amp/s/www.geeksforgeeks.org/generics-in-java/amp/
//A SIMPLE GENERICS PROGRAM
//we haave bounded types
//for example you might want to create a generic class that contains a method that returns an average of an array of numbers,
//furthermore you might want the class to obtain an average of numbers of any type invluding floats,intergers and doubles
//then you might want to specify the type of numbers generally using type parameters

//check out the complete reference book for other advanced generics program
















class Gen<T>{
    T ob; //declare an object of T
    //passing the constructor a reference to an object of type T
    Gen(T o){
        ob=o;
    }

    T getob(){
        return ob;
    }

    //show type of T
    void showtype(){
        System.out.println("type of t is" + ob.getClass().getName());
    }

}
class gendemo{
    public static void main(String[] args){
        //create a gen reference for integers
        Gen<Integer>iob;

        //create a gen integer object and assign its reference to iob. notice the use of
        //autoboxing to encaspulate the value 88 within an integer object

        iob=new Gen<Integer>(56);

        iob.showtype();

        //get the value in iob notice no cast is needed
        int v=iob.getob();
        System.out.println(v);
    Gen<String>strob=new Gen<String>("test");
strob.showtype();
strob.getob();
}
}

//YOU CAN HAVE GENERICS WITH TWO TYPES PARAMETERS ALSO
//WHY GENERICS
//THE OBJECT IS THE SUPERCLASS OF ALL OTHEWR CLASSES, AN OBJECT REFERENCE CAN REFER TO ANY OBJECT
//THESE FEATURES LACK TYPE SAFETY. GENERICS ADDS THAT TYPE OF SAFETY FEATURE
//SO THEY ELIMINATE THE NEED FOR YOU TO ENTER CASTS OR TYPE CHECK CODE BY HAND

//NON GENERIC EQUIVALENT
//USING NON GENERIC WEC CAN SEE THAT TYPE CASTING IS REQUIRED
class nonGen{
    Object ob;
        //clare an object of T
    //passing the constructor a reference to an object of type T
    nonGen(Object o){
        ob=o;
    }

    Object getob(){
        return ob;
    }

    //show type of T
    void showtype(){
        System.out.println("type of t is" + ob.getClass().getName());
    }

}
class nongendemo{
    public static void main(String[] args){
        //create a gen reference for integers
        nonGen iob;

        //create a gen integer object and assign its reference to iob. notice the use of
        //autoboxing to encaspulate the value 88 within an integer object

        iob=new nonGen(56);

        iob.showtype();

        //cast is needed here

        int v=(Integer) iob.getob();
        System.out.println(v);

        nonGen strob=new nonGen("test");
        strob.showtype();


      String str=(String)  strob.getob();
    }
}


//MULTITHREADING

//PROGRAM TO CHECK THE THREAD STATUS

class onethread extends Thread {
    //method 1
    public void run() {
        System.out.println("geeks");
        //try block to check for exceptions
        try {
            Thread.sleep(400);
        }
        //catch block to handle interruptedExceptions
        catch (InterruptedException ie){
            System.out.println("forgeeks");
        }
    }
    public static void main(String[] args){
        //creating threads using above class as it is extending thread class
        onethread c1=new onethread();
        onethread c2=new onethread();
        //starting thread
        c1.start();
        c2.start();
        //checking whether thread is alive or  not
        //it returns boolean
        System.out.println(c1.isAlive());
        System.out.println(c2.isAlive());
    }
}
//REGULAR PATTERNS
//WE HAVE MATCHER AND PATTERN WE USE PATTERN TO DEFINE A REGULAR EXPRESSION WHILE WE USE MATCHER TO MATCH THE PATTERN
//AGAINST ANOTHER SEQUENCE
//MATCHER CLASS AND PATTERN CLASS HAVE NO CONSTRUCTOR

class regexpr{
    public static void main(String[] args){
        Pattern pat;
        Matcher mat;
        boolean found;
        pat=pattern.compile("java");//the compile transforms the string in pattern into a pattern that can be used for matching
        //by the matcher class
        mat=pat.matcher("java");//then yoiu use the pattern object to create a matcher

        found=mat.matches();//check for matches matches() method returns a boolean true or false if pattern matches

        System.out.println("testing java against java");
        if(found){ //
            System.out.println("Matches");
        }
        else {
            System.out.println("No match")
        }
        System.out.println();

        System.out.println("Testing java against java 9.");
        mat=pat.matcher("java 9"); //create new matcher

        found=mat.matches();

        if (found) System.out.println("Matches");
        else System.out.println("no match")

        //you can also use find() metghod to search input sequence for repeated occurence of the patter

        if (mat.find()) System.out.println("subsequence found");
        else System.out.println("No match");


    }
}

//using wildcards and quantifiers
//the real benefits of regular expression is not seen until wildcards and quantififers are used
// quantifers
//+   = match one or morre
// * = match zero or more
// ? = match zero or one

class reg{
    public static void main(String[] args){
        Pattern pat = Pattern.compile("W+");
        Matcher mat=pat.matcher("W WW WWW");

        while(mat.find())
            System.out.println("Match " + mat.group());
    }
}
//this programs shows the reg expression pattern "W+ " matches any arbitary long sequence of W

//using replaceAll()
//it allows you perform powerful searches and replace operations that use regular expressions
//split() method
//you can use it to reducd an input sequence into its individual tokens



//THE COLLECTION FRAMEWORK
//IT IS A SOPHISTICAted hierachy of interfaces AND CLASSES THAT PROVIDE STATE OF ART TECHNOLOGY FOR MANAGING
//GROUP OF OBJECTS
//ALGORITHS OPERATE ON COLLECTIONS AND ARE DECLARED STATIC METHODS WITHIN THE COLLECTION CLASS THEYPROVIDE A STANDARD WAY OF MANIPULATING
//COLLECTIONS\
//THE COLLECTION INTERFACE IS THE FOUNDATION UPON WHICH THE COLLECTION FRAMEWORK IS BUILT BECAUSE IT MUST BE IMPLEMENTED
//BY ANY CLASS THAT DEFINES A COLLECTION
//COLLECTION EXTENDS ITERABLE INTERFACE WHICH MEANS ALL COLLECTIONS CAN BE CYCLED THROUGH BY USE OF THE FOR EACH STYLE LOOP
//COLLECTION IS A GENERIC INTERFACE THAT HAS THIS DECLARATION
// interface Collection<E>
//COLLECTION DECLARES THE CORE METHODS THAT ALL collections will have
//check the complete reference page 531 for the several methods
//OBJECTS ARE ADDED TO A COLLECTION BY CALLING add(). NOTICE THAT ADD TAKES AN ARGUEMENT OF TYPE E,WHICH MEANS THAT OBJECTS
//ADDED TO A COLLECTION MUST BE COMPATIBLE WITH THE TYPE OF DATA EXPECTED BY THE COLLECTION.
//YOU CAN USE addAll() to add an entire contents
//WE HAVE THE LIST INTERFACE interface List<E>
//it also its method and it extends the collection interface
//THE SET INTERFACE
//THESORTEDSET INTERFACE
//THENAVIGABLESET INTERFACE


//THE COLLECTION CLASSES
//NOW THAT YOU KNOW ABOUT COLLECTION INTERFACES YOU SHOULD EXAMINE THE STANDARD CLASSES THAT IMPLEMENTS THEM.


//IMPLEMENTTING ARRAYLIST
//IT IS USED WHEN YOU DO NOT KNOW AT RUNTIME HOW LARGE AN ARRAY WOULD BE

class Arraylistdemo{
    public static void main(String[] args){
        ArrayList<String> al =new ArrayList<String>();
        System.out.println("initial size of array list" + al.size);
        //add element to the arraylist
        al.add("C");
        al.add("b");
        al.add("N");
        al.add("I");

        System.out.println("size after addition" + al.size());
        System.out.println("contents of al" + al);
        al.remove("F");
        System.out.println("contents after removal" + al);
    }
}

//while working with the arraylist you mighrt want to obtain an actual array this can be obtain using the method
//toArray();

//THE LINKEDLIST CLASS
//IT PROVIDES THE LINKEDLIST DATASTRUCTURE AND HAS THIS DECLARATION

//class LinkedList<E>
//check the complete reference book for the example on linkedlist
//THE HASHSET CLASSS
//THE TREESET CLASS
//acessing elements via an iterator
//for example u might want to display each elements one way to do this is to  employ an iterator which is an object



//interface Iterator<E>
//using an iterator
//before you can access a collection through an iterator you must obtain one.
//each collection classes provides an iterator() method that returns an iterator to the start of the collection
//by using this iterator u can access each element in the collection one at a time
//check out the steps on how to use an iterator on complete reference book

//the for each alternatives to iterators

//if you wont be modifying the contents or obtaining elements in reverse order, then for-each version of the for loop is
//often a more convinient alternative to cycling through a collection using an iterstor


class foreachdemo{
    public static void main(String[] args){
        ArrayList<Integer> vals=new ArrayList<Integer>();

        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(5);

        System.out.println("contents of vals ");
        for(int v : vals)
            System.out.println(v + " ");

        System.out.println();
        //sum the values using a for loop

        inr sum=0;
        for(int v : vals)
            sum+=v;

        System.out.println("sum of values " + sum);
    }
}
//you cant modify the elemts using a for each loop

//spliterators

//it is just like iterastors but the most important aspect is its ability to provide support for parallel iteration of portions of the
//sequence
//it supports parallel programming

//&************************************************************************************************************/
//**************************************************/

//STORING USER DEFINED CLASSES IN COLLECTIONS COLLECTION CAN STORE OBJECT OF CLASSES YOU CREATE.

//EXAMPLE USING A LINKEDLIST TO SOTRE MAILING ADDRESSES

class Address{
    private String name;
    private String street;
    private String city;
    private string state;
    private String code;

    Address(String n, String s, String c, String st, String cd){
        name=n;
        street=s;
        city=c;
        state=st;
        code=cd;
    }
    public String toString(){
        return name + "\n" + street + "\n" + city + " " + state = " " + code;
    }

}
 class Mailist{
    public static void main(String[] args){
        LinkedList<Address> ml = new LinkedList<Address>();
        //Add elements to the linked list

        ml.add(new Address(("j.w. west", "li oak ave", " urbana", "il", "6791"));
        ml.add(new Address(("ralph barker", " ll42 Maple lane", " Mohamet", "IL", "61853"));

        //displaying the mailing list
        for(Address element: ml)
            System.out.println(element + "\n");

        System.out.println();
    }
 }


 //working with maps
//A MAP IS AN OBJECT THAT STORES ASSOCIATION WITHIN KEYS AND VALUES
//GIVEN A KEY YOU CAN FIND ITS VALUE
//MAPS DONT IMPLEMENT THE ITERABLE INTERFACE SO YOU CANT CYCLE THROU THEM
//READ THE COMPLETE REFRENCE BOOK ON MAPS

