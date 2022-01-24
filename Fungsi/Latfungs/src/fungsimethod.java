
public class fungsimethod { 
    static void suara1(){
        String ayam = "kukuruyuk";
        System.out.println(ayam);
    }

    static void suara2(){
        String bebek = "wek wek";
        System.out.println(bebek);
    }

    private static String sapi(){
    String sapi = "mooo";
    return sapi;
    }
    static String Kambing (){
    String kambing  = "Mbekkkk";
    return kambing;
    }

    public static void main(String[] args) throws Exception {
    fungsimethod.suara1();
    fungsimethod.suara2();

    System.out.println(sapi());
    System.out.println(Kambing());
    
    }
}

