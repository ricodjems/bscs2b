package Activity10;

public class studentRecord {

    String name, phone, schoolId, email, address;
    int AI, HPC, MATH;

    public void add(String name, String phone,
            String schoolId, String email, String address) {
        this.name = "Name: " + name;
        this.phone ="Contact No.: " + phone;
        this.schoolId = "Student No.: " + schoolId;
        this.email = "Email: " + email;
        this.address = "Address: " + address;
    }

    public void delete() {
    	name = "";
        phone = "";
        schoolId = "";
        email = "";
        address = "";
    }

    public void view() {

        if(name.equals("") && phone.equals("") && schoolId.equals("")
                && email.equals("") && address.equals("")) {
            System.out.print("");
        }

        else {
        System.out.println(name);
        System.out.println(phone);
        System.out.println(schoolId);
        System.out.println(email);
        System.out.println(address);
        }
    }

    public void update(String newName, String newPhone,
            String newSchoolId, String newEmail, String newAddress) {
    	name = "Full Name: " + newName;
        phone = "Contact No.: " + newPhone;
        schoolId = "Student No.: " + newSchoolId;
        email = "Email: " + newEmail;
        address = "Address: " + newAddress;
    }

    public void setGrades(int nAI, int nHPC, int nMATH) {
        this.AI = nAI;
        this.HPC = nHPC;
        this.MATH = nMATH;
    }

    public void getAverage() {
        System.out.println("Artificial Intelligence = " + AI);
        System.out.println("High Performance Computing = " + HPC);
        System.out.println("Probability & Statistics = " + MATH);
        System.out.println("Average = " + ((AI + HPC +
        		MATH) / 3 ));
    }


    public static void main(String[] args) {
    	
    	studentRecord student1 = new studentRecord();
    	studentRecord student2 = new studentRecord();       

    	student1.add("Steve Rogers", "678-136-7092", "616", "capt.rogers@avenger.org", "569 Leaman Place, Brooklyn Heights");
    	student1.update("Captain America", "212-970-4133", "569", "the_first@avenger.org", "Avengers Tower, New York City");
    	student1.view();
    	student1.setGrades(80, 85, 90);
    	student1.getAverage();

    	student2.add("Sky", "111", "001", "sky@heaven.com", "Atmosphere");
    	student2.delete();
    	student2.view();
    }
}