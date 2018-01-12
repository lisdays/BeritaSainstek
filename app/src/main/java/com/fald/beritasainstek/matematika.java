package com.fald.beritasainstek;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class matematika extends AppCompatActivity {
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matematika);
        // Menginisiasi Toolbar dan mensetting sebagai actionbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Menginisiasi  NavigationView
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        //Mengatur Navigasi View Item yang akan dipanggil untuk menangani item klik menu navigasi
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                //Memeriksa apakah item tersebut dalam keadaan dicek  atau tidak,
                if(menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);
                //Menutup  drawer item klik
                drawerLayout.closeDrawers();
                //Memeriksa untuk melihat item yang akan dilklik dan melalukan aksi
                switch (menuItem.getItemId()){
                    // pilihan menu item navigasi akan menampilkan pesan toast klik kalian bisa menggantinya
                    //dengan intent activity
                    case R.id.navigation1:
                        Toast.makeText(getApplicationContext(), "Berita Telah Dipilih", Toast.LENGTH_SHORT).show();
                        Intent a =new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(a);
                        return true;
                    case R.id.navigation2:
                        Toast.makeText(getApplicationContext(),"Visi Misi Telah Dipilih",Toast.LENGTH_SHORT).show();
                        Intent b =new Intent(getApplicationContext(), VisiMisi.class);
                        startActivity(b);
                        return true;
                    case R.id.navigation3:
                        Toast.makeText(getApplicationContext(),"Senat Telah Dipilih",Toast.LENGTH_SHORT).show();
                        Intent c =new Intent(getApplicationContext(), senat.class);
                        startActivity(c);
                        return true;
                    case R.id.navigation4:
                        Toast.makeText(getApplicationContext(),"Dekanat Telah Dipilih",Toast.LENGTH_SHORT).show();
                        Intent d =new Intent(getApplicationContext(), dekanat.class);
                        startActivity(d);
                        return true;
                    case R.id.navigation5:
                        Toast.makeText(getApplicationContext(),"Tata Usaha telah dipilih",Toast.LENGTH_SHORT).show();
                        Intent e =new Intent(getApplicationContext(), TataUsaha.class);
                        startActivity(e);
                        return true;
                    case R.id.navigation6:
                        Toast.makeText(getApplicationContext(),"Matematika telah dipilih",Toast.LENGTH_SHORT).show();
                        Intent f =new Intent(getApplicationContext(), matematika.class);
                        startActivity(f);
                        return true;
                    case R.id.navigation7:
                        Toast.makeText(getApplicationContext(),"Biologi telah dipilih",Toast.LENGTH_SHORT).show();
                        Intent g =new Intent(getApplicationContext(), biologi.class);
                        startActivity(g);
                        return true;
                    case R.id.navigation8:
                        Toast.makeText(getApplicationContext(),"Fisika telah dipilih",Toast.LENGTH_SHORT).show();
                        Intent h =new Intent(getApplicationContext(), fisika.class);
                        startActivity(h);
                        return true;
                    case R.id.navigation9:
                        Toast.makeText(getApplicationContext(),"Kimia telah dipilih",Toast.LENGTH_SHORT).show();
                        Intent i =new Intent(getApplicationContext(), kimia.class);
                        startActivity(i);
                        return true;
                    case R.id.navigation10:
                        Toast.makeText(getApplicationContext(),"Teknik Informatika telah dipilih",Toast.LENGTH_SHORT).show();
                        Intent j =new Intent(getApplicationContext(), informatika.class);
                        startActivity(j);
                        return true;
                    case R.id.navigation11:
                        Toast.makeText(getApplicationContext(),"Agroteknologi telah dipilih",Toast.LENGTH_SHORT).show();
                        Intent k =new Intent(getApplicationContext(), agrotek.class);
                        startActivity(k);
                        return true;
                    case R.id.navigation12:
                        Toast.makeText(getApplicationContext(),"Teknik Elektro telah dipilih",Toast.LENGTH_SHORT).show();
                        Intent l =new Intent(getApplicationContext(), elektro.class);
                        startActivity(l);
                        return true;
                    case R.id.navigation13:
                        Toast.makeText(getApplicationContext(),"About telah dipilih",Toast.LENGTH_SHORT).show();
                        Intent m =new Intent(getApplicationContext(), about.class);
                        startActivity(m);
                        return true;
                    default:
                        Toast.makeText(getApplicationContext(),"Kesalahan Terjadi ",Toast.LENGTH_SHORT).show();
                        return true;
                }
            }
        });
        // Menginisasi Drawer Layout dan ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openDrawer, R.string.closeDrawer){
            @Override
            public void onDrawerClosed(View drawerView) {
                // Kode di sini akan merespons setelah drawer menutup disini kita biarkan kosong
                super.onDrawerClosed(drawerView);
            }
            @Override
            public void onDrawerOpened(View drawerView) {
                //  Kode di sini akan merespons setelah drawer terbuka disini kita biarkan kosong
                super.onDrawerOpened(drawerView);
            }
        };
        //Mensetting actionbarToggle untuk drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        //memanggil synstate
        actionBarDrawerToggle.syncState();
    }
}
