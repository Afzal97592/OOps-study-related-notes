class pen{
String color;
String type;//ball,gel pain
// create a function whic is called inside te function methods
public void write(){
    System.out.println("write Something");
}
public void printcolor(){
    System.out.println(this.color); //'this' will check seialwise which
                                   // function calling first
                            // so first will print the color of pen1
                            // then will print the color of pen2
}

}
class Student {    // another class
    String name; 
    int age;
    public void printInfo(){ // methhod 
        System.out.println(this .name);
        System.out.println(this.age);
    }

/*


    Student() {  // constructor will call and this is the nonparameterize constructor
        System.out.println("constructoe called");
    // if we dont create this type of constructor then java create default constructoe

    } */





    /*

     // parametrized constructo
     Student(String name, int age){
           this.name = name;
           this .age = age;  
     }
*/





// copy constructor

Student(Student s2){
    this.name = s2.name;
    this.age = s2.age;
}
Student(){
    
}
}
public class oppsexample{
    // main class
    // so create the main methids inside the main class
    public static void main(String []args){


  /*      // call to the class 
        pen pen1 = new pen();
        pen1.color = "blue"; // assign the color to the pen
        pen1.type="gell"; // assign the type of pen 

      //  pen1.write(); // then this function calling to write function thats why printng the write something
      pen pen2 = new pen();
      pen2.color ="black";
      pen2.type ="ballpoint";
      

      pen1.printcolor();
      pen2.printcolor();  */



  /*   Student s1 = new Student();// "new" new allocate the memorry inside the heap
     Student s2 = new Student();// "student()" special type function which knon as " constructor"
     s1.name = "Afzal";         // 
     s1.age = 21;

      s2.name ="Ahmad";
      s2.age = 22;

 s1.printInfo();
 s2.printInfo(); */

   

 // checking for parametrerized
 /* Student s1 = new Student("Afzal",21);
  s1.printInfo();*/


  // checking for copy instructor;

    Student s1 = new Student();
    s1.name = "afzal";
    s1.age = 21;
      Student s2 = new Student(s1);
      s2.printInfo();



    }

}