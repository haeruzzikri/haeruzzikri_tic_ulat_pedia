package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;
import simple.example.hewanpedia.model.Ulat;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }
    private static List<Ulat> initDataUlat(Context ctx) {
        List<Ulat> ulats = new ArrayList<>();
        ulats.add(new Ulat("Sutra Raksasa", "Amerika Selatan",
                "Berasal dari Amerika Selatan , ulat ini adalah bentuk larva ngengat ulat raksasa raksasa, dan dianggap sebagai salah satu ulat paling berbahaya di dunia", R.drawable.ulat_sutra_raksasa));
        ulats.add(new Ulat("Ulat Puss", "Amerika Selatan",
                "Ternyata ulat bulu yang terlihat imut ini sangat beracun, sengatnya bisa menyebabkan sakit kepala, bengkak, mual, kulit melepuh bahkan kesulitan bernapas. Yang lebih membuat orang khawatir adalah, ulat berbulu lebat ini tidak berhabitat di hutan, melainkan di perkotaan", R.drawable.ulat_puss));
        ulats.add(new Ulat("Ulat Bag Shelter", "Australia Barat",
                "Ulat ini merupakan salah satu ulat yang tubuhnya ditumbuhi rambut, ia adalah salah satu yang berbahaya dan sebaiknya dijauhi ketika jika bertemu. Ulat bag shelter ini aktif di malam hari, dan sangat menyukai pepohonan beefwood (Gravillea striata), tanaman yang berasal dari Australia Barat", R.drawable.ulat_bag_shelter));
        ulats.add(new Ulat("Ulat Saddleback", "Amerika Selatan",
                "Ulat ini tergolong unik dengan motif punggungnya yang memang mirip pelana kuda (saddleback). Dibalik kecantikannya, racunnya cukup ganas. Tubuhnya ditumbuhi duri yang tajam dan keras, disitulah saddleback menyimpan racunnya.", R.drawable.ulat_saddleback));
        return ulats;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataUlat(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
