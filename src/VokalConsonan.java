import java.util.Scanner;

public class VokalConsonan {
    public static void main(String[] args) {

        System.out.print("Masukkan 1 kata : ");

        int vokal = 0;
        int konsonan = 0;

        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        vokal = numVokal(input);
        konsonan = numConsonan(input);

        System.out.print("jumlah huruf vokal : "+vokal + "\n");
        System.out.print("jumlah huruf konsonan : "+konsonan);
    }

    private static int numVokal(String word){
        int jumlahVokal = 0;

        for (int i = 0; i < word.length() ; i++) {

            if(word.toLowerCase().charAt(i)== 'a' || word.toLowerCase().charAt(i)== 'i' || word.toLowerCase().charAt(i)== 'u' || word.toLowerCase().charAt(i)== 'e' || word.toLowerCase().charAt(i)== 'o'){
                jumlahVokal++;
            }
        }
        return jumlahVokal;
    }

    private static int numConsonan(String word){
        int jumlahVokal = 0;

        for (int i = 0; i < word.length() ; i++) {

            if(word.toLowerCase().charAt(i)!= 'a' && word.toLowerCase().charAt(i)!= 'i' && word.toLowerCase().charAt(i)!= 'u' && word.toLowerCase().charAt(i)!= 'e' && word.toLowerCase().charAt(i)!= 'o'){
                jumlahVokal++;
            }
        }
        return jumlahVokal;
    }


}
