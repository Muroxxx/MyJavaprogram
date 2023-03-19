package Day21_Enum;

public class Enum {
    enum role{ADMİN, STAFF, CASHİER, WARDEN}
    enum statue{ACTİVE, PASİVE}

    public static void main(String[]args) {

        user u1 = new user("jason", role.ADMİN, statue.ACTİVE);
        user u2 = new user("freddy", role.CASHİER, statue.PASİVE);
        user u3 = new user("cole", role.STAFF, statue.ACTİVE);

        System.out.println("u1 = " + u1);
    }




}
