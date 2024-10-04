package com.moonlight.DunkLocate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.view2);  //Tümü
        RecyclerView recyclerView1 = findViewById(R.id.View2);
        RecyclerView recyclerView2 = findViewById(R.id.view3);

        List<SahaVerileri> verilerAdolu = new ArrayList<>();
        List<SahaVerileri> verilerAvrupa = new ArrayList<>();
        List<SahaVerileri> veriler = new ArrayList<>();
        ImageView profilePic = findViewById(R.id.profile_pic);
        profilePic.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view1) {
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            }
        });

        ImageView ballPic = findViewById(R.id.imageView10);
        ballPic.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view1) {
                startActivity(new Intent(MainActivity.this, BallActivity.class));
            }
        });

        veriler.add(new SahaVerileri("50.Yıl Korusu", 40.9408439, 29.1207889, "Maltepe", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Altayçeşme Parkı", 40.9353387, 29.1235769, "Maltepe", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Asım Yıldız Parkı", 41.0873104, 28.934453, "Eyüpsultan", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Aytekin Kotil Parkı", 40.9782044, 28.883308, "Bakırköy", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Azerbaycan Dostluk Parkı", 41.0440673, 28.8527208, "Bağcılar", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Barış Manço Parkı", 41.090000, 28.924097, "Derince", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Baruthane Millet Bahçesi Parkı", 40.9755575, 28.8565637, "Bakırköy", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Başakşehir 2.Etap Koru Parkı", 41.0967158, 28.8084413, "Başakşehir", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Bilal Bozkaya Parkı", 40.987436, 28.866011, "Bakırköy", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Botaş Parkı 2", 40.8893632, 29.2655503, "Pendik", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Bozhane Mahallesi Parkı", 41.1505904, 29.2527889, "Beykoz", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Cihangir Parkı", 41.0316214, 28.9830775, "Beyoğlu", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Çamlık Atatürk Parkı", 40.987268, 28.8668064, "Bakırköy", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Çamlık Parkı", 40.9400287, 29.2136527, "Beyoğlu", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Çırpıcı Şehir Parkı", 40.9997098, 28.8853165, "Zeytinburnu", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Dalyan Parkı", 40.9695176, 29.0484986, "Kadıköy", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Dedeoğlu Parkı", 41.1073608, 29.0843058, "Bahçelievler", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Dedepaşa Parkı", 40.9393348, 29.3084495, "Pendik", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Ataşehir Deprem Parkı", 40.9997299, 29.0921118, "Ataşehir", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Emirgan Korusu", 41.1089267, 29.0429876, "Sarıyer", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Uğur Mumcu Mah. Fatih Sultan Mehmet Parkı", 40.933725, 29.2149354, "Kartal", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Fatih Sultan Mehmet Parkı", 40.9337231, 29.196948, "Fatih", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("FetihPaşa Korusu", 41.032178, 29.0243539, "Üsküdar", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Florya Atatürk Ormanı Parkı", 40.9768634, 28.7844463, "Bakırköy", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Gazi Parkı", 41.0956494, 28.8978773, "Sultangazi", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Kartal Ido Kartal Kumcular Arası Kara Ve Sahil Parkı", 40.9019188, 29.1444983, "Kartal", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Kayaşehir Bölge Parkı", 41.1190912, 28.7767572, "Başakşehir", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Kazlıçeşme Sahil Parkı", 40.9863416, 28.9098189, "Zeytinburnu", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Kıyı Rekreasyon Alanı Parkı", 41.1376088, 29.8494701, "Şile", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Kurbağalıdere Parkı", 40.982008, 29.0329504, "Kadıköy", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Kutlu Doğum Parkı", 41.0791772, 28.9392383, "Gaziosmanpaşa", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Küçükçekmece Gölü Sahil Parkı", 41.0034337, 28.7700035, "Küçükçekmece", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Küçükyalı-İdealtepe Arası Kara Ve Sahil Parkı", 40.9365566, 29.1113769, "Maltepe", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Mehmet Niyazi Özdemir Zeminüstü Parkı", 41.079307, 28.8853952, "Gaziosmanpaşa", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Menekşe Parkı", 41.039195, 28.7703485, "Küçükçekmece", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Mimar Seyfi Arıkan Parkı", 41.0643967, 29.010252, "Şişli", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Muhsin Yazıcıoğlu Parkı", 40.9268412, 29.2146336, "Esenyurt", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Odayeri Mahalle Parkı", 40.9160173, 29.2114987, "Eyüpsultan", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Onurkent Parkı -1", 41.1097056, 28.7829343, "Başahşehir", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Onurkent Parkı -2", 41.1081099, 28.7947708, "Başakşehir", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Orgeneral Nafiz Gürman Parkı", 41.0030555, 28.8841547, "Güngören", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Orhangazi Şehir Parkı / Batı 1", 40.9402533, 29.1078564, "Maltepe", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Osmangazi Parkı", 40.9241845, 29.2940338, "Bağcılar", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Örnekköy Mahalle Parkı", 41.1390213, 29.1435905, "Beykoz", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Özgürlük Parkı", 40.9785063, 29.0532319, "Kadıköy", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Pendik 100. Yıl Parkı", 40.877733, 29.2211965, "Pendik", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Plaj Parkı", 41.1173395, 29.0647391, "Esentepe", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Poligon Parkı", 41.1162682, 29.0408356, "Sarıyer", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Rahmi Demir Kent Ormanı", 41.0379909, 29.1842287, "Çekmeköy", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Safa Tepesi Parkı", 41.0123226, 29.2554032, "Sancaktepe", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Serçeli Parkı", 40.9293353, 29.2114309, "Kartal", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Silahtarağa Parkı", 41.0710985, 28.9434469, "Eyüpsultan", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Söğütlü Parkı", 40.926895, 29.2127664, "Kartal", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Spor Parkı", 41.1240956, 28.7751635, "Başakşehir", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Sultaniye Parkı", 41.1236073, 29.0992167, "Beykoz", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Sururi Parkı", 41.0373313, 28.9715306, "Beyoğlu", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Şalcıkır Parkı", 41.1394846, 29.0459255, "Sarıyer", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Şehit Engin Tilbaç Parkı", 41.0880179, 28.8739348, "Sultangazi", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Şehit Fatih Efiloğlu Parkı", 40.9942889, 29.2727671, "Sultanbeyli", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Şehit Gaffar Okkan Parkı", 40.9343984, 29.2105841, "Küçükçekmece", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Gölet Parkı", 40.9509216, 29.2724919, "Sancaktepe", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Hacı Ahmet Parkı", 41.0435253, 28.9703311, "Beyoğlu", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Hasanoğlu Deresi Parkı", 41.0500822, 28.7546579, "Küçükçekmece", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Hayrettinpaşa Parkı", 40.9329298, 29.2067711, "Maltepe", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Hidayetin Bağı Parkı", 41.1720431, 29.0531083, "Sarıyer", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Hoşdere Millet Parkı", 41.093592, 28.6486996, "Başakşehir", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("İstasyon Mahallesi Parkı", 41.0223334, 28.7617419, "Küçükçekmece", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Kanarya Göl Parkı", 41.0223257, 28.7309066, "Avcılar", R.drawable.loc_icon_item));
        veriler.add(new SahaVerileri("Kanuni Sultan Süleyman Parkı", 40.9457974, 29.1611802, "Maltepe", R.drawable.loc_icon_item));


        verilerAvrupa.add(new SahaVerileri("Asım Yıldız Parkı", 41.0873104, 28.934453, "Eyüpsultan", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Aytekin Kotil Parkı", 40.9782044, 28.883308, "Bakırköy", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Azerbaycan Dostluk Parkı", 41.0440673, 28.8527208, "Bağcılar", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Baruthane Millet Bahçesi Parkı", 40.9755575, 28.8565637, "Bakırköy", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Başakşehir 2.Etap Koru Parkı", 41.0967158, 28.8084413, "Başakşehir", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Bilal Bozkaya Parkı", 40.987436, 28.866011, "Bakırköy", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Cihangir Parkı", 41.0316214, 28.9830775, "Beyoğlu", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Çamlık Atatürk Parkı", 40.987268, 28.8668064, "Bakırköy", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Çamlık Parkı", 40.9400287, 29.2136527, "Beyoğlu", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Çırpıcı Şehir Parkı", 40.9997098, 28.8853165, "Zeytinburnu", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Dedeoğlu Parkı", 41.1073608, 29.0843058, "Bahçelievler", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Emirgan Korusu", 41.1089267, 29.0429876, "Sarıyer", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Fatih Sultan Mehmet Parkı", 40.9337231, 29.196948, "Fatih", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Florya Atatürk Ormanı Parkı", 40.9768634, 28.7844463, "Bakırköy", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Gazi Parkı", 41.0956494, 28.8978773, "Sultangazi", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Kayaşehir Bölge Parkı", 41.1190912, 28.7767572, "Başakşehir", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Kazlıçeşme Sahil Parkı", 40.9863416, 28.9098189, "Zeytinburnu", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Kutlu Doğum Parkı", 41.0791772, 28.9392383, "Gaziosmanpaşa", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Küçükçekmece Gölü Sahil Parkı", 41.0034337, 28.7700035, "Küçükçekmece", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Mehmet Niyazi Özdemir Zeminüstü Parkı", 41.079307, 28.8853952, "Gaziosmanpaşa", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Menekşe Parkı", 41.039195, 28.7703485, "Küçükçekmece", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Mimar Seyfi Arıkan Parkı",41.0643967, 29.010252, "Şişli", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Muhsin Yazıcıoğlu Parkı", 40.9268412, 29.2146336, "Esenyurt", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Odayeri Mahalle Parkı", 40.9160173, 29.2114987, "Eyüpsultan", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Onurkent Parkı -1", 41.1097056, 28.7829343, "Başakşehir", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Onurkent Parkı -2", 41.1081099, 28.7947708, "Başakşehir", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Orgeneral Nafiz Gürman Parkı", 41.0030555, 28.8841547, "Güngören", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Osmangazi Parkı", 40.9241845, 29.2940338, "Bağcılar", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Özgürlük Parkı", 40.9785063, 29.0532319, "Kadıköy", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Pendik 100. Yıl Parkı", 40.877733, 29.2211965, "Pendik", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Silahtarağa Parkı", 41.0710985, 28.9434469, "Eyüpsultan", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Spor Parkı", 41.1240956, 28.7751635, "Başakşehir", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Şalcıkır Parkı", 41.1394846, 29.0459255, "Sarıyer", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Şehit Engin Tilbaç Parkı", 41.0880179, 28.8739348, "Sultangazi", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Şehit Gaffar Okkan Parkı", 40.9343984, 29.2105841, "Küçükçekmece", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Hacı Ahmet Parkı", 41.0435253, 28.9703311, "Beyoğlu", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Hasanoğlu Deresi Parkı", 41.0500822, 28.7546579, "Küçükçekmece", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Hidayetin Bağı Parkı", 41.1720431, 29.0531083, "Sarıyer", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Hoşdere Millet Parkı", 41.093592, 28.6486996, "Başakşehir", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("İstasyon Mahallesi Parkı", 41.0223334, 28.7617419, "Küçükçekmece", R.drawable.loc_icon_item));
        verilerAvrupa.add(new SahaVerileri("Kanarya Göl Parkı", 41.0223257, 28.7309066, "Avcılar", R.drawable.loc_icon_item));


        verilerAdolu.add(new SahaVerileri("50.Yıl Korusu", 40.9408439, 29.1207889, "Maltepe", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Altayçeşme Parkı", 40.9353387, 29.1235769, "Maltepe", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Barış Manço Parkı", 41.090000, 28.924097, "Derince", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Botaş Parkı 2", 40.8893632, 29.2655503, "Pendik", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Bozhane Mahallesi Parkı", 41.1505904, 29.2527889, "Beykoz", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Dalyan Parkı", 40.9695176, 29.0484986, "Kadıköy", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Dedepaşa Parkı", 40.9393348, 29.3084495, "Pendik", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Ataşehir Deprem Parkı", 40.9997299, 29.0921118, "Ataşehir", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Uğur Mumcu Mah. Fatih Sultan Mehmet Parkı", 40.933725, 29.2149354, "Kartal", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("FetihPaşa Korusu", 41.032178, 29.0243539, "Üsküdar", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Kartal Ido Kartal Kumcular Arası Kara Ve Sahil Parkı", 40.9019188, 29.1444983, "Kartal", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Kıyı Rekreasyon Alanı Parkı", 41.1376088, 29.8494701, "Şile", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Kurbağalıdere Parkı", 40.982008, 29.0329504, "Kadıköy", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Küçükyalı-İdealtepe Arası Kara Ve Sahil Parkı", 40.9365566, 29.1113769, "Maltepe", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Orhangazi Şehir Parkı / Batı 1", 40.9402533, 29.1078564, "Maltepe", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Örnekköy Mahalle Parkı", 41.1390213, 29.1435905, "Beykoz", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Plaj Parkı", 41.1173395, 29.0647391, "Esentepe", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Poligon Parkı", 41.1162682, 29.0408356, "Sarıyer", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Rahmi Demir Kent Ormanı", 41.0379909, 29.1842287, "Çekmeköy", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Safa Tepesi Parkı", 41.0123226, 29.2554032, "Sancaktepe", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Serçeli Parkı", 40.9293353, 29.2114309, "Kartal", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Söğütlü Parkı", 40.926895, 29.2127664, "Kartal", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Sultaniye Parkı", 41.1236073, 29.0992167, "Beykoz", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Şehit Fatih Efiloğlu Parkı", 40.9942889, 29.2727671, "Sultanbeyli", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Gölet Parkı", 40.9509216, 29.2724919, "Sancaktepe", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Hayrettinpaşa Parkı", 40.9329298, 29.2067711, "Maltepe", R.drawable.loc_icon_item));
        verilerAdolu.add(new SahaVerileri("Kanuni Sultan Süleyman Parkı", 40.9457974, 29.1611802, "Maltepe", R.drawable.loc_icon_item));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(this, veriler));
        recyclerView1.setLayoutManager((new LinearLayoutManager(this)));
        recyclerView1.setAdapter(new AnadoluYakasiAdapter(this, verilerAdolu));
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        recyclerView2.setAdapter(new AvrupaYakasiAdapter(this, verilerAvrupa));


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}