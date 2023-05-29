package encapsulation26;
/** private variables declared these can only be
*  accessed by public methods of class
 */

public class Encapsulate {

    private String name;
    private int rollNo;
    private int age;

    public String getName()
    {                                                    // get method for name to access private variable name
        return name;
    }
    public void setName(String name)                         // get method for roll to access private variable rollNo
    {
        this.name = name;
    }
        public int getRollNo()
        {
            return rollNo;
        }

    public void setRollNo(int rollNo) {                  // set method for roll to access private variable rollNo
        this.rollNo = rollNo;
    }
    public int getAge() {                               //   get method for age to access private variable age
        return age;
    }
    public void setAge(int age) {                         // set method for age to access private variable age
        this.age = age;
    }



}


