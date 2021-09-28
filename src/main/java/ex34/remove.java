package ex34;

public class remove {
    public static int removeName(String[] names, String remove) {
        int temp = 0;
        for(int i = 0; i < 5; i++) {
            if(remove.equals(names[i]))
                temp = i;
        }
        return temp;
    }
}
