package sdajava.binarySerch;


public class Main {

    public static void main(String[] args) {
        int tab [] = {1,2,4,6,7};
        int p = tab.length -1;
        int l = 0;
        int x = 6;
        int s = 0;
        boolean koniec = false;

        while(!koniec){

            if (l>p) {
                System.out.print("Brak szuanego elemenu  " + x );
                koniec = true;
            }
            s = (l + p -1) / 2;
                if (tab[s] == x) {
                    System.out.print("Odnaleziono szukany  " + x + "  pod indeksem  " + s);
                    koniec = true;
                }
                else if (tab[s] < x) {
                    l = s + 1;
                }
                else {
                    p = s - 1;
                }
        }
    }
}






