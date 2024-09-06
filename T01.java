// 12S24001-Fredrick Aritonang
// 12S24019-Winda N.V. Sitorus


import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatbuku;
        int tahunterbit, stok;
        double hargapembelian, minimummargin, rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        tahunterbit = Integer.parseInt(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        hargapembelian = Double.parseDouble(input.nextLine());
        minimummargin = Double.parseDouble(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + penerbit + "|" + formatbuku + "|" + tahunterbit + "|" + stok + "|" + hargapembelian + "|" + minimummargin + "|" + rating);
    }
}
