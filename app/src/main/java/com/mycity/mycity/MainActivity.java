package com.mycity.mycity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
TextView City_More,Event_More,Tourism_More,App_More,News_More;
LinearLayout city_1,city_2,city_3,city_4,tourism_1,tourism_2,tourism_3,tourism_4,tourism_5,tourism_6;
CardView eventcardview_1,eventcardview2,eventcardview3,eventcardview4,eventcardview5,NewsCardView1,NewsCardView2,NewsCardView3,NewsCardView4,NewsCardView5;
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<ImageModel> imageModelArrayList;

    private int[] myImageList = new int[]{R.drawable.e2, R.drawable.e3,
            R.drawable.e1,R.drawable.e2
            ,R.drawable.e3,R.drawable.e4};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        City_More=findViewById(R.id.City_More_TextView);
        City_More.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,city_more_list_item.class)) ;
            }
        }));


        city_1=findViewById(R.id.city_name1_LL);
        city_1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        }));
        city_2=findViewById(R.id.city_name2_LL);
        city_2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }));
        city_3=findViewById(R.id.city_name3_LL);
        city_3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }));
        city_4=findViewById(R.id.city_name4_LL);
        city_4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }));

        Event_More=findViewById(R.id.Events_More_TextView);
        Event_More.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,events_more_list_item.class)) ;
            }
        }));



        eventcardview_1=findViewById(R.id.cardview1);
        eventcardview_1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,events_more_list_item.class)) ;
            }
        }));
        eventcardview2=findViewById(R.id.cardview2);
        eventcardview2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,events_more_list_item.class)) ;
            }
        }));
        eventcardview3=findViewById(R.id.cardview3);
        eventcardview3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,events_more_list_item.class)) ;
            }
        }));
        eventcardview4=findViewById(R.id.cardview4);
        eventcardview4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,events_more_list_item.class)) ;
            }
        }));
        eventcardview5=findViewById(R.id.cardview5);
        eventcardview5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,events_more_list_item.class)) ;
            }
        }));


        Tourism_More=findViewById(R.id.Tourism_More_TextView);
        Tourism_More.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,tourism_more_list_item.class)) ;
            }
        }));


        tourism_1=findViewById(R.id.tourism_name1_LL);
        tourism_1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,tourism_more_list_item.class)) ;
            }
        }));

        tourism_2=findViewById(R.id.tourism_name2_LL);
        tourism_2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,tourism_more_list_item.class)) ;
            }
        }));

        tourism_3=findViewById(R.id.tourism_name3_LL);
        tourism_3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,tourism_more_list_item.class)) ;
            }
        }));

        tourism_4=findViewById(R.id.tourism_name4_LL);
        tourism_4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,tourism_more_list_item.class)) ;
            }
        }));

        tourism_5=findViewById(R.id.tourism_name5_LL);
        tourism_5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,tourism_more_list_item.class)) ;
            }
        }));

        tourism_6=findViewById(R.id.tourism_name6_LL);
        tourism_6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,tourism_more_list_item.class)) ;
            }
        }));


        App_More=findViewById(R.id.Apps_More_TextView);
        App_More.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,app_more_list_item.class)) ;
            }
        }));



        News_More=findViewById(R.id.News_More_TextView);
      News_More.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,news_more_list_item.class)) ;
            }
        }));


        NewsCardView1=findViewById(R.id.news_cardview1);
        NewsCardView1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,news_more_list_item.class)) ;
            }
        }));
        NewsCardView2=findViewById(R.id.news_cardview2);
        NewsCardView2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,news_more_list_item.class)) ;
            }
        }));
        NewsCardView3=findViewById(R.id.news_cardview3);
      NewsCardView3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,news_more_list_item.class)) ;
            }
        }));
        NewsCardView4=findViewById(R.id.news_cardview4);
        NewsCardView4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,news_more_list_item.class)) ;
            }
        }));
        NewsCardView5=findViewById(R.id.news_cardview5);
        NewsCardView5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,news_more_list_item.class)) ;
            }
        }));





        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        imageModelArrayList = new ArrayList<>();
        imageModelArrayList = populateList();

        init();



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    private ArrayList<ImageModel> populateList(){

        ArrayList<ImageModel> list = new ArrayList<>();

        for(int i = 0; i < 6; i++){
            ImageModel imageModel = new ImageModel();
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);

        }

        return list;
    }
    private void init() {

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new SlidingImage_Adapter(MainActivity.this,imageModelArrayList));

        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES =imageModelArrayList.size();

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menusearch) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
