public class objects {

    class student{
        int id;
        String name;

        void insert(int n, String s){
            id = n;
            name = s;
        }
    }


    public static void main(String[] args) {
        student s1 = new student();

        s1.id = 1167;
        s1.name = "Khan";
    }



}

