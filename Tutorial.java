public class Tutorial
{
    Student students[] = new Student[5];
    
    public Tutorial()
    {
        setupStudents();
        displayAll();
        listFullTimers(4);
    }
    public void setupStudents()
    {
        students[0] = new Student(111, 3, "Mary", "24 Fairview");
        students[1] = new Student(222,4, "John", "241 ff");
        students[2] = new Student(333, 3, "Mary2", "242 Fairview");
        students[3] = new Student(444, 5, "Mary3", "243 Fairview");
        students[4] = new Student(555, 4, "Mary4", "244 Fairview");
    }
    public void displayAll()
    {
        for(int i = 0; i <students.length; i++)
        {
            System.out.println(students[i].toString());
        }
    }
    
    public void listFullTimers(int num)
    {
        int i = 0;
        while(i < students.length)
        {
            int stuSubNum = students[i].getNumberOfSubjects();
        if(stuSubNum >= num)
        {
            System.out.println(students[i].toString());
        }
        i++;
    }
    }
}