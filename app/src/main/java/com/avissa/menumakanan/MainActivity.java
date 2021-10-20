package com.avissa.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> hargaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();

    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, hargaMakanan, infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private void getDataFromInternet(){

        namaMakanan.add("Mie Aceh");
        fotoMakanan.add("https://salamadian.com/ezoimgfmt/i1.wp.com/salamadian.com/wp-content/uploads/2020/05/makanan-khas-daerah-1.jpg?w=546&ssl=1&ezimgfmt=ng:webp/ngcb2");
        hargaMakanan.add("Rp 25.000/porsi");
        infoMakanan.add("Provinsi di ujung Pulau Sumatra ini memiliki banyak makanan khas, tetapi yang paling populer adalah mi Aceh. Ada tiga jenis mi aceh, yaitu mi aceh tumis, mi aceh goreng basah, dan mi aceh kuah. Cita rasanya sangat menggugah selera karena diracik dengan bumbu khas Tanah Rencong. Keistimewaan makanan ini terletak pada ukuran mi-nya yang lebih besar dari biasa dan bumbunya sangat kaya akan rempah. Mi disajikan bersama daging, kepiting, atau udang, dilengkapi kerupuk melinjo (emping) serta acar bawang merah dan mentimun.");

        namaMakanan.add("Surabi Bandung");
        fotoMakanan.add("https://salamadian.com/ezoimgfmt/i2.wp.com/salamadian.com/wp-content/uploads/2020/05/makanan-khas-daerah-13.jpg?w=645&ssl=1&ezimgfmt=ng:webp/ngcb2.");
        hargaMakanan.add("Rp 20.000/porsi");
        infoMakanan.add("Jawa Barat, khususnya Bandung, merupakan salah satu tujuan wisata kuliner yang banyak diincar para pemburu kelezatan. Salah satu jajanan khas Sunda yang cukup populer adalah surabi atau serabi, yang terbuat dari tepung beras dan santan yang dibakar menggunakan tungku dan cetakan dari tanah liat. Seiring dengan kepopulerannya, surabi kini tidak hanya punya rasa orisinal atau rasa oncom yang gurih dan legit. Para penjual surabi berkreasi membuat varian topping baru dengan sensasi rasa kekinian, seperti keju, coklat, durian, stroberi, kacang, dan sebagainya sehingga cocok untuk segala selera.");

        namaMakanan.add("Gulai Ikan Patin Jambi");
        fotoMakanan.add("https://salamadian.com/ezoimgfmt/i0.wp.com/salamadian.com/wp-content/uploads/2020/05/makanan-khas-daerah-6.jpg?w=571&ssl=1&ezimgfmt=ng:webp/ngcb2");
        hargaMakanan.add("Rp 30.000/porsi");
        infoMakanan.add("Provinsi Jambi juga memiliki makanan khas yang tak kalah enak, yakni gulai ikan patin. Gulai ini punya rasa yang unik karena menggunakan tempoyak atau daging durian yang difermentasi. Dijamin, para pecinta durian pasti akan jatuh cinta pada masakan ini. Namun, Anda yang tidak suka durian juga tidak perlu khawatir. Anda juga bisa ikut menikmati gurihnya gulai ikan patin ini karena sekarang banyak yang mengganti tempoyak dengan santan. Jadi, saat berkunjung ke Jambi, jangan lupa mencicipi masakan ini.");

        namaMakanan.add("Kerak Telor Jakarta");
        fotoMakanan.add("https://salamadian.com/ezoimgfmt/i2.wp.com/salamadian.com/wp-content/uploads/2020/05/makanan-khas-daerah-11.jpg?w=680&ssl=1&ezimgfmt=ng:webp/ngcb2");
        hargaMakanan.add("Rp 7.000/porsi");
        infoMakanan.add("Kerak telor, itulah jajanan khas kebanggaan masyarakat Betawi. Makanan yang bercita rasa gurih ini dimasak dengan cara yang sangat unik. Telur dimasukkan ke wajan tanpa minyak, lalu setelah setengah matang, wajan dibalik ke arah anglo sampai menjadi kerak. Selanjutnya, kerak telor ditaburi bumbu yang dibuat dari beras ketan, telur, ebi, yang disangrai kering dan ditambah bawang goreng dan bumbu halus berupa kelapa sangrai, cabai merah, kencur, jahe, merica, garam, dan gula. Aroma khas dari anglo membuat kerak telor makin nikmat.");

        namaMakanan.add("Rendang Padang");
        fotoMakanan.add("https://salamadian.com/ezoimgfmt/i2.wp.com/salamadian.com/wp-content/uploads/2020/05/makanan-khas-daerah-5.jpg?w=618&ssl=1&ezimgfmt=ng:webp/ngcb2");
        hargaMakanan.add("Rp 30.000/porsi");
        infoMakanan.add("Rendang yang berasal dari Padang dibuat dari daging sapi yang dimasak dengan berbagai macam bumbu rempah dan santan sehingga menghasilkan rasa yang sangat khas. Proses memasak yang lama tak hanya membuat daging jadi empuk, bumbunya pun meresap kuat dan rendang jadi lebih awet. Konon, rendang berawal dari kebiasaan merantau orang Minang. Sebagai bekal perjalanan, mereka membawa daging yang dimasak hingga berwarna hitam sehingga lebih tahan lama.");

        namaMakanan.add("Pempek Palembang");
        fotoMakanan.add("https://salamadian.com/ezoimgfmt/i2.wp.com/salamadian.com/wp-content/uploads/2020/05/makanan-khas-daerah-9.jpg?w=612&ssl=1&ezimgfmt=ng:webp/ngcb2");
        hargaMakanan.add("Rp 17.000/porsi");
        infoMakanan.add("Bisa dibilang, pempek sudah menjadi makanan nasional karena hampir semua orang tahu dan menyukainya. Makanan khas Palembang Sumsel ini dibuat dari daging ikan belida dan tepung sagu serta bumbu-bumbu, kemudian dibentuk dan direbus. Di tempat asalnya, pempek terdiri dari banyak jenis, seperti adaan, lenjer, kapal selam, telur, lenggang, panggang, keriting, pistel, dos, bahkan ada juga pempek dari kulit ikan. Pempek bisa dimakan langsung bersama kuah cuko yang memiliki rasa asam-pedas, atau digoreng lebih terlebih dahulu.");

        namaMakanan.add("Lumpia Semarang");
        fotoMakanan.add("https://salamadian.com/ezoimgfmt/i1.wp.com/salamadian.com/wp-content/uploads/2020/05/makanan-khas-daerah-14.jpg?w=638&ssl=1&ezimgfmt=ng:webp/ngcb2");
        hargaMakanan.add("Rp 15.000/porsi");
        infoMakanan.add("Lumpia khas Ibukota Jawa Tengah ini berbeda dari lumpia kebanyakan yang biasa dijual di tukang gorengan pinggir jalan. Ada dua jenis lumpia yang biasa dijual, yaitu lumpia goreng dan basah yang dua-duanya sama nikmatnya. Lumpia terdiri dari kulit yang dibuat dari adonan tepung dan telur yang didadar dan adonan isi yang terdiri dari udang dan rebung yang dibumbui. Tak hanya lumpianya, sausnya pun lain dari yang lain, dibuat dari gula merah, cuka, serta bumbu-bumbu dan dikentalkan dengan tepung maizena.");

        namaMakanan.add("Rujak Cingur Surabaya");
        fotoMakanan.add("https://salamadian.com/ezoimgfmt/i1.wp.com/salamadian.com/wp-content/uploads/2020/05/makanan-khas-daerah-15.jpg?w=546&ssl=1&ezimgfmt=ng:webp/ngcb2");
        hargaMakanan.add("Rp 12.000/porsi");
        infoMakanan.add("Rujak adalah makanan yang biasanya terdiri dari irisan buah-buahan yang dicampur dengan sambal. Namun, ada yang berbeda dengan rujak cingur, makanan khas Surabaya, Jatim. Tak hanya buah dan sayuran, rujak ini menggunakan cingur atau moncong sapi sebagai salah satu bahannya. Seporsi rujak cingur berisi mentimun, kerahi, mangga muda, kedondong, nanas, bengkuang, kangkung, kacang panjang, taoge, cingur, serta irisan lontong yang disiram saus. Sausnya pun sangat khas karena mengandung petis udang. Sebagai pelengkap, rujak cingur ditaburi kerupuk.");

        namaMakanan.add("Gudeg DI Yogyakarta");
        fotoMakanan.add("https://salamadian.com/ezoimgfmt/i2.wp.com/salamadian.com/wp-content/uploads/2020/05/makanan-khas-daerah-16.jpg?w=614&ssl=1&ezimgfmt=ng:webp/ngcb2");
        hargaMakanan.add("Rp 14.000/porsi");
        infoMakanan.add("Salah satu agenda yang tak boleh dilewatkan saat datang ke Yogyakarta adalah makan gudeg. Makanan ini dibuat dari nangka muda yang dimasak dengan santan dan bumbu selama berjam-jam hingga empuk. Gudeg disajikan bersama sambal goreng krecek, telur pindang, dan ayam, lalu disiram santan areh. Ada tiga macam gudeg, yaitu gudeg basah yang disajikan dengan sedikit kuah santan, gudeg kering yang dimasak lebih lama, dan gudeg manggar (bunga kelapa). Gudeg basah dan kering masih bisa ditemukan dengan mudah, tetapi gudeg manggar kini makin langka karena keterbatasan manggar.");

        namaMakanan.add("Papeda Papua");
        fotoMakanan.add("https://salamadian.com/ezoimgfmt/i0.wp.com/salamadian.com/wp-content/uploads/2020/05/makanan-khas-daerah-31.jpg?w=617&ssl=1&ezimgfmt=ng:webp/ngcb2");
        hargaMakanan.add("Rp 12.000/porsi");
        infoMakanan.add("Papeda atau Bubur sagu khas Papua juga merupakan salah satu kuliner yang sudah cukup terkenal. Papeda dibuat dari tepung sagu yang berasal dari batang pohon sagu tua yang diparut dan diambil sari patinya. Makanan ini biasanya disajikan pada acara-acara khusus. Akan tetapi, papeda sekarang bisa dimakan kapan saja. Bubur bertekstur lembek dan lengket ini tidak memiliki rasa sehingga harus disantap dengan lauk seperti ikan kuah kuning, sayur ganemo, sayur tagas-tagas atau anuve habre.");

        prosesRecyclerViewAdapter();

    }

}