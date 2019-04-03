package com.example.myproject;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class trangchinh extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewFlipper viewFlipper;
    private ListView listView;
    private TextView textView;
    private RecyclerView recyclerViewmanhinhchinh;
    private NavigationView navigationViewmanhinhchinh;
    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchinh);
        getControl();
        //getEvent();
        ActionBar();
        ActionViewFlipper();
    }

    //chay quang cao
    private void ActionViewFlipper() {
        ArrayList<String> mangquangcao = new ArrayList<>();
        mangquangcao.add("https://tinhte.cdnforo.com/store/2014/08/2572609_Hinh_2.jpg");
        mangquangcao.add("https://tinhte.cdnforo.com/store/2014/08/2572609_Hinh_2.jpg");
        mangquangcao.add("https://tinhte.cdnforo.com/store/2014/08/2572609_Hinh_2.jpg");
        mangquangcao.add("https://tinhte.cdnforo.com/store/2014/08/2572609_Hinh_2.jpg");
        for(int i = 0; i < mangquangcao.size();i++)
        {
            ImageView imageView = new ImageView(getApplicationContext());
            Picasso.with(getApplicationContext()).load(mangquangcao.get(i)).into(imageView);
            imageView.setScaleType(imageView.getScaleType().FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(5000);
        viewFlipper.setAutoStart(true);
        Animation animation_slide_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_right);
        Animation animation_slide_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_out_right);
        viewFlipper.setInAnimation(animation_slide_in);
        viewFlipper.setOutAnimation(animation_slide_out);
    }
    //menu actionbar
    private void ActionBar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(android.R.drawable.ic_menu_sort_by_size);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

    }

    private void setEvent() {

    }

    private void getControl() {
        toolbar = (Toolbar) findViewById(R.id.toolbarmanhinhchinh);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewflipper);
        recyclerViewmanhinhchinh = (RecyclerView) findViewById(R.id.recyclerview);
        navigationViewmanhinhchinh = (NavigationView)findViewById(R.id.navigationview);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.idshare:
                share();
                return true;
            case  R.id.addtocard:
                addtocard();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void share(){Toast.makeText(this,"Search",Toast.LENGTH_SHORT).show();}
    public void addtocard(){Toast.makeText(this,"Add to card",Toast.LENGTH_SHORT).show();}
}
