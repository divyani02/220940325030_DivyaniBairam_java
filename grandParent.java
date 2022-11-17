class grandParent{
    public String grandFathername,grandMothername;
    public grandParent(String a, String b) {
        grandFathername = a;
        grandMothername = b;
        System.out.println("Grandfather's name : " + grandFathername + " " + " Grandmother's name :" + grandMothername);
    }
}
class parent extends grandParent{
    public String fatherName,motherName;

    public parent(String a,String b,String c, String d) {
        this(c, d);
        fatherName = a;
        motherName = b;
        System.out.println("Father's Name :" + fatherName + " " + " Mother's name : " + motherName);
    }
    public parent(String a,String b) {
        super(a,b);
    }
}
class child extends parent{
    child(String a,String b,String c,String d) {
        super(a, b, c, d);
    }
    public static void main(String args[]) {
        child c1 = new
                child("father", "mother", "grandfather", "grandmother");
    }
    }




