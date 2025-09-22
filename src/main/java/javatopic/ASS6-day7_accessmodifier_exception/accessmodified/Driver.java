package javatopic.day7_accessmodifier_exception.accessmodified;

public class Driver {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.help();
        System.out.println("outside package");
        System.out.println("PUBLIC:"+parent.name);
        System.out.println("DEFAULT:"+parent.country);
        System.out.println("PROTECETD:"+parent.state);
        //System.out.println(parent.city);
        //'city' has private access in 'topic.oops.day7.accessmodified.Parent'


    }

}
