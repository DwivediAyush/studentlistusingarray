package listmain;

import bean.*;

public class MyStudentList {
    private Student[] mylist;
    private int last;

    public MyStudentList(Student[] mylist, int last) {
        this.mylist = mylist;
        this.last = last;
    }
    public void insert(Student element){
        if(last<mylist.length-1){
            last++;
            mylist[last]=element;
        }
        else
            System.out.println("list is full");

    }
    public void delete(){
        if(last>=0)
        {
            mylist[last]=null;
            last--;
        }
        else
            System.out.println("list is empty");
    }
    public boolean search(Student element){
        boolean re=false;
        for (int i=0;i<=last;i++)
        {
            if(mylist[i].getName().equals(element.getName()) && mylist[i].getRoll()==element.getRoll()) {
                re = true;
                break;
            }
        }
        return re;
    }
    public void sort() {
        for (int i = 0; i < last; i++) {
            for (int j = 0; j < last; j++) {
                Student temp;
                if(mylist[j].getRoll()>mylist[j+1].getRoll())
                {
                    temp=mylist[j];
                    mylist[j]=mylist[j+1];
                    mylist[j+1]=temp;
                }
            }
        }
    }
    public void display()
    {
        System.out.println("mylist");
        for(int i=0;i<=last;i++){
            System.out.println(mylist[i]);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int size = 5;
        Student[] mylist1 = new Student[size];
        int last = -1;
        MyStudentList obj=new MyStudentList(mylist1,last);
        Student element=new Student();
        Student e1=new Student();
        element.setName("Ayush");
        element.setRoll(16);
        e1.setName("Shayam");
        e1.setRoll(2);
        obj.insert(element);

        obj.display();
        obj.insert(e1);
        obj.display();

        obj.sort();
        obj.display();

        obj.delete();
        obj.display();
        System.out.println(element.getRoll());
    }
}
