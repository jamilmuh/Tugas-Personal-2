import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class tugas_personal2

{
    private static BufferedReader br = null;

    static void deretAritmatika(int a, int b){
        System.out.println("Deret Aritmatika :");
        int n = 1;
        String str_output = "";
        str_output += n + " ";
        for (int i=1;i<a;i++){
                str_output += n+b + " ";
                n = n+b;
        }
        System.out.println(str_output+"\n");
    }

    static void deretGeometri(int a, int b){
        System.out.println("Deret Geometri :");
        int n = 1;
        String str_output = "";
        str_output += n + " ";
        for (int i=1;i<a;i++){
            str_output += n*b + " ";
            n = n*b;
        }
        System.out.println(str_output+"\n");
    }

    static void faktorial(int a){
        System.out.println("Faktorial dari " + a + ":");
        int n = 1;
        String str_output = "";
//        str_output += n + " ";
        for (int i=a;i>=1;i--){
            n *= i;
            if(i > 1){
                str_output += i + " * ";
            }else{
                str_output += i;
            }
//            n = n*i;
        }
        System.out.println(str_output + " = " + n+"\n");
    }

    static int rangeNumberInput(Scanner sc){
        int output = 0;
        boolean is_valid = true;
        while (is_valid){
            if (!sc.hasNextInt() || !sc.hasNext()) {
                    System.out.println("Hanya boleh memasukkan angka!");
                    sc.nextLine();
            }else{
                output = sc.nextInt();
                if (output >= 2 && output <= 9){
                    is_valid = false;
                }else{
                    System.out.println("Angka yang dimasukkan hanya boleh antara 2-9!");
                }
            }
        }
        return output;

    }

    public static void main(String args[]) {

        boolean cek = true;
        Scanner input = new Scanner(System.in);
        while (cek) {
            br = new BufferedReader(new InputStreamReader(System.in));

            try {
                System.out.println("Belajar Deret Aritmatika, Geometri, dan Menghitung Faktorial\n");

                int a, b;
                System.out.print("Masukkan banyak angka yang mau dicetak [2...9] : \n");
                a = rangeNumberInput(input);

                System.out.print("Masukkan beda masing-masing angka [2...9] : \n");
                b = rangeNumberInput(input);

                deretAritmatika(a, b);
                deretGeometri(a, b);
                faktorial(a);

                System.out.print("Ingin coba lagi (Y/N) ? ");

                String coba = br.readLine();
                if (coba.equalsIgnoreCase("N"))
                    cek = false;
                else if (coba.equalsIgnoreCase("Y"))
                    cek = true;
                else
                    System.exit(0);
            } catch (IOException ioe) {
                System.out.println("Error IOException");
            }
        }
    }

}