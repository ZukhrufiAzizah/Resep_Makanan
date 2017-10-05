package zukhrufi.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Resep> resepList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ResepAdapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv_main);

        mAdapter = new ResepAdapter(this,resepList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        preparResepData();
    }

   public void preparResepData() {
        Resep resep = new Resep("Ayam Geprek", R.drawable.ayamgeprek
                , "Makanan murah meriah", "\nBahan-bahan :\n\n"
                + "\t- Bahan ungkep ayam \n"
                +"\t- 1 kg ayam \n"
                +"\t- 1 ruas kunyit \n"
                +"\t- 1 ruas jahe \n"
                +"\t- 3 bawang putih \n"
                +"\t- Garam kasar \n"
                +"\t- Bahan adonan ayam \n"
                +"\t- 1 bugkus tepung bumbu serbaguna \n"
                +"\t- 1/3 ladaku bubuk \n"
                +"\t- Garam halus/ kaldu bubuk \n"
                +"\t- 2 sendok tepung beras \n"
                +"\t- Air dingin \n\n"
                +"\tBahan sambal: \n\n"
                +"\t- 30 biji cabe rawit merah \n"
                +"\t(sesuai aj suka pedes atau ngak) \n"
                +"\t- 3 siung bawang putih \n"
                +"\t- 1 siung bawang merah \n"
                +"\t- Garam,gula \n" + "\n\n" + "cara membuat : \n\n"
               +"\t1. Ungkep ayam, sblm nya bahan ungkep ayam di haluskan lalu ungkep sampai matang \n"
               +"\t2. dengan menunggu ungkepan siap, siapkan tepung bumbu ambil sdkit tepung \tbumbu pisahkan, campur \n"
               +"\tdgn air es/dingin lalu di piring yg lain tepung bumbu yg di campur dgn tepung beras dll \n"
               +"\t3. Setelah ayam mateng angky dan tiriskan masukan ayam ke adonan cair, sebelum di goreng ayamnya cuci \n"
               +"\tcabe nt dlu.. \n"
               +"\t4. Setelah cuci cabe goreng sbntr cabe, bawang dgn minyak pnas sbntr saja lalu giling smpe halus. \n"
               +"\t5. Setelah mmbuat sambal nya goreng ayam campurkan dgn adonan basah dan kering berulang kali. Sehinga \n"
               +"\tmateng barulah d angkt dan tiriskan. \n"
               +"\t6. Siram sambal tdi dgn minyak panas bekas goreng ayam sudh d siram lalu geprek ayam smpe halus kalau mau \n"
               +"\tcpt halus d suwir suwir dulu bisa. ");
       resepList.add(resep);
       resep = new Resep("Bakwan Jagung", R.drawable.bakwanjagung,
               "Mantap", "Bahan-bahan :\n\n"
               +"\t6 buah jagung manis (di pipil) \n"
               +"\tdaun bawang secukupnya \n"
               +"\t5 sdm tepung terigu \n"
               +"\t1 sdm tepung beras \n"
               +"\t2 buah Cabai merah \n"
               +"\t1 butir telur ayam \n"
               +"\t3 siung bawang putih, haluskan \n"
               +"\tgaram secukupnya \n"
               +"\tmerica secukupnya \n\n" + "cara membuat : \n\n"
               +"\t1. Campur pipilan jagung manis, irisan daun bawang dan irisan cabai. \n"
               +"\t2. Tambahkan tepung terigu, tepung beras dan air secukupnya. \n"
               +"\t3. Aduk rata, dan tambahkan bumbu bawang putih, merica dan garam, koreksi rasa. \n"
               +"\t4. Tambahkan telur ayam yg sudah d kocok, aduk rata dan goreng. \n");
       resepList.add(resep);
       resep = new Resep("Martabak Mie", R.drawable.martabakmie,
               "Sedaaaaap", "Bahan-bahan :\n\n"
               +"\t1 bungkus mie instan,rebus dan tiriskan lalu campur dg bumbu mie \n"
               +"\t2 telur ayam \n"
               +"Cincangan daun seledri \n"
               +"1 sdm Kornet\n\n" + "cara membuat : \n\n"
               +"\t1. Kocok 2 telur, lalu masukkan mie, seledri dan kornet. Aduk sampai rata. Jgn lupa koreksi rasa. \n"
               +"\t2. Panaskan minyak dan tuang adonan. \n"
               +"\t3. Jika bagian bawahnya sudah kecoklatan, balik omeletnya. \n"
               +"\t4. Kalo saya: caranya baliknya, saya angkat dan taruh dlu di piring lalu saya taruh lagi sisi yg belum \n"
               +"\tmatang ke teflon. Jadi ngga patah \n"
               +"\t5. Jika dirasa sudah matang kedua sisinya, angkat dan sajikan.. *potong2 biar ngambilnya mudah \n");
       resepList.add(resep);
       resep = new Resep("Nasi Goreng", R.drawable.nasigoreng,
               "pedassss", "Bahan-bahan :\n\n"
               +"1 piring nasi \n"
               +"1 siung bawang merah \n"
               +"15 cabai rawit\n"
               +"1 buah sosis \n"
               +"1 buah telur \n"
               +"sawi secukupnya \n"
               +"1 sdm kecap manis \n"
               +"garam dan penyedap secukupnya \n\n" + "cara membuat :\n\n"
               +"1. Ceplok telur. \n"
               +"2. Iris bawang merah,cabe rawit,sosis dan sawi. \n"
               +"3. Panaskan sedikit minyak. Masukan sosis,goreng hingga agak mengembang. \n"
               +"4. Masukan irisan bawang merah,cabe rawit dan sawi. Oseng2 hingga agak layu. \n"
               +"5. Masukan nasi,aduk. bubuhi dengan 1 sdm kecap(sesuai selera),garam dan penyedap secukupnya. \n"
               +"6. Aduk hingga tercampur rata.\n");
       resepList.add(resep);
       resep = new Resep("Soup Ayam", R.drawable.soupayam,
               "yummy", "Bahan-bahan :\n\n"
               +"6 potong ayam \n"
               +"1 buah brocoli \n"
               +"2 buah tomat \n"
               +"2 buah wortel \n"
               +"2 siung bawang merah \n"
               +"2 siung bawang putih \n"
               +"1 sdt merica \n"
               +"1 sdt garam \n"
               +"1/2 sdt mecin \n"
               +"masako ayam secukupnya \n"
               +"bawang merah goreng secukupnya \n\n" + "cara membuat :\n\n"
               +"1. Rebus ayam (tidak direbus juga tidak apa\" ini karena saya tidak suka memakai kaldu ayamnya. \n"
               +"2. Potong semua bahan,,dan tumis bawang merah,bawang putih. \n"
               +"3. Masukkan air dan ayamnya...rebus hingga dirasa ayam hampir matang tambahkan semua bumbu. \n"
               +"4. Masukkan wortel,brocoli jika agak layu masukkan tomat. \n"
               +"5. Tes rasa jika sudah pas angkat sajikan taburi bawang goreng. ");
       resepList.add(resep);
       mAdapter.notifyDataSetChanged();
    }


}