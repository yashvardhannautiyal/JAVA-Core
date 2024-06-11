public class string {
    public static void main(String[] args){ 
    // length()
    // new String() 
    // concatenate
    // charAt()
    //replace()
    //substring()
    String name = "Yash";
    System.out.println(name.length()); //length of string
    String name2 = new String("yash2"); //new strimg method is used to create new non primitive variable and is not compulsory to use in java
    System.out.println(name2);   
    //concatenate
    // System.out.println(name + name2); 
    
    System.out.println(name.charAt(3)); //gives value of char at index

    String name3 = name.replace('a', 'b'); // replaces all 'a' character from the string with 'b' in this original string does not changes; new string is created with changes 
    System.out.println(name3);

    String name4 = "Aman and Appu";
    System.out.println(name4.substring(0,4)); //gives characters from index 0-4; this also does not changes the string but creates a new string where substring is stored
    }
}
