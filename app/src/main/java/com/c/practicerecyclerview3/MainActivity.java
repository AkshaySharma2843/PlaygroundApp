package com.c.practicerecyclerview3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.c.practicerecyclerview3.model.Avengers;
import com.c.practicerecyclerview3.model.DC;
import com.c.practicerecyclerview3.ui.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        createData();



    }

    private void createData() {
        ArrayList<Object> allHeroes = new ArrayList<>();
        allHeroes.add(new Avengers("Tony Stark","Iron Armer and Mind","Stark Industries","Top Tier"));
        allHeroes.add(new Avengers("Steve Roger","Shield","Army Man","Top Tier"));
        allHeroes.add(new DC("Super Man","Clark Kent","Super Power(kryptonian)","https://upload.wikimedia.org/wikipedia/en/3/35/Supermanflying.png"));
        allHeroes.add(new Avengers("Thor","Thunder","Asgard","Top Tier"));
        allHeroes.add(new DC("Bat Man","Bruce Wayne","Bat-Armor","https://kids.kiddle.co/Image:Batman_(circa_2016).png"));
        allHeroes.add(new Avengers("Dr. Baner","Hulk","Kolkata","Top Tier"));
        allHeroes.add(new DC("Aqua-man","Arthur Joseph Curry","Telepathy","https://pics.filmaffinity.com/aquaman-355320736-large.jpg"));
        allHeroes.add(new Avengers("Hawkeye","Bow and Arrow","Shield","Middle Tier"));
        allHeroes.add(new Avengers("Natasha","Black Widow(Flexiable)","Shield","Middle Tier"));
        allHeroes.add(new Avengers("Dr. Stephen Strange","Magic","Kathmandu","Top Tier"));
        allHeroes.add(new Avengers("King T-chala","Black Panther","Wakanda","Top Tier"));
        allHeroes.add(new DC("Star Girl","Courtney Whitmore","Super Power","https://wallpapercave.com/wp/wp6344355.jpg"));
        allHeroes.add(new Avengers("Nick Fury","Army Man","Shield","Director"));
        allHeroes.add(new DC("wonder Woman","Princess Diana","Super Human Strength","https://dc.fandom.com/wiki/Superman?file=Superman_Vol_5_1_Textless.jpg"));
        allHeroes.add(new Avengers("Peter Parker","Spider Man","New York","Low Tier"));
        allHeroes.add(new Avengers("Wanda","Witch","A-Base","Low Tier"));
        allHeroes.add(new DC("The Flash","Barry Allen","Speed","https://en.wikipedia.org/wiki/The_Flash_(season_3)#/media/File:The_Flash_season_3.jpg"));
        allHeroes.add(new Avengers("Carol Danvers","Captain Marvel","Galaxy","Top Tier"));
        allHeroes.add(new Avengers("Thanos","Not-Reveled","Titan","Villain(Top Tier)"));
        allHeroes.add(new Avengers("Loki","God Of Mischief","Asgard","Middle Tier"));
        allHeroes.add(new Avengers("Hela","Not-Reveled","Asgard Prision","Villain(Top Tier)"));
        allHeroes.add(new Avengers("Vision","A.I. Robot","A-Base","Middle Tier"));
        allHeroes.add(new Avengers("Star-Lord","Half Human & Half Alien","Galaxy","Low Tier"));
        allHeroes.add(new Avengers("Rocket","Engineer","Galaxy","Low Tier"));
        allHeroes.add(new Avengers("Gamora","Alien","Galaxy","Low Tier"));
        allHeroes.add(new Avengers("Groot","Tree Man","Galaxy","Middle tier"));
        allHeroes.add(new Avengers("Drax","Super Human","Galaxy","Low Tier"));
        allHeroes.add(new Avengers("Nebula","Android","Galaxy","Low Tier"));
        allHeroes.add(new Avengers("Ant-Man","Shape Change","New York","Middle Tier"));
        allHeroes.add(new Avengers("The Wasp","Shape Change & Engineer","New York","Middle Tier"));
        allHeroes.add(new Avengers("Bucky","Winter Soldier","New York","Middle Tier"));
        allHeroes.add(new Avengers("James Rodes","War Machine","New York","Low Tier"));
        allHeroes.add(new Avengers("Sam Wilson","Falcon","New York","Low Tier"));
        allHeroes.add(new DC("The Arrow","Oliver Jonas Queen","Bow-Arrow","https://s31242.pcdn.co/wp-content/uploads/2019/05/arrow3-1024x578.jpg"));
        allHeroes.add(new DC("Green Lantern","Alan Scott","Magic Ring","https://vignette.wikia.nocookie.net/one-minute-meelee-fanon/images/7/7d/Green_Lantern.png/revision/latest?cb=20190616220051"));
        allHeroes.add(new DC("Cat Woman","Adam","Super Strength","https://en.wikipedia.org/wiki/Catwoman_(film)#/media/File:Catwoman_poster.jpg"));
        allHeroes.add(new DC("Black Adam","","","https://cdn3.movieweb.com/i/movie/zFQ2rggtR2Fa6Gxh2VDcJw6MX7IRGb/460:50/Black-Adam.jpg"));
        allHeroes.add(new DC("Shazam","Billy Batson","Magic Power","https://cdn.vox-cdn.com/thumbor/Q_0uTqW1maZ0ABsS1shiMwjdZ64=/0x0:2040x1360/1820x1024/filters:focal(866x270:1192x596):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/63284729/jbareham_190322_0861_shazam_0003.0.jpg"));
        allHeroes.add(new DC("Cyborg","Victor Stone","Half Robot","https://injustice.fandom.com/wiki/Cyborg?file=Injustice2Cyborg.jpg"));
        allHeroes.add(new DC("Joker","Arthur Fleck","Mind","https://comicvine1.cbsistatic.com/uploads/scale_small/12/124259/7538232-three-jokers-1-cvr-fnl-1583776056592.jpg"));
        allHeroes.add(new DC("Harley Quinn","Dr. Harleen Quinzel","","https://i0.wp.com/batman-news.com/wp-content/uploads/2017/01/Margot-Robbie-Harley-Quinn.jpg?w=750&quality=80&strip=info&ssl=1"));
        allHeroes.add(new DC("Super Girl","Kara Zor-El","Super Strength","https://en.wikipedia.org/wiki/Supergirl_(TV_series)#/media/File:BenoistSupergirl.jpg"));

        drawRecycler(allHeroes);
    }

    private void drawRecycler(ArrayList<Object> allHeroes) {
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setAdapter(new MyAdapter(allHeroes));
    }

    private void initView() {
        recyclerView  = findViewById(R.id.recV);
    }
}