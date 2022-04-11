import java.util.Scanner;

public class KutleIndeksi {
    public static void main(String[] args) {
        double kg, boy, indeks;

        System.out.println("Hoşgeldiniz. Sizden Aldığımız Veriler ile Vücut İndeksinizi Hesaplayacağız!");

        System.out.print("Vücut Ağırlığınızı Giriniz (KG):  ");
        Scanner input = new Scanner(System.in);
        kg = input.nextDouble();

        System.out.print("Boyunuzu Giriniz (CM-1.72):  ");
        Scanner input1 = new Scanner(System.in);
        boy = input1.nextDouble();

        indeks = kg / (boy * boy);
        System.out.println("Vücut İndeksiniz: "+indeks);

        if (indeks < 18.5){
            System.out.println("Düşük Kilolusunuz! Sağlıklı!");
        }else if (indeks > 18.5 && indeks < 24.9){
            System.out.println("Normal Kilolusunuz! Sağlıklı!");
        }else if (indeks >25 && indeks < 29.9){
            System.out.println("Fazla Kilolu!!");
        }else if (indeks >30 && indeks <40){
            System.out.println("Obez");
        }else if (indeks >40){
            System.out.println("Aşırı Obez!!");
        }
    }
}
