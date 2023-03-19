package Day27_Operation.Exmpl;

public class deciption {

    public static void Deciption(menu o) {


        if (o instanceof kebab) {
            ((kebab) o).addmeat();
            ((kebab) o).cooktime();

        }


        else
            if (o instanceof shawurma) {
            ((shawurma) o).barbeque();
            ((shawurma) o).addpateto();

        } else

            if (o instanceof susi){
                ((susi) o).boil();
            }





    }
}
