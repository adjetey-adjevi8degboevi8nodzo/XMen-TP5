package fr.ucaolan.xmen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import fr.ucaolan.xmen.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding ui;
    private  List<XMen> liste;
    private  XMenAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        XMenApplication application = (XMenApplication) getApplication();
         liste = application.getListe();

         adapter = new XMenAdapter(liste);

         adapter.setOnItemClickListener(this::onItemClick);

        ui.recycler.setAdapter(adapter);

        ui.recycler.setHasFixedSize(true);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        ui.recycler.setLayoutManager(lm);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        ui.recycler.addItemDecoration(dividerItemDecoration);
    }

    private void onItemClick(int position){
        XMen xmen = liste.get(position);

        xmen.setIdImage(R.drawable.undef);
        adapter.notifyItemChanged(position);
    }
}