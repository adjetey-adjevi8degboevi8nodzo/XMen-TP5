package fr.ucaolan.xmen;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import fr.ucaolan.xmen.databinding.XMenBinding;

public class XMenViewHolder extends RecyclerView.ViewHolder {

    private final XMenBinding ui;

    private  XMenAdapter.OnItemClickListener onItemClickListener;


    public XMenViewHolder(@NonNull XMenBinding ui) {
        super(ui.getRoot());
        this.ui = ui;

        itemView.setOnClickListener(this::onClick);
    }

    private void onClick(View v){
        if(onItemClickListener != null)
            onItemClickListener.onItemClick(getAdapterPosition());
    }

    public void setXMen(XMen xmen){
        ui.nom.setText(xmen.getNom());
        ui.alias.setText(xmen.getAlias());
        ui.pouvoir.setText(xmen.getPouvoirs());
        ui.description.setText(xmen.getDescription());
        ui.image.setImageResource(xmen.getIdImage());
    }

    public void setOnItemClickListener(XMenAdapter.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }


}
