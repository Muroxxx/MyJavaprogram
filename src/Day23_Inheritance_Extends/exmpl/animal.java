package Day23_Inheritance_Extends.exmpl;

public class animal extends animalfunctions{

    public animal(String clour, int weight, String genus) {
        super(clour, weight, genus);
    }

    public void voice(){
        System.out.println("hav hav");  // eğer kendi classında belirtilmiş ise
                                        // buradaki çıkışı kullanır belirtilmedi ise
                                        // base deki  çıkışı kullanır


    }

}
