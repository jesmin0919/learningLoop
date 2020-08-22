public class Student
{
    private int id, numberOfSubjects;
    private String name, address;
    
    public Student(int theId,int theNumSub, String theName, String theAddress)
    {
        id = theId;
        numberOfSubjects = theNumSub; 
        name = theName;
        address = theAddress;
    }
    
    public int getNumberOfSubjects()
    {
        return numberOfSubjects;
    }
    public void setNumberOfSubjects(int theNumSub)
    {
        numberOfSubjects = theNumSub;
    }
    public String toString()
    {
        return "id = " + id + ", number of subjects = " + numberOfSubjects + ", name = " + name + ", address = " + address;
    }
    
}